package Classe;

public class CCategorieVttDescente extends CCategorieVtt{
	
	private String caracteristique;
	
	public CCategorieVttDescente(String nom, int diamPneu, int nbrPlateau, String caracteristique) {
		super(nom, diamPneu, nbrPlateau);
		this.caracteristique = caracteristique;
	}
	
	public CCategorieVttDescente() {}
	
	public String getCaracteristique() {
		return this.caracteristique;
	}
	
}
