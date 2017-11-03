package DAO;

import java.sql.*;
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
	
	public boolean delete(CBalade obj){
		return false;
	}
	
	public boolean update(CBalade obj){
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
						result.getString("rue"),result.getInt("numRue"),
						result.getString("localite"),result.getInt("codePostal"),
						result.getInt("forfait"),result.getDate("dateBalade"));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}

}
