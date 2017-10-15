package Classe;
import java.util.* ;

public class CVehicule {
	
	private CPersonne conducteur;
	private ArrayList<CPersonne> lstPassager;
	private int nbrPlaceAssise;
	private int nbrPlaceVelo;
	
	public CVehicule (CPersonne conducteur, int nbrPlaceAssise, int nbrPlaceVelo) {
		this.conducteur = conducteur;
		this.nbrPlaceAssise = nbrPlaceAssise;
		this.nbrPlaceVelo = nbrPlaceVelo;
		this.lstPassager = new ArrayList<CPersonne>();
	}
	
	public CVehicule() {}
	
	///////////////////////
	// Accesseur
	///////////////////////
	
	public CPersonne getConducteur() {
		return this.conducteur;
	}
	
	public int getNbrPlaceAssise() {
		return this.nbrPlaceAssise;
	}
	
	public int getNbrPlaceVelo() {
		return this.nbrPlaceVelo;
	}
	
	///////////////////////
	// Méthodes
	///////////////////////
	
	

	
}


