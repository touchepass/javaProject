package DAO;

import java.sql.*;

import Classe.CCategorieVttRandonnee;


public class DCategorieVttRandonnee extends DAO<CCategorieVttRandonnee> {
	
	public DCategorieVttRandonnee() {	}
	
	public boolean create(CCategorieVttRandonnee obj){		
		return false;
	}
	
	public boolean delete(CCategorieVttRandonnee obj){
		return false;
	}
	
	public boolean update(CCategorieVttRandonnee obj){
		return false;
	}
	
	public CCategorieVttRandonnee find(Object obj){
		CCategorieVttRandonnee a = new CCategorieVttRandonnee();
		try{
			ResultSet result = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery(" select * from CategorieVtt where IdCat = 3 and IdCatVtt = "+(Integer)obj+";");
					if(result.first()) { 
						a = new CCategorieVttRandonnee(result.getInt("IdCat"),result.getInt("IdCatVtt"),result.getInt("diamPneu"),result.getInt("nbrPlateau"),result.getString("caracteristique"));
					}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}

}
