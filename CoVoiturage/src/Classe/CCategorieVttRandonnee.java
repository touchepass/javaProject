package Classe;

public class CCategorieVttRandonnee extends CCategorieVtt{
	
	private String caracteristique;
	
	public CCategorieVttRandonnee(String nom, int diamPneu, int nbrPlateau, String caracteristique) {
		super(nom, diamPneu, nbrPlateau);
		this.caracteristique = caracteristique;
	}
	
	public CCategorieVttRandonnee() {}
	
	public String getCaracteristique() {
		return this.caracteristique;
	}
	
}
