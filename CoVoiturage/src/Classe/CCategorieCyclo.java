package Classe;

public class CCategorieCyclo extends CCategorie{
	
	private int IdCatCyclo;
	private int capacitePorteBagage;
	
	public CCategorieCyclo(int IdCat, int IdCatCyclo, int capacitePorteBagage) {
		super(IdCat,"Cyclo");
		this.IdCatCyclo = IdCatCyclo;
		this.capacitePorteBagage = capacitePorteBagage;
	}
	
	public CCategorieCyclo() {}
	
	///////////////////////
	// Accesseur
	///////////////////////
	
	public int getIdCatCyclo() {
		return this.IdCatCyclo;
	}
	
	public int getCapacitePorteBagage() {
		return this.capacitePorteBagage;
	}
	
	///////////////////////
	// Méthodes
	///////////////////////
}
