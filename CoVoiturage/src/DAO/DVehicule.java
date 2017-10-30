package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Classe.CVehicule;

public class DVehicule extends DAO<CVehicule>{
	
	public DVehicule() {	}
	
	public boolean create(CVehicule obj){		
		return false;
	}
	
	public boolean delete(CVehicule obj){
		return false;
	}
	
	public boolean update(CVehicule obj){
		return false;
	}
	
	public CVehicule find(Object obj/* ce qui permet de retrouver la balade */){
		CVehicule a = new CVehicule();
		try{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery(" " /* requête sql */);
			if(result.first()) { 
				// création de l'objet avec les caractéristiques prises de la db
				a = new CVehicule();
			}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
	
}
