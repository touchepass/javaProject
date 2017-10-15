package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Classe.CPersonneResponsable;

public class DPersonneResponsable extends DAO<CPersonneResponsable> {
	
	public DPersonneResponsable(Connection conn){
		super(conn);
	}
	
	public boolean create(CPersonneResponsable obj){		
		return false;
	}
	
	public boolean delete(CPersonneResponsable obj){
		return false;
	}
	
	public boolean update(CPersonneResponsable obj){
		return false;
	}
	
	public CPersonneResponsable find(Object obj/* ce qui permet de retrouver la balade */){
		CPersonneResponsable a = new CPersonneResponsable();
		try{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery(" " /* requête sql */);
			if(result.first()) { 
				// création de l'objet avec les caractéristiques prises de la db
				a = new CPersonneResponsable();
			}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
}
