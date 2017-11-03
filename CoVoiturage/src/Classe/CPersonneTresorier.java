package Classe;

import java.sql.Date;

public class CPersonneTresorier extends CPersonne{
	
	private int IdPersTres;
	private int fond;	
	
	public CPersonneTresorier (int IdPers,String nom, String prenom, Date dateNaissance, String sexe, int numero, String rue, int numRue, String localite, int codePostal, String pseudo, String pass, int IdPersTres) {
		super(IdPers, nom,  prenom,  dateNaissance,  sexe,  numero,  rue,  numRue,  localite,  codePostal, pseudo, pass);
		this.IdPersTres = IdPersTres;
		this.fond = 0;
	}
	
	public CPersonneTresorier (int IdPers,String nom, String prenom, Date dateNaissance, String sexe, int numero, String rue, int numRue, String localite, int codePostal, String pseudo, String pass,int IdPersTres, int fond) {
		super(IdPers, nom,  prenom,  dateNaissance,  sexe,  numero,  rue,  numRue,  localite,  codePostal, pseudo, pass);
		this.IdPersTres = IdPersTres;
		this.fond = fond;
	}
	
	public CPersonneTresorier() {}
	
	///////////////////////
	// Accesseur
	///////////////////////
	public int getIdPersTres() {
		return IdPersTres;
	}
	
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
