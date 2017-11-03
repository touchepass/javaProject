package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Classe.CCategorieVttRandonnee;
import Classe.CCategorieVttTrialiste;

public class DCategorieVttTrialiste extends DAO<CCategorieVttTrialiste>{
	public DCategorieVttTrialiste() {	}
	
	public boolean create(CCategorieVttTrialiste obj){		
		return false;
	}
	
	public boolean delete(CCategorieVttTrialiste obj){
		return false;
	}
	
	public boolean update(CCategorieVttTrialiste obj){
		return false;
	}
	
	public CCategorieVttTrialiste find(Object obj){
		CCategorieVttTrialiste a = new CCategorieVttTrialiste();
		try{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery(" select * from CategorieVtt where IdCat = 2 and IdCatVtt = "+(Integer)obj+";");
			if(result.first()) { 
				a = new CCategorieVttTrialiste(result.getInt("IdCat"),result.getInt("IdCatVtt"),result.getInt("diamPneu"),result.getInt("nbrPlateau"),result.getString("caracteristique"));
			}	
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
}
