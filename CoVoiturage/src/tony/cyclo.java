package tony;

public class cyclo extends categorie{

	private int capacitePorteBagage;
	
	public cyclo(int capacitePorteBagage) {
		super("Cyclo");
		this.capacitePorteBagage = capacitePorteBagage;
	}
	
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
