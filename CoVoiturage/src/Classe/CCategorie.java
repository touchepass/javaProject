package Classe;

public class CCategorie {
	protected int IdCat;
	protected String nom;
	
	public CCategorie(int IdCat,String nom) {
		this.IdCat = IdCat;
		this.nom = nom;
	}
	
	public CCategorie() {}
	
	///////////////////////
	// Accesseur
	///////////////////////
	
	public int getIdCat() {
		return this.IdCat;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	///////////////////////
	// Méthodes
	///////////////////////

}
