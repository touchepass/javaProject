package Classe;

public class CCategorieVttRandonnee extends CCategorieVtt{
	
	private String caracteristique;
	
	public CCategorieVttRandonnee(int diamPneu, int nbrPlateau, String caracteristique) {
		super("VttRandonnee", diamPneu, nbrPlateau);
		this.caracteristique = caracteristique;
	}
	
	public CCategorieVttRandonnee() {}
	
	public String getCaracteristique() {
		return this.caracteristique;
	}
	
}
