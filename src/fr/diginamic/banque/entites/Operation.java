package fr.diginamic.banque.entites;

public abstract class Operation {
	
	private String date;
	protected double montant;
	
	

	public Operation(String date, double montant) {
		super();
		this.date = date;
		this.montant = montant;
	}
	
	public abstract String afficherType();
	public abstract double imputerSolde(double solde);

	public String toString() {
		return "La date de l'operation est :  " + date + " et le montant est de : " + montant + " €";
	}

}
