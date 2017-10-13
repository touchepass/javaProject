package tony;

import java.util.*;
import java.time.LocalDate; 

public class balade {
	
	private String rue;
	private int numRue;
	private String localite;
	private int codePostal;
	private double forfait;
	private LocalDate date;
	private ArrayList<vehicule> lstVehicule;
	
	public balade (String rue, int numRue, String localite, int codePostal, double forfait, LocalDate date) {
		this.rue = rue;
		this.numRue = numRue;
		this.localite = localite;
		this.codePostal = codePostal;
		this.forfait = forfait;
		this.date = date;
		lstVehicule = new ArrayList<vehicule>();
	}
	
	///////////////////////
	// Accesseur
	///////////////////////
	
	public String getRue() {
		return this.rue;
	}
	public int getNumRue() {
		return this.numRue;
	}
	public String getLocalite() {
		return this.localite;
	}
	public int getCodePostal() {
		return this.codePostal;
	}
	public double getForfait() {
		return this.forfait;
	}
	private LocalDate getDate() {
		return this.date;
	}
	
	///////////////////////
	// Mutateur
	///////////////////////
	
	public void setForfait(int forfait) {
		this.forfait = forfait;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	///////////////////////
	// Méthodes
	///////////////////////
	

}
