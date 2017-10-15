package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Classe.CPersonneMembre;

public class DPersonneMembre extends DAO<CPersonneMembre>{
	
	public DPersonneMembre(Connection conn){
		super(conn);
	}
	
	public boolean create(CPersonneMembre obj){		
		return false;
	}
	
	public boolean delete(CPersonneMembre obj){
		return false;
	}
	
	public boolean update(CPersonneMembre obj){
		return false;
	}
	
	public CPersonneMembre find(Object obj/* ce qui permet de retrouver la balade */){
		CPersonneMembre a = new CPersonneMembre();
		try{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery(" " /* requ�te sql */);
			if(result.first()) { 
				// cr�ation de l'objet avec les caract�ristiques prises de la db
				a = new CPersonneMembre();
			}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
}
