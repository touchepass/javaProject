package Classe;

public class CCategorieVttTrialiste extends CCategorieVtt{
	
	private String caracteristique;
	
	public CCategorieVttTrialiste(String nom, int diamPneu, int nbrPlateau, String caracteristique) {
		super(nom, diamPneu, nbrPlateau);
		this.caracteristique = caracteristique;
	}
	
	public CCategorieVttTrialiste() {}
	
	public String getCaracteristique() {
		return this.caracteristique;
	}
	
}
