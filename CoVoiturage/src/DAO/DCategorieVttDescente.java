package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Classe.CCategorieVttDescente;

public class DCategorieVttDescente extends DAO<CCategorieVttDescente>{

	
	public DCategorieVttDescente() {	}
	
	public boolean create(CCategorieVttDescente obj){		
		return false;
	}
	
	public boolean delete(CCategorieVttDescente obj){
		return false;
	}
	
	public boolean update(CCategorieVttDescente obj){
		return false;
	}
	
	public CCategorieVttDescente find(Object obj/* ce qui permet de retrouver la balade */){
		CCategorieVttDescente a = new CCategorieVttDescente();
		try{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery(" " /* requête sql */);
			if(result.first()) { 
				// création de l'objet avec les caractéristiques prises de la db
				a = new CCategorieVttDescente();
			}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
}
