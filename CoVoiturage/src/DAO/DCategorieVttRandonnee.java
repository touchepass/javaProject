package DAO;

import java.sql.*;

import Classe.CCategorieVttRandonnee;


public class DCategorieVttRandonnee extends DAO<CCategorieVttRandonnee> {
	
	public DCategorieVttRandonnee(Connection conn){
		super(conn);
	}
	
	public boolean create(CCategorieVttRandonnee obj){		
		return false;
	}
	
	public boolean delete(CCategorieVttRandonnee obj){
		return false;
	}
	
	public boolean update(CCategorieVttRandonnee obj){
		return false;
	}
	
	public CCategorieVttRandonnee find(Object obj/* ce qui permet de retrouver la balade */){
		CCategorieVttRandonnee a = new CCategorieVttRandonnee();
		try{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery(" " /* requ�te sql */);
			if(result.first()) { 
				// cr�ation de l'objet avec les caract�ristiques prises de la db
				a = new CCategorieVttRandonnee();
			}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}

}
