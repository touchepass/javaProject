package tony;

public abstract class categorie {
	protected String nom;
	
	public categorie(String nom) {
		this.nom = nom;
	}
	
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
