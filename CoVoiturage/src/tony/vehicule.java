package tony;
import java.util.* ;

public class vehicule {
	
	private personne conducteur;
	private ArrayList<personne> lstPassager;
	private int nbrPlaceAssise;
	private int nbrPlaceVelo;
	
	public vehicule (personne conducteur, int nbrPlaceAssise, int nbrPlaceVelo) {
		this.conducteur = conducteur;
		this.nbrPlaceAssise = nbrPlaceAssise;
		this.nbrPlaceVelo = nbrPlaceVelo;
		this.lstPassager = new ArrayList<personne>();
	}
	
	///////////////////////
	// Accesseur
	///////////////////////
	
	public personne getConducteur() {
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


