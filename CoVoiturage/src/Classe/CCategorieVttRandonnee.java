package Classe;

public class CCategorieVttRandonnee extends CCategorieVtt{
	
	private int IdCatVtt;
	private String caracteristique;
	
	public CCategorieVttRandonnee(int IdCat, int IdCatVtt,int diamPneu, int nbrPlateau, String caracteristique) {
		super(IdCat,"VttRandonnee", diamPneu, nbrPlateau);
		this.IdCatVtt = IdCatVtt;
		this.caracteristique = caracteristique;
	}
	
	public CCategorieVttRandonnee() {}
	
	public int getIdCatVtt() {
		return this.IdCatVtt;
	}
	
	public String getCaracteristique() {
		return this.caracteristique;
	}
	
}
