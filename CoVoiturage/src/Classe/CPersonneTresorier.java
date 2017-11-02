package Classe;

import java.sql.Date;

public class CPersonneTresorier extends CPersonne{
	
	private int fond;	
	
	public CPersonneTresorier (String nom, String prenom, Date dateNaissance, String sexe, int numero, String rue, int numRue, String localite, int codePostal, String pseudo, String pass) {
		super( nom,  prenom,  dateNaissance,  sexe,  numero,  rue,  numRue,  localite,  codePostal, pseudo, pass);
		this.fond = 0;
	}
	
	public CPersonneTresorier (String nom, String prenom, Date dateNaissance, String sexe, int numero, String rue, int numRue, String localite, int codePostal, String pseudo, String pass, int fond) {
		super( nom,  prenom,  dateNaissance,  sexe,  numero,  rue,  numRue,  localite,  codePostal, pseudo, pass);
		this.fond = fond;
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
