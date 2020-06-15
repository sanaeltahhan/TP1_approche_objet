package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

/**
 * Classe de test pour la classe Maison
 * 
 * @author eltahhansana
 *
 */
public class TestMaison {

	public static void main(String[] args) {
		
		// Initialisation de la maison
		Maison maison1 = new Maison();
		
		// Ajout de pièces à cette maison
		maison1.ajouterPiece(new Chambre(20.5,0));
		maison1.ajouterPiece(new Chambre(10.5,0));
		maison1.ajouterPiece(new Chambre(20.5,1));
		maison1.ajouterPiece(new Chambre(12.5,1));
		maison1.ajouterPiece(new Cuisine(35.5,0));
		maison1.ajouterPiece(new SalleDeBain(9.5,0));
		maison1.ajouterPiece(new SalleDeBain(10.0,1));
		maison1.ajouterPiece(new Salon(35.0,0));
		maison1.ajouterPiece(new WC(5.0,0));
		maison1.ajouterPiece(new WC(5.0,1));
		
		// Saut de ligne
		System.out.println();
		
		// Affichage des résultats des méthodes 
		System.out.println("La superficie de l'étage O (RDC) est de : " + maison1.superficeEtage(0) + " m2.");
		System.out.println("La superficie de l'étage 1 est de : " + maison1.superficeEtage(1) + " m2.");
		
		// saut de ligne
		System.out.println();
		
		System.out.println("La superficie total de la maison est de : " + maison1.superficieTotal() + " m2.");

		// saut de ligne
		System.out.println();
		
		System.out.println("La superficie des pièces de type chambre est de : " + maison1.superficieType("chambre") + " m2.");
		
		// saut de ligne
		System.out.println();

		System.out.println("Le nombre de pièce de type chambre est de : " + maison1.nbrPiece("chambre"));


	}

}
