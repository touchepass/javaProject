package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Classe.CCategorie;
import Classe.CPersonneMembre;
import Classe.CPersonneResponsable;

public class DPersonneResponsable extends DAO<CPersonneResponsable> {
	
	public DPersonneResponsable() {	}
	public boolean create(CPersonneResponsable obj){		
		return false;
	}
	
	public boolean delete(CPersonneResponsable obj){
		return false;
	}
	
	public boolean update(CPersonneResponsable obj){
		return false;
	}
	
	public CPersonneResponsable find(Object obj){
		CPersonneResponsable a = new CPersonneResponsable();
		CCategorie  c = new CCategorie();
		try{
			String pseudo = (String)obj;
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet result = stmt.executeQuery("select * from Personne p  inner join PersonneResponsable pm " + " on pm.IdPers = p.IdPers where pseudo='"+pseudo+"'" );
			if(result.first()) { 
				DCategorie dc = new DCategorie();
				c = dc.find(result.getInt("IdCat"));
				a = new CPersonneResponsable(result.getString("nom"),result.getString("prenom"),
						result.getDate("dateNaissance"),result.getString("sexe"),
						result.getInt("numero"),result.getString("rue"),
						result.getInt("numRue"),result.getString("localite"),
						result.getInt("CodePostal"),result.getString("pseudo"),
						result.getString("pass"),
						c);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
}


