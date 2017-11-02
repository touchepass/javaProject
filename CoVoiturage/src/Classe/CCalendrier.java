package Classe;

import java.util.ArrayList;

public class CCalendrier {
	
	private ArrayList<CBalade> lstBalade;
	private String nom;
	
	public CCalendrier(String nom) {
		lstBalade = new ArrayList<CBalade>();
		this.nom = nom;
	}
	
	public CCalendrier() {}
	
	public String getNom() {
		return this.nom;
	}
}
