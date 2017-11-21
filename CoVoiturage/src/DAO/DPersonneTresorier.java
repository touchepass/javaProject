package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Classe.CCategorie;
import Classe.CPersonneTresorier;

public class DPersonneTresorier extends DAO<CPersonneTresorier> {
	
	public DPersonneTresorier() {	}
	
	@Override
	public boolean create(CPersonneTresorier obj){		
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate(
					"INSERT INTO PersonneTresorier (IdPers,fond) "+
					" VALUES ("+3+","+obj.getIdPers()+","+obj.getFond()+");" 
					);
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean delete(CPersonneTresorier obj){
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate("DELETE FROM PersonneTresorier WHERE IdPersTres = "+obj.getIdPersTres()+";");
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean update(CPersonneTresorier obj){
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate("UPDATE PersonneTresorier SET"
					+ " fond = "+obj.getFond()
					+ " WHERE IdPersTres = "+obj.getIdPersTres()+";");
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public CPersonneTresorier find(Object obj/* ce qui permet de retrouver la balade */){
		CPersonneTresorier a = null;
		CCategorie  c = null;
		try{
			String pseudo = (String)obj;
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet result = stmt.executeQuery("select * from Personne p  inner join PersonneTresorier pm " + " on pm.IdPers = p.IdPers where pseudo='"+pseudo+"'" );
			if(result.first()) { 
				DCategorie dc = new DCategorie();
				c = dc.find(result.getInt("IdCat"));
				a = new CPersonneTresorier(result.getInt("IdPers"),
						result.getString("nom"),result.getString("prenom"),
						result.getDate("dateNaissance"),result.getString("sexe"),
						result.getString("numero"),result.getString("rue"),
						result.getString("numRue"),result.getString("localite"),
						result.getString("CodePostal"),result.getString("pseudo"),
						result.getString("pass"),result.getInt("IdPersTres"),
						result.getInt("Fond"));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
	
	public CPersonneTresorier find(int obj){
		CPersonneTresorier a = null;
		CCategorie  c = null;
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet result = stmt.executeQuery("select * from Personne p  inner join PersonneTresorier pm " + " on pm.IdPers = p.IdPers where IdPersTres="+obj+";" );
			if(result.first()) { 
				DCategorie dc = new DCategorie();
				c = dc.find(result.getInt("IdCat"));
				a = new CPersonneTresorier(result.getInt("IdPers"),
						result.getString("nom"),result.getString("prenom"),
						result.getDate("dateNaissance"),result.getString("sexe"),
						result.getString("numero"),result.getString("rue"),
						result.getString("numRue"),result.getString("localite"),
						result.getString("CodePostal"),result.getString("pseudo"),
						result.getString("pass"),result.getInt("IdPersTres"),
						result.getInt("Fond"));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
}
