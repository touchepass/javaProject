package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Classe.CPersonneMembre;
import Classe.CVehicule;

public class DVehicule extends DAO<CVehicule>{
	
	public DVehicule() {	}
	
	public boolean create(CVehicule obj){		
		return false;
	}
	
	public boolean delete(CVehicule obj){
		return false;
	}
	
	public boolean update(CVehicule obj){
		return false;
	}
	
	public CVehicule find(Object obj/* ce qui permet de retrouver la balade */){
		CVehicule a = new CVehicule();
		try{
			String immaT = (String)obj;
			Statement stmt = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet result = stmt.executeQuery("select * from vehicule where imma= "+immaT+";" );
			if(result.first()) { 
				CPersonneMembre pm = new DPersonneMembre().find(result.getInt("IdPersMem"));
				a = new CVehicule(pm,result.getInt("nbrPlaceAssise"),result.getInt("nbrPlaceVelo"),
						result.getString("imma"));
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return a;
	}
	
}
