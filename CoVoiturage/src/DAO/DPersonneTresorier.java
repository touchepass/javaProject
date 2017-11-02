package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Classe.CCategorie;
import Classe.CPersonneResponsable;
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
		CCategorie  c = new CCategorie();
		try{
			String pseudo = (String)obj;
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet result = stmt.executeQuery("select * from Personne p  inner join PersonneTresorier pm " + " on pm.IdPers = p.IdPers where pseudo='"+pseudo+"'" );
			if(result.first()) { 
				DCategorie dc = new DCategorie();
				c = dc.find(result.getInt("IdCat"));
				a = new CPersonneTresorier(result.getString("nom"),result.getString("prenom"),
						result.getDate("dateNaissance"),result.getString("sexe"),
						result.getInt("numero"),result.getString("rue"),
						result.getInt("numRue"),result.getString("localite"),
						result.getInt("CodePostal"),result.getString("pseudo"),
						result.getString("pass"),result.getInt("Fond")
						);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
}
