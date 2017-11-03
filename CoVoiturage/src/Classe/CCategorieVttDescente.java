package Classe;

public class CCategorieVttDescente extends CCategorieVtt{
	
	private int IdCatVtt;
	private String caracteristique;
	
	public CCategorieVttDescente(int IdCat, int IdCatVtt, int diamPneu, int nbrPlateau, String caracteristique) {
		super(IdCat,"VttDescente", diamPneu, nbrPlateau);
		this.IdCatVtt = IdCatVtt;
		this.caracteristique = caracteristique;
	}
	
	public CCategorieVttDescente() {}
	
	public int getIdCatVtt() {
		return this.IdCatVtt;
	}
	
	public String getCaracteristique() {
		return this.caracteristique;
	}
	
}
