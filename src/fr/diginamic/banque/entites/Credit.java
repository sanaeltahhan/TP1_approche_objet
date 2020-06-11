package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String date, double montant) {
		
		super(date, montant);
		
	}
	
	public String afficherType() {
		return "credit";
	}
	
	public double imputerSolde(double solde) {
		return solde = solde+montant;
	}

}
