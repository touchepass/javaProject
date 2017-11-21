package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Classe.CPersonneMembre;
import Classe.CVehicule;

public class DVehicule extends DAO<CVehicule>{
	
	public DVehicule() {	}
	
	public boolean create(CVehicule obj){		
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate(
					"INSERT INTO Vehicule (IdPersMem,nbrPlaceAssise,nbrPlaceVelo,Imma) "+
					" VALUES ("+(obj.getConducteur()).getIdPersMem()+","+obj.getNbrPlaceAssise()+","+obj.getNbrPlaceVelo()+","+obj.getImma()+");" 
					);
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean delete(CVehicule obj){
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.executeUpdate("DELETE FROM Vehicule WHERE IdVehicule = "+obj.getIdVehicule()+";");
			return true;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean update(CVehicule obj){
		return false;
	}
	
	public CVehicule find(Object obj){
		CVehicule a = new CVehicule();
		try{
			String immaT = (String)obj;
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet result = stmt.executeQuery("select * from vehicule where imma= "+immaT+";" );
			if(result.first()) { 
				CPersonneMembre pm = new DPersonneMembre().find(result.getInt("IdPersMem"));
				a = new CVehicule(result.getInt("IdVehicule"),pm,result.getInt("nbrPlaceAssise"),
						result.getInt("nbrPlaceVelo"),result.getString("imma"));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
	
	public ArrayList<CVehicule> ListeVehiculeBalade(int IdB){
		ArrayList<CVehicule> lst = new ArrayList<CVehicule>();
		CVehicule a;
		try{
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet result = stmt.executeQuery(
					 "SELECT * from Vehicule WHERE IdVehicule IN " 
					+"select IdVehicule from ListeBaladeVehicule where IdBalade = "+IdB+");"
					);
			while(result.next()) { 
				CPersonneMembre pm = new DPersonneMembre().find(result.getInt("IdPersMem"));
				a = new CVehicule(result.getInt("IdVehicule"),pm,result.getInt("nbrPlaceAssise"),
						result.getInt("nbrPlaceVelo"),result.getString("imma"));
				lst.add(a);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return lst;
	}
	
}
