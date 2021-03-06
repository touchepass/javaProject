package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Classe.CCategorie;
import Classe.CPersonneResponsable;

public class DPersonneResponsable extends DAO<CPersonneResponsable> {
	
	public DPersonneResponsable() {	}
	@Override
	public boolean create(CPersonneResponsable obj){		
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate(
					"INSERT INTO PersonneResponsable (IdPers,IdCat) "+
					" VALUES ("+3+","+obj.getIdPers()+","+obj.getCategorie()+");" 
					);
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean delete(CPersonneResponsable obj){
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate("DELETE FROM PersonneResponsable WHERE IdPersResp = "+obj.getIdPersResp()+";");
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean update(CPersonneResponsable obj){
		return false;
	}
	
	@Override
	public CPersonneResponsable find(Object obj){
		CPersonneResponsable a = null;
		CCategorie  c = new CCategorie();
		try{
			String pseudo = (String)obj;
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet result = stmt.executeQuery("select * from Personne p  inner join PersonneResponsable pm " + " on pm.IdPers = p.IdPers where pseudo='"+pseudo+"'" );
			if(result.first()) { 
				DCategorie dc = new DCategorie();
				c = dc.find(result.getInt("IdCat"));
				a = new CPersonneResponsable(result.getInt("IdPers"),
						result.getString("nom"),result.getString("prenom"),
						result.getDate("dateNaissance"),result.getString("sexe"),
						result.getString("numero"),result.getString("rue"),
						result.getString("numRue"),result.getString("localite"),
						result.getString("CodePostal"),result.getString("pseudo"),
						result.getString("pass"),result.getInt("IdPersResp"),
						c);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
	
	public CPersonneResponsable find(int obj){
		CPersonneResponsable a = null;
		CCategorie  c = new CCategorie();
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet result = stmt.executeQuery("select * from Personne p  inner join PersonneResponsable pm " + " on pm.IdPers = p.IdPers where IdPersResp= "+obj+";" );
			if(result.first()) { 
				DCategorie dc = new DCategorie();
				c = dc.find(result.getInt("IdCat"));
				a = new CPersonneResponsable(result.getInt("IdPers"),
						result.getString("nom"),result.getString("prenom"),
						result.getDate("dateNaissance"),result.getString("sexe"),
						result.getString("numero"),result.getString("rue"),
						result.getString("numRue"),result.getString("localite"),
						result.getString("CodePostal"),result.getString("pseudo"),
						result.getString("pass"),result.getInt("IdPersResp"),
						c);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
}


