package Classe;

import java.time.LocalDate;

public class CPersonneTresorier extends CPersonne{
	
	private int fond;	
	
	public CPersonneTresorier (String nom, String prenom, LocalDate dateNaissance, char sexe, int numero, String rue, int numRue, String localite, int codePostal, String pseudo, String pass,CCategorie cat) {
		super( nom,  prenom,  dateNaissance,  sexe,  numero,  rue,  numRue,  localite,  codePostal, pseudo, pass);
		this.fond = 0;
	}
	
	public CPersonneTresorier() {}
	
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
