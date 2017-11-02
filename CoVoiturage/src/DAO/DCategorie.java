package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Classe.CCategorie;


public class DCategorie extends DAO<CCategorie>{

	
	public DCategorie() {	}
	
	public boolean create(CCategorie obj){		
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate(
					"INSERT INTO Categorie (nom) "+
					" VALUES ("+obj.getNom()+");" 
					);
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean delete(CCategorie obj){
		return false;
	}
	
	public boolean update(CCategorie obj){
		return false;
	}
	public CCategorie find(Object obj){
		CCategorie a = new CCategorie();
		try{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery("select * from Categorie where IdCat = " + (Integer)obj );
			if(result.first()) { 
				a = new CCategorie(result.getString("nom"));
			}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
}
