package Classe;

import java.util.Date;

public class CPersonneResponsable extends CPersonne{
	
	CCategorie cat;
	
	public CPersonneResponsable (String nom, String prenom, Date dateNaissance, String sexe, int numero, String rue, int numRue, String localite, int codePostal, String pseudo, String pass, CCategorie cat) {
		super( nom,  prenom,  dateNaissance,  sexe,  numero,  rue,  numRue,  localite,  codePostal, pseudo, pass);
		this.cat = cat;
	}
	
	public CPersonneResponsable() {}
	
	///////////////////////
	// Méthodes
	///////////////////////
}
