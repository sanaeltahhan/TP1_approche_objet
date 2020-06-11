package fr.diginamic.banque.essais;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	
	public static void main(String[] args) {
		Credit credit1 = new Credit ("10/10/20", 200);
		Credit credit2 = new Credit ("15/06/20", 300);
		
		Debit debit1 = new Debit ("05/05/20", 20);
		Debit debit2 = new Debit ("09/06/20", 85);
		
		Operation [] arrayOperations =  {credit1, credit2, debit1, debit2};
		
		double solde = 0.0;
		
		for (int i = 0; i < arrayOperations.length; i++ ) {
			System.out.println(arrayOperations[i] + ", le type de l'operation est un " + arrayOperations[i].afficherType());
			solde = arrayOperations[i].imputerSolde(solde);
			
		}
		
		System.out.println("Le solde est de: " + solde);  

	}

}
