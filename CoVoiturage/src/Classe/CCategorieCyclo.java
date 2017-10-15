package Classe;

public class CCategorieCyclo extends CCategorie{

	private int capacitePorteBagage;
	
	public CCategorieCyclo(int capacitePorteBagage) {
		super("Cyclo");
		this.capacitePorteBagage = capacitePorteBagage;
	}
	
	public CCategorieCyclo() {}
	
	///////////////////////
	// Accesseur
	///////////////////////
	
	public int getCapacitePorteBagage() {
		return this.capacitePorteBagage;
	}
	
	///////////////////////
	// Méthodes
	///////////////////////
}
