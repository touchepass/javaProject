package Classe;

import java.time.LocalDate;

public class CPersonneResponsable extends CPersonne{
	
	CCategorie cat;
	
	public CPersonneResponsable (String nom, String prenom, LocalDate dateNaissance, char sexe, int numero, String rue, int numRue, String localite, int codePostal, String pseudo, String pass, CCategorie cat) {
		super( nom,  prenom,  dateNaissance,  sexe,  numero,  rue,  numRue,  localite,  codePostal, pseudo, pass);
		this.cat = cat;
	}
	
	public CPersonneResponsable() {}
	
	///////////////////////
	// Méthodes
	///////////////////////
}
