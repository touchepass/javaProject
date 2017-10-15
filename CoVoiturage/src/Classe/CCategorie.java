package Classe;

public abstract class CCategorie {
	protected String nom;
	
	public CCategorie(String nom) {
		this.nom = nom;
	}
	
	public CCategorie() {}
	
	///////////////////////
	// Accesseur
	///////////////////////
	
	public String getNom() {
		return this.nom;
	}
	
	///////////////////////
	// Méthodes
	///////////////////////

}
