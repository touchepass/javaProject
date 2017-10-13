package tony;

import java.time.LocalDate;

public class tresorier extends personne{
	
	private int fond;	
	
	public tresorier (String nom, String prenom, LocalDate dateNaissance, char sexe, int numero, String rue, int numRue, String localite, int codePostal, categorie cat) {
		super( nom,  prenom,  dateNaissance,  sexe,  numero,  rue,  numRue,  localite,  codePostal);
		this.fond = 0;
	}
	
	///////////////////////
	// Accesseur
	///////////////////////
	
	public int getFond() {
		return this.fond;
	}
	
	///////////////////////
	// Mutateur
	///////////////////////
	
	public void setFond(int fond) {
		this.fond = fond;
	}
	
	///////////////////////
	// Méthodes
	///////////////////////
}
