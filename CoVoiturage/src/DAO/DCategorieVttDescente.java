package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Classe.CCategorieVttDescente;

public class DCategorieVttDescente extends DAO<CCategorieVttDescente>{

	
	public DCategorieVttDescente() {	}
	
	@Override
	public boolean create(CCategorieVttDescente obj){		
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate(
					"INSERT INTO CategorieVtt (IdCat,diamPneu,nbrPlateau,caracteristique) "+
					" VALUES ("+4+","+obj.getDiamPneu()+","+obj.getNbrPlateau()+","+obj.getCaracteristique()+");" 
					);
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean delete(CCategorieVttDescente obj){
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate("DELETE FROM CategorieVtt WHERE IdCatVtt = "+obj.getIdCatVtt()+";");
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean update(CCategorieVttDescente obj){
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate("UPDATE Balde SET"
					+ " diamPneu = "+obj.getDiamPneu()+", nbrPlateau = "+obj.getNbrPlateau()
					+ "	caracteristique = "+obj.getCaracteristique()
					+ " WHERE IdCatVtt = "+obj.getIdCatVtt()+";");
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public CCategorieVttDescente find(Object obj){
		CCategorieVttDescente a = null;
		try{
			ResultSet result = this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery(" select * from CategorieVtt where IdCat = 4 and IdCatVtt = "+obj+";");
			if(result.first()) { 
				a = new CCategorieVttDescente(result.getInt("IdCat"),result.getInt("IdCatVtt"),result.getInt("diamPneu"),result.getInt("nbrPlateau"),result.getString("caracteristique"));
			}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
}
