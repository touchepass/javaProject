package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Classe.CCalendrier;

public class DCalendrier extends DAO<CCalendrier> {
	
	public DCalendrier() {	}
	
	@Override
	public boolean create(CCalendrier obj){		
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate(
					"INSERT INTO Calendrier (nom) "+
					" VALUES ("+obj.getNom()+");" 
					);
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean delete(CCalendrier obj){
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate("DELETE FROM Calendrier WHERE IdCalendrier = "+obj.getIdCalendrier()+";");
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean update(CCalendrier obj){
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate("UPDATE Calendrier SET nom = "+obj.getNom()+"WHERE IdCalendrier = "
					+obj.getIdCalendrier()+";");
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public CCalendrier find(Object obj/* ce qui permet de retrouver la balade */){
		CCalendrier a = new CCalendrier();
		
		try{
			int IdC = (Integer)obj;
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet result = stmt.executeQuery("select * from Calendrier where IdCalendrier= "+IdC+";" );
			if(result.first()) { 
				a = new CCalendrier(result.getInt("IdCalendrier"),result.getString("nom"));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
	
	public CCalendrier find(String obj/* ce qui permet de retrouver la balade */){
		CCalendrier a = new CCalendrier();
		
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet result = stmt.executeQuery("select * from Calendrier where nom= \""+obj+"\";" );
			if(result.first()) { 
				a = new CCalendrier(result.getInt("IdCalendrier"),result.getString("nom"));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
}
