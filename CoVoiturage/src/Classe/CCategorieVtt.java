package Classe;

public abstract class CCategorieVtt extends CCategorie {
	
	protected int diamMinPneu;
	protected int diamPneu;
	protected int nbrPlateau;
	protected boolean conforme;
	
	public CCategorieVtt(String nom, int diamPneu, int nbrPlateau) {
		super(nom);
		this.diamMinPneu = 38;
		this.diamPneu = diamPneu;
		this.nbrPlateau = nbrPlateau;
		this.conforme = this.diamPneu >= this.diamMinPneu? true : false;
	}
	
	public CCategorieVtt() {}
	
	///////////////////////
	// Accesseur
	///////////////////////
	
	public int getDiamMinPneu() {
		return this.diamMinPneu;
	}
	public int getDiamPneu() {
		return this.diamPneu;
	}
	public int getNbrPlateau() {
		return this.nbrPlateau;
	}
	public boolean getConforme() {
		return this.conforme;
	}
	///////////////////////
	// Mutateur
	///////////////////////
	
	public void setDiamPneu(int diamPneu) {
		this.diamPneu = diamPneu;
		this.setConforme();
	}
	private void setConforme() {
		this.conforme = this.diamPneu >= this.diamMinPneu? true : false;
	}
	
	///////////////////////
	// Méthodes
	///////////////////////
}
