package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Classe.CCategorie;
import Classe.CPersonneMembre;


public class DCategorie extends DAO<CCategorie>{

	
	public DCategorie() {	}
	
	public boolean create(CCategorie obj){		
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate(
					"INSERT INTO Categorie (nom) "+
					" VALUES ("+obj.getNom()+");" 
					);
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean createCategoriePersonne(int IdCat, int IdPersMem){		
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate(
					"INSERT INTO ListeCategoriePersonne (IdCat,IdPersMem) "+
							" VALUES ("+IdCat+","+IdPersMem+");" 
					);
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean delete(CCategorie obj){
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate("DELETE FROM Categorie WHERE IdCat = "+obj.getIdCat()+";");
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean update(CCategorie obj){
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate("UPDATE Balde SET nom = "+obj.getNom()+"WHERE IdCat ="+obj.getIdCat()+";");
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	public CCategorie find(Object obj){
		CCategorie a = new CCategorie();
		try{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery("select * from Categorie where IdCat = " + (Integer)obj );
			if(result.first()) { 
				a = new CCategorie(result.getInt("IdCat"),result.getString("nom"));
			}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
	
	public List<CCategorie> ListeCategorie(){
		CCategorie a = new CCategorie();
		List<CCategorie> lst = new ArrayList<CCategorie>();
		try{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery("select * from Categorie");
			while(result.next()) {
				a = new CCategorie(result.getInt("IdCat"),result.getString("nom"));
				lst.add(a);
			}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return lst;
	}
	
	public ArrayList<CCategorie> ListeCategorieNonInscrit(int obj){
		CCategorie a = new CCategorie();
		ArrayList<CCategorie> lst = new ArrayList<CCategorie>();
		try{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery(""
					+ "select  * FROM Categorie WHERE IdCat NOT IN("
						+ "SELECT IdCat FROM  ListeCategoriePersonne "
						+ "WHERE IdPersMem = "+obj+")"
					+ ";");
			while(result.next()) {
				a = new CCategorie(result.getInt("IdCat"),result.getString("nom"));
				lst.add(a);
			}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return lst;
	}
	
	public ArrayList<CCategorie> findListeCategorieParMembre(int obj){
		CCategorie a = new CCategorie();
		ArrayList<CCategorie> lst = new ArrayList<CCategorie>();
		try{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery(""
					+ "select * from Categorie WHERE IdCat IN("
						+ "SELECT IdCat FROM  ListeCategoriePersonne "
						+ "WHERE IdPersMem = "+obj+")"
					+ ";");
			while(result.next()) {
				a = new CCategorie(result.getInt("IdCat"),result.getString("nom"));
				lst.add(a);
			}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return lst;
	}
}
