package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String date, double montant) {
		
		super(date, montant);
		
	}
	
	public String afficherType() {
		return "debit";
	}
	
	public double imputerSolde(double solde) {
		return solde = solde-montant;
	}
	

}
