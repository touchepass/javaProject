package DAO;

import java.sql.*;
import java.util.ArrayList;

import Classe.CBalade;
import Classe.CCalendrier;
import Classe.CVehicule;

public class DBalade extends DAO<CBalade> {
	
	public DBalade() {	}
	
	@Override
	public boolean create(CBalade obj){		
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate(
					"INSERT INTO Balade (rue, numRue,localite,codePostal,forfait,dateBalade)" + 
					" VALUES ("+obj.getRue()+", "+obj.getNumRue()+" , "+obj.getLocalite()+" , "+obj.getCodePostal()+","+obj.getForfait()+" , "+obj.getDate()+");" 
					);
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean create(CBalade obj, CVehicule vehicle) {		
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate(
					"INSERT INTO ListeBaladeVehicule (IdBalade, IdVehicule)" + 
					" VALUES ("+obj.getIdBalade()+", "+ vehicle.getIdVehicule() +");" 
					);
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean delete(CBalade obj){
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate("DELETE FROM Balade WHERE IdBalade = "+obj.getIdBalade()+";");
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean update(CBalade obj){
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate("UPDATE Balde SET"
					+ " rue = "+obj.getRue()+", numRue = "+obj.getNumRue()
					+ "	localite = "+obj.getLocalite()+" codePostal = "+obj.getCodePostal()
					+ " forfait = "+obj.getForfait()+" dateBalade = "+obj.getDate()
					+ " WHERE IdBalade = "+obj.getIdBalade()+";");
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public CBalade find(Object obj) {
		CBalade a = null;
		
		try{
			int IdB = (Integer)obj;
			
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet result = stmt.executeQuery("select * from Balade where IdBalade= "+IdB+";" );
			if(result.first()) { 
				a = new CBalade(result.getInt("IdBalade"),
						result.getString("rue"),result.getString("numRue"),
						result.getString("localite"),result.getString("codePostal"),
						result.getInt("forfait"),result.getDate("dateBalade"));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return a;
	}
	
	public ArrayList<CBalade> find(CCalendrier cal) {
		
		ArrayList<CBalade> lst = new ArrayList<CBalade>();
		CBalade a = null;
		
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet result = stmt.executeQuery("select * from Balade where IdCalendrier = "+cal.getIdCalendrier()+" ORDER BY dateBalade ASC;" );
			while(result.next()) { 
				a = new CBalade(result.getInt("IdBalade"),
						result.getString("rue"),result.getString("numRue"),
						result.getString("localite"),result.getString("codePostal"),
						result.getInt("forfait"),result.getDate("dateBalade"));
				lst.add(a);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return lst;
	}

}
