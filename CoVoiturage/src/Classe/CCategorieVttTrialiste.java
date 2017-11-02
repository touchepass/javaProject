package Classe;

public class CCategorieVttTrialiste extends CCategorieVtt{
	
	private String caracteristique;
	
	public CCategorieVttTrialiste(int diamPneu, int nbrPlateau, String caracteristique) {
		super("VttTrialiste", diamPneu, nbrPlateau);
		this.caracteristique = caracteristique;
	}
	
	public CCategorieVttTrialiste() {}
	
	public String getCaracteristique() {
		return this.caracteristique;
	}
	
}
