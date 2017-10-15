package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Classe.CCategorieVttTrialiste;

public class DCategorieVttTrialiste extends DAO<CCategorieVttTrialiste>{
	public DCategorieVttTrialiste(Connection conn){
		super(conn);
	}
	
	public boolean create(CCategorieVttTrialiste obj){		
		return false;
	}
	
	public boolean delete(CCategorieVttTrialiste obj){
		return false;
	}
	
	public boolean update(CCategorieVttTrialiste obj){
		return false;
	}
	
	public CCategorieVttTrialiste find(Object obj/* ce qui permet de retrouver la balade */){
		CCategorieVttTrialiste a = new CCategorieVttTrialiste();
		try{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery(" " /* requête sql */);
			if(result.first()) { 
				// création de l'objet avec les caractéristiques prises de la db
				a = new CCategorieVttTrialiste();
			}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
}
