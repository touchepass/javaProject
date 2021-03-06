package DAO;

import Classe.*;
import java.sql.*;
import java.util.ArrayList;


public class DPersonneMembre extends DAO<CPersonneMembre>{
	
	public DPersonneMembre() {	}
	
	@Override
	public boolean create(CPersonneMembre obj){		
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate(
					"INSERT INTO PersonneMembre (IdPers,payementCotisation,IdCat) "+
					" VALUES ("+3+","+obj.getIdPers()+","+obj.getPayementCotistion()+","+obj.getListCategoriePositio(0).getIdCat()+");" 
					);
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean delete(CPersonneMembre obj){
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate("DELETE FROM PersonneMembre WHERE IdPersMem = "+obj.getIdPersMem()+";");
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean update(CPersonneMembre obj){
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate("UPDATE PersonneMembre SET"
					+ " payementCotisation = "+obj.getPayementCotistion()
					+ " WHERE IdPersMem = "+obj.getIdPersMem()+";");
			
			
			
			String sql = "UPDATE Personne SET"
					+ " numero = \""+obj.getNumero()+"\", "
					+ " rue = \""+obj.getRue()+"\", "
					+ " numrue = \""+obj.getNumRue()+"\", "
					+ " localite = \""+obj.getLocalite()+"\", "
					+ " CodePostal = \""+obj.getCodePostal()+"\""
					+ " WHERE IdPers = "+obj.getIdPers()+";";
			
			
			stmt.executeUpdate(sql);
			
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public CPersonneMembre find(Object obj){
		CPersonneMembre a = null;
		
		try{
			String pseudo = (String)obj;
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet result = stmt.executeQuery("select * from Personne p  inner join PersonneMembre pm " + " on pm.IdPers = p.IdPers where pseudo='"+pseudo+"'" );
			if(result.first()) { 
				
				DCategorie dc = new DCategorie();
				
				a = new CPersonneMembre(result.getInt("IdPers"),
						result.getString("nom"),result.getString("prenom"),
						result.getDate("dateNaissance"),result.getString("sexe"),
						result.getString("numero"),result.getString("rue"),
						result.getString("numRue"),result.getString("localite"),
						result.getString("CodePostal"),result.getString("pseudo"),
						result.getString("pass"),result.getInt("IdPersMem"));
				
				a.setCategories(dc.find(a, true));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
	
	public CPersonneMembre find(int obj){
		CPersonneMembre a = null;
		
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet result = stmt.executeQuery("select * from Personne p  inner join PersonneMembre pm " + " on pm.IdPers = p.IdPers where IdPersMem='"+obj+"'" );
			if(result.first()) { 
				DCategorie dc = new DCategorie();
				
				a = new CPersonneMembre(result.getInt("IdPers"),
						result.getString("nom"),result.getString("prenom"),
						result.getDate("dateNaissance"),result.getString("sexe"),
						result.getString("numero"),result.getString("rue"),
						result.getString("numRue"),result.getString("localite"),
						result.getString("CodePostal"),result.getString("pseudo"),
						result.getString("pass"),result.getInt("IdPersMem"));
				
				a.setCategories(dc.find(a, true));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return a;
	}
}
