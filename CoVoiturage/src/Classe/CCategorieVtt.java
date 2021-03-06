package Classe;

public abstract class CCategorieVtt extends CCategorie {
	
	protected int diamPneu;
	protected int nbrPlateau;
	public CCategorieVtt(int IdCat, String nom, int diamPneu, int nbrPlateau) {
		super(IdCat,nom);
		
		this.diamPneu = diamPneu;
		this.nbrPlateau = nbrPlateau;
	}
	
	public CCategorieVtt() {}
	
	///////////////////////
	// Accesseur
	///////////////////////
	
	
	public int getDiamPneu() {
		return this.diamPneu;
	}
	public int getNbrPlateau() {
		return this.nbrPlateau;
	}
	
	///////////////////////
	// Mutateur
	///////////////////////
	
	public void setDiamPneu(int diamPneu) {
		this.diamPneu = diamPneu;
	}
	
	///////////////////////
	// M�thodes
	///////////////////////
}
