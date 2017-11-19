package Classe;


import java.util.*;

public class CPersonneMembre extends CPersonne{
	
	private int IdPersMem;
	private ArrayList<CCategorie> lstCat;
	private boolean payementCotistion;
	
	public CPersonneMembre (int IdPers, String nom, String prenom, Date dateNaissance, String sexe, String numero, String rue, String numRue, String localite, String codePostal, String pseudo, String pass, int IdPersMem,CCategorie cat) {
		super(IdPers, nom,  prenom,  dateNaissance,  sexe,  numero,  rue,  numRue,  localite,  codePostal, pseudo, pass);
		lstCat = new ArrayList<CCategorie>();
		this.IdPersMem = IdPersMem;
		payementCotistion = false;
		lstCat.add(cat);
	}
	
	public CPersonneMembre() {}
	
	///////////////////////
	// Accesseur
	///////////////////////
	
	public int getIdPersMem() {
		return IdPersMem;
	}
	
	public boolean getPayementCotistion() {
		return this.payementCotistion;
	}
	
	public ArrayList<CCategorie> getListCategorie(){
		return this.lstCat;
	}
	
	public CCategorie getListCategoriePositio(int nbr){
		return this.lstCat.get(nbr);
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
	
	
	
	public String toString() {
		return super.toString() + "(M)";
	}

}
