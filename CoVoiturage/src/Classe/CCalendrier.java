package Classe;

import java.util.ArrayList;

public class CCalendrier {
	
	private int IdCalendrier;
	private ArrayList<CBalade> lstBalade;
	private String nom;
	
	
	public CCalendrier(int IdCalendrier,String nom) {
		this.IdCalendrier = IdCalendrier;
		lstBalade = new ArrayList<CBalade>();
		this.nom = nom;
	}
	
	public CCalendrier() {}
	
	public int getIdCalendrier() {
		return this.IdCalendrier;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String toString() {
		return "Calendrier " + this.getNom();
	}
}
