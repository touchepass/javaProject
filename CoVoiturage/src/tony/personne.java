package tony;

import java.time.LocalDate; 

public abstract class personne {
	
	protected String nom;
	protected String prenom;
	protected LocalDate dateNaissance;
	protected char sexe;
	protected int numero;
	protected String rue;
	protected int numRue;
	protected String localite;
	protected int codePostal;
	
	public personne(String nom, String prenom, LocalDate dateNaissance, char sexe, int numero, String rue, int numRue, String localite, int codePostal) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
		this.numero = numero;
		this.localite = localite;
		this.codePostal = codePostal;
	}
	
	///////////////////////
	// Accesseur
	///////////////////////
	
	public String getNom() {
		return this.nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public LocalDate getDateNaissance() {
		return this.dateNaissance;
	}
	public char getSexe() {
		return this.sexe;
	}
	public int getNumero() {
		return this.numero;
	}
	public String getRue() {
		return this.rue;
	}
	public int getNumRue() {
		return this.numRue;
	}
	public String getLocalite() {
		return this.localite;
	}
	public int getCodePostal() {
		return this.numRue;
	}
	///////////////////////
	// Mutateur
	///////////////////////
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}
	public void setLocalite(String localite) {
		this.localite = localite;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	
	///////////////////////
	// Méthodes
	///////////////////////
	
}
