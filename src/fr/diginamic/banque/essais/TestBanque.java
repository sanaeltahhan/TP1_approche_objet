package fr.diginamic.banque.essais;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte compte1 = new Compte ("2344RET22",10000);
		
		System.out.println(compte1);
		//System.out.println("Le numéro du compte est : " + compte1.getNumeroDeCompte() + " et son solde est de " + compte1.getSoldeDuCompte() + " €.");
	}

}
