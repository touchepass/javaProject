package DAO;

import java.sql.*;

import Classe.CBalade;

public class DBalade extends DAO<CBalade> {
	
	public DBalade(Connection conn){
		super(conn);
	}
	
	public boolean create(CBalade obj){		
		return false;
	}
	
	public boolean delete(CBalade obj){
		return false;
	}
	
	public boolean update(CBalade obj){
		return false;
	}
	
	public CBalade find(Object obj/* ce qui permet de retrouver la balade */){
		CBalade a = new CBalade();
		try{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery(" " /* requ�te sql */);
			if(result.first()) { 
				// cr�ation de l'objet avec les caract�ristiques prises de la db
				a = new CBalade();
			}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}

}
