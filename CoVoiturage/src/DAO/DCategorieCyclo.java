package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Classe.CCategorieCyclo;


public class DCategorieCyclo extends DAO<CCategorieCyclo>{
	
	public DCategorieCyclo() {	}
	
	public boolean create(CCategorieCyclo obj){		
		return false;
	}
	
	public boolean delete(CCategorieCyclo obj){
		return false;
	}
	
	public boolean update(CCategorieCyclo obj){
		return false;
	}
	
	public CCategorieCyclo find(Object obj/* ce qui permet de retrouver la balade */){
		CCategorieCyclo a = new CCategorieCyclo();
		try{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery(" " /* requête sql */);
			if(result.first()) { 
				// création de l'objet avec les caractéristiques prises de la db
				a = new CCategorieCyclo();
			}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
	
}
