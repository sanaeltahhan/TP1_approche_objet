package fr.diginamic.banque.essais;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte compte1 = new Compte ("2344RET22",10000);

		System.out.println(compte1);
		//System.out.println("Le numéro du compte est : " + compte1.getNumeroDeCompte() + " et son solde est de " + compte1.getSoldeDuCompte() + " €.");
		
		
		// TP 7
		Compte compte2 = new Compte ("12345AZE" , 289000);
		CompteTaux compte3 = new CompteTaux ("6789TYUI" , 30000, 0.20);
		
		Compte[] arrayComptes = {compte2, compte3} ;
		
		for (int i =0; i< arrayComptes.length; i++) {
			System.out.println( arrayComptes[i] );
			
		}
	}
	

}
