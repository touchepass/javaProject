package DAO;

import java.sql.*;

import Classe.CCategorieVttRandonnee;


public class DCategorieVttRandonnee extends DAO<CCategorieVttRandonnee> {
	
	public DCategorieVttRandonnee() {	}
	
	@Override
	public boolean create(CCategorieVttRandonnee obj){		
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate(
					"INSERT INTO CategorieVtt (IdCat,diamPneu,nbrPlateau,caracteristique) "+
					" VALUES ("+3+","+obj.getDiamPneu()+","+obj.getNbrPlateau()+","+obj.getCaracteristique()+");" 
					);
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Override
	public boolean delete(CCategorieVttRandonnee obj){
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
	public boolean update(CCategorieVttRandonnee obj){
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
	public CCategorieVttRandonnee find(Object obj){
		CCategorieVttRandonnee a = null;
		try{
			ResultSet result = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY).executeQuery(" select * from CategorieVtt where IdCat = 3 and IdCatVtt = "+obj+";");
					if(result.first()) { 
						a = new CCategorieVttRandonnee(result.getInt("IdCat"),result.getInt("IdCatVtt"),result.getInt("diamPneu"),result.getInt("nbrPlateau"),result.getString("caracteristique"));
					}
					
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}

}
