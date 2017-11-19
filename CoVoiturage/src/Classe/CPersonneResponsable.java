package Classe;

import java.util.ArrayList;
import java.util.Date;

public class CPersonneResponsable extends CPersonne{
	
	private int IdPersResp;
	CCategorie cat;
	
	public CPersonneResponsable (int IdPers, String nom, String prenom, Date dateNaissance, String sexe, String numero, String rue, String numRue, String localite, String codePostal, String pseudo, String pass, int IdPersResp, CCategorie cat) {
		super(IdPers, nom,  prenom,  dateNaissance,  sexe,  numero,  rue,  numRue,  localite,  codePostal, pseudo, pass);
		this.IdPersResp = IdPersResp;
		this.cat = cat;
	}
	
	public CPersonneResponsable() {}
	
	public int getIdPersResp() {
		return this.IdPersResp;
	}
	
	public CCategorie getCategorie(){
		return this.cat;
	}
	
	///////////////////////
	// Méthodes
	///////////////////////
}
