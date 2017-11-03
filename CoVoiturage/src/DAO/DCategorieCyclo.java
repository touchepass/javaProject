package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Classe.CCategorieCyclo;


public class DCategorieCyclo extends DAO<CCategorieCyclo>{
	
	public DCategorieCyclo() {	}
	
	public boolean create(CCategorieCyclo obj){		
		return false;
	}
	
	public boolean delete(CCategorieCyclo obj){
		return false;
	}
	
	public boolean update(CCategorieCyclo obj){
		return false;
	}
	
	public CCategorieCyclo find(Object obj){
		CCategorieCyclo a = new CCategorieCyclo();
		try{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery("select * from CategorieCyclo where IdCatCyclo = "+(Integer)obj+";");
			if(result.first()) { 
				a = new CCategorieCyclo(result.getInt("IdCat"),result.getInt("IdCatCyclo"),result.getInt("capacitePorteBagage"));
			}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
	
}
