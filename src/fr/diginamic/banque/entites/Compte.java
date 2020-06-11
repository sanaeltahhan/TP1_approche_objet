package fr.diginamic.banque.entites;

public class Compte {
	
	private String numeroDeCompte;
	private double soldeDuCompte;
	
	public Compte(String numeroDeCompte, double soldeDuCompte) {
		this.numeroDeCompte = numeroDeCompte;
		this.soldeDuCompte = soldeDuCompte;
	}
	
	public String toString() {
	    return "Le numero de compte est " + numeroDeCompte + " et son solde est " + soldeDuCompte ;
	}

	public String getNumeroDeCompte() {
		return numeroDeCompte;
	}

	public void setNumeroDeCompte(String numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}

	public double getSoldeDuCompte() {
		return soldeDuCompte;
	}

	public void setSoldeDuCompte(double soldeDuCompte) {
		this.soldeDuCompte = soldeDuCompte;
	}
	
	
	
	

	

}
