package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

import Classe.CBalade;
import Classe.CCategorie;
import Classe.CPersonneMembre;

public class DBalade extends DAO<CBalade> {
	
	public DBalade() {	}
	
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
	
	public boolean createBaladeVehicule(int IdB, int IdV){		
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate(
					"INSERT INTO ListeBaladeVehicule (IdVehicule, IdBalade)" + 
					" VALUES ("+IdV+", "+IdB+");" 
					);
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
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
	
	public CBalade find(Object obj){
		CBalade a = new CBalade();
		
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
	
	public ArrayList<CBalade> ListBalade(int idCal){
		
		ArrayList<CBalade> lst = new ArrayList<CBalade>();
		CBalade a = new CBalade();
		
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet result = stmt.executeQuery("select * from Balade where IdCalendrier = "+idCal+" ORDER BY dateBalade ASC;" );
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
