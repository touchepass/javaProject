package Classe;

import java.time.LocalDate;
import java.util.Date; 

public abstract class CPersonne {
	
	protected int IdPers;
	protected String nom;
	protected String prenom;
	protected Date dateNaissance;
	protected String sexe;
	protected int numero;
	protected String rue;
	protected int numRue;
	protected String localite;
	protected int codePostal;
	protected String pseudo;
	protected String pass;
	
	public CPersonne(int IdPers, String nom, String prenom, Date dateNaissance, String sexe, int numero, String rue, int numRue, String localite, int codePostal, String pseudo, String pass) {
		this.IdPers = IdPers;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.sexe = sexe;
		this.numero = numero;
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
