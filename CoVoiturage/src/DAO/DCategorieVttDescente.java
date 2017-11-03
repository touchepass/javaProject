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
	
	public CCategorieVttDescente find(Object obj){
		CCategorieVttDescente a = new CCategorieVttDescente();
		try{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery(" select * from CategorieVtt where IdCat = 4 and IdCatVtt = "+(Integer)obj+";");
			if(result.first()) { 
				a = new CCategorieVttDescente(result.getInt("IdCat"),result.getInt("IdCatVtt"),result.getInt("diamPneu"),result.getInt("nbrPlateau"),result.getString("caracteristique"));
			}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
}
