package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Classe.CCalendrier;

public class DCalendrier extends DAO<CCalendrier> {
	
	public DCalendrier() {	}
	
	public boolean create(CCalendrier obj){		
		return false;
	}
	
	public boolean delete(CCalendrier obj){
		return false;
	}
	
	public boolean update(CCalendrier obj){
		return false;
	}
	
	public CCalendrier find(Object obj/* ce qui permet de retrouver la balade */){
		CCalendrier a = new CCalendrier();
		try{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery(" " /* requête sql */);
			if(result.first()) { 
				// création de l'objet avec les caractéristiques prises de la db
				a = new CCalendrier();
			}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
}
