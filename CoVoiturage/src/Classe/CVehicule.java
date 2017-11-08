package Classe;
import java.util.* ;

public class CVehicule {
	
	private int IdVehicule;
	private CPersonneMembre conducteur;
	private ArrayList<CPersonne> lstPassager;
	private int nbrPlaceAssise;
	private int nbrPlaceVelo;
	private String imma;
	
	public CVehicule (int IdVehicule,CPersonneMembre conducteur, int nbrPlaceAssise, int nbrPlaceVelo, String imma) {
		this.IdVehicule = IdVehicule;
		this.conducteur = conducteur;
		this.nbrPlaceAssise = nbrPlaceAssise;
		this.nbrPlaceVelo = nbrPlaceVelo;
		this.lstPassager = new ArrayList<CPersonne>();
		this.imma = imma;
	}
	
	public CVehicule() {}
	
	///////////////////////
	// Accesseur
	///////////////////////
	public int getIdVehicule() {
		return this.IdVehicule;
	}
	
	public CPersonneMembre getConducteur() {
		return this.conducteur;
	}
	
	public int getNbrPlaceAssise() {
		return this.nbrPlaceAssise;
	}
	
	public int getNbrPlaceVelo() {
		return this.nbrPlaceVelo;
	}
	
	public String getImma() {
		return this.imma;
	}
	
	///////////////////////
	// Méthodes
	///////////////////////
	
	

	
}


