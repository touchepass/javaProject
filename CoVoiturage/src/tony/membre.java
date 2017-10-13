package tony;

import java.time.LocalDate;
import java.util.*;

public class membre extends personne{
	
	private ArrayList<categorie> lstCat;
	private boolean payementCotistion;
	
	public membre (String nom, String prenom, LocalDate dateNaissance, char sexe, int numero, String rue, int numRue, String localite, int codePostal, categorie cat) {
		super( nom,  prenom,  dateNaissance,  sexe,  numero,  rue,  numRue,  localite,  codePostal);
		lstCat = new ArrayList<categorie>();
		payementCotistion = false;
		lstCat.add(cat);
	}
	
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
