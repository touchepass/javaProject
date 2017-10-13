package tony;

import java.time.LocalDate;

public class responsable extends personne{
	
	categorie cat;
	
	public responsable (String nom, String prenom, LocalDate dateNaissance, char sexe, int numero, String rue, int numRue, String localite, int codePostal, categorie cat) {
		super( nom,  prenom,  dateNaissance,  sexe,  numero,  rue,  numRue,  localite,  codePostal);
		this.cat = cat;
	}
	
	///////////////////////
	// Méthodes
	///////////////////////
}
