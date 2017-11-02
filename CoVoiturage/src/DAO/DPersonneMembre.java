package DAO;

import Classe.*;
import DAO.*;
import java.sql.*;
import java.util.Date;


public class DPersonneMembre extends DAO<CPersonneMembre>{
	
	public DPersonneMembre() {	}
	
	public boolean create(CPersonneMembre obj){		
		return false;
	}
	
	public boolean delete(CPersonneMembre obj){
		return false;
	}
	
	public boolean update(CPersonneMembre obj){
		return false;
	}
	
	public CPersonneMembre find(Object obj){
		CPersonneMembre a = new CPersonneMembre();
		CCategorie  c = new CCategorie();
		try{
			String pseudo = (String)obj;
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet result = stmt.executeQuery("select * from Personne p  inner join PersonneMembre pm " + " on pm.IdPers = p.IdPers where pseudo='"+pseudo+"'" );
			if(result.first()) { 
				DCategorie dc = new DCategorie();
				c = dc.find(result.getInt("IdCat"));
				a = new CPersonneMembre(result.getString("nom"),result.getString("prenom"),
						result.getDate("dateNaissance"),result.getString("sexe"),
						result.getInt("numero"),result.getString("rue"),
						result.getInt("numRue"),result.getString("localite"),
						result.getInt("CodePostal"),result.getString("pseudo"),
						result.getString("pass"),
						c);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
	
	public CPersonneMembre find(int obj){
		CPersonneMembre a = new CPersonneMembre();
		CCategorie  c = new CCategorie();
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet result = stmt.executeQuery("select * from Personne p  inner join PersonneMembre pm " + " on pm.IdPers = p.IdPers where IdPersMem='"+obj+"'" );
			if(result.first()) { 
				DCategorie dc = new DCategorie();
				c = dc.find(result.getInt("IdCat"));
				a = new CPersonneMembre(result.getString("nom"),result.getString("prenom"),
						result.getDate("dateNaissance"),result.getString("sexe"),
						result.getInt("numero"),result.getString("rue"),
						result.getInt("numRue"),result.getString("localite"),
						result.getInt("CodePostal"),result.getString("pseudo"),
						result.getString("pass"),
						c);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
}
