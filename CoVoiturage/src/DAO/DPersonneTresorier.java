package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Classe.CPersonneTresorier;

public class DPersonneTresorier extends DAO<CPersonneTresorier> {
	
	public DPersonneTresorier() {	}
	
	public boolean create(CPersonneTresorier obj){		
		return false;
	}
	
	public boolean delete(CPersonneTresorier obj){
		return false;
	}
	
	public boolean update(CPersonneTresorier obj){
		return false;
	}
	
	public CPersonneTresorier find(Object obj/* ce qui permet de retrouver la balade */){
		CPersonneTresorier a = new CPersonneTresorier();
		try{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery(" " /* requ�te sql */);
			if(result.first()) { 
				// cr�ation de l'objet avec les caract�ristiques prises de la db
				a = new CPersonneTresorier();
			}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
}
