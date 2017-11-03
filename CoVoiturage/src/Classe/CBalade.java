package Classe;

import java.util.*;
import java.time.LocalDate; 

public class CBalade {
	
	private int IdBalade;
	private String rue;
	private int numRue;
	private String localite;
	private int codePostal;
	private double forfait;
	private Date date;
	private ArrayList<CVehicule> lstVehicule;
	
	public CBalade (int IdBalade , String rue, int numRue, String localite, int codePostal, double forfait, Date date) {
		this.IdBalade = IdBalade;
		this.rue = rue;
		this.numRue = numRue;
		this.localite = localite;
		this.codePostal = codePostal;
		this.forfait = forfait;
		this.date = date;
		lstVehicule = new ArrayList<CVehicule>();
	}
	
	public CBalade() {}
	
	///////////////////////
	// Accesseur
	///////////////////////
	public int getIdBalade() {
		return this.IdBalade;
	}
	
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
	public Date getDate() {
		return this.date;
	}
	
	///////////////////////
	// Mutateur
	///////////////////////
	
	public void setForfait(int forfait) {
		this.forfait = forfait;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	///////////////////////
	// M�thodes
	///////////////////////
	

}
