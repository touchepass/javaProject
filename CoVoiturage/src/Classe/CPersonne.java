package Classe;

import java.util.Date; 

public abstract class CPersonne {
	
	protected int IdPers;
	protected String nom;
	protected String prenom;
	protected Date dateNaissance;
	protected String sexe;
	protected String numero;
	protected String rue;
	protected String numRue;
	protected String localite;
	protected String codePostal;
	protected String pseudo;
	protected String pass;
	
	public CPersonne(int IdPers, String nom, String prenom, Date dateNaissance, String sexe, String numero, String rue, String numRue, String localite, String codePostal, String pseudo, String pass) {
		this.IdPers = IdPers;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
		this.numero = numero;
		this.rue = rue;
		this.numRue = numRue;
		this.localite = localite;
		this.codePostal = codePostal;
		this.pseudo = pseudo;
		this.pass = pass;
	}
	
	public CPersonne() {}
	
	///////////////////////
	// Accesseur
	///////////////////////
	public int getIdPers() {
		return this.IdPers;
	}
	
	public String getNom() {
		return this.nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public Date getDateNaissance() {
		return this.dateNaissance;
	}
	public String getSexe() {
		return this.sexe;
	}
	public String getNumero() {
		return this.numero;
	}
	public String getRue() {
		return this.rue;
	}
	public String getNumRue() {
		return this.numRue;
	}
	public String getLocalite() {
		return this.localite;
	}
	public String getCodePostal() {
		return this.codePostal;
	}
	public String getPseudo() {
		return this.pseudo;
	}
	///////////////////////
	// Mutateur
	///////////////////////
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public void setNumRue(String numRue) {
		this.numRue = numRue;
	}
	public void setLocalite(String localite) {
		this.localite = localite;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	
	///////////////////////
	// Méthodes
	///////////////////////
	
	@Override
	public String toString() {
		return this.nom + " " + this.prenom;
	}	
}
