package Classe;


import java.util.*;

public class CPersonneMembre extends CPersonne{
	
	private ArrayList<CCategorie> lstCat;
	private boolean payementCotistion;
	
	public CPersonneMembre (String nom, String prenom, Date dateNaissance, String sexe, int numero, String rue, int numRue, String localite, int codePostal, String pseudo, String pass,CCategorie cat) {
		super( nom,  prenom,  dateNaissance,  sexe,  numero,  rue,  numRue,  localite,  codePostal, pseudo, pass);
		lstCat = new ArrayList<CCategorie>();
		payementCotistion = false;
		lstCat.add(cat);
	}
	
	public CPersonneMembre() {}
	
	///////////////////////
	// Accesseur
	///////////////////////
	
	public boolean getPayementCotistion() {
		return this.payementCotistion;
	}
	
	///////////////////////
	// Mutateur
	///////////////////////
	
	public void setPayementCotistion(boolean payementCotistion) {
		this.payementCotistion = payementCotistion;
	}
	
	///////////////////////
	// Méthodes
	///////////////////////

}
