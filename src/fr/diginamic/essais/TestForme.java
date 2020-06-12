package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

/**
 * Classe de test de la classe Forme
 * @author eltahhansana
 *
 */
public class TestForme {

	public static void main(String[] args) {
		
		
		// Instanciation des différentes formes
		Cercle cercle1 = new Cercle(2);
		Rectangle rec1 = new Rectangle(3,6);
		Carre carre1 = new Carre(2,2);
		
		// Instanciation de l'affichage du perimetre et de la surface des formes
		AffichageForme affichage = new AffichageForme();
		
		// Affichage des résultats
		System.out.println("Pour le cercle1 : ");  
		affichage.afficher(cercle1);
		
		System.out.println("");
		
		System.out.println("Pour le rec1 : ");  
		affichage.afficher(rec1);
		
		System.out.println("");

		System.out.println("Pour le carre1 : ");  
		affichage.afficher(carre1);;
		
				

	}

}
