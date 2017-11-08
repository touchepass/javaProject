package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Classe.CCategorieCyclo;


public class DCategorieCyclo extends DAO<CCategorieCyclo>{
	
	public DCategorieCyclo() {	}
	
	public boolean create(CCategorieCyclo obj){		
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate(
					"INSERT INTO CategorieCyclo (IdCat,capacitePorteBagage) "+
					" VALUES ("+obj.getIdCat()+","+obj.getCapacitePorteBagage()+");" 
					);
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean delete(CCategorieCyclo obj){
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate("DELETE FROM CategorieCyclo WHERE IdCatCyclo = "+obj.getIdCatCyclo()+";");
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean update(CCategorieCyclo obj){
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate("UPDATE CategorieCyclo SET"
					+ " capacitePorteBagage = "+obj.getCapacitePorteBagage()
					+ " WHERE IdCatCyclo = "+obj.getIdCatCyclo()+";");
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
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
