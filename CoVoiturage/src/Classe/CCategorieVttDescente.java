package Classe;

public class CCategorieVttDescente extends CCategorieVtt{
	
	private String caracteristique;
	
	public CCategorieVttDescente(int diamPneu, int nbrPlateau, String caracteristique) {
		super("VttDescente", diamPneu, nbrPlateau);
		this.caracteristique = caracteristique;
	}
	
	public CCategorieVttDescente() {}
	
	public String getCaracteristique() {
		return this.caracteristique;
	}
	
}
