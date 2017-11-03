package Classe;

public class CCategorieVttTrialiste extends CCategorieVtt{
	
	private int IdCatVtt;
	private String caracteristique;
	
	public CCategorieVttTrialiste(int IdCat, int IdCatVtt,int diamPneu, int nbrPlateau, String caracteristique) {
		super(IdCat,"VttTrialiste", diamPneu, nbrPlateau);
		this.IdCatVtt = IdCatVtt;
		this.caracteristique = caracteristique;
	}
	
	public CCategorieVttTrialiste() {}
	
	public int getIdCatVtt() {
		return this.IdCatVtt;
	}
	
	public String getCaracteristique() {
		return this.caracteristique;
	}
	
}
