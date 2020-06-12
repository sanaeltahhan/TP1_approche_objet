package fr.diginamic.essais;

import java.util.Arrays;

import fr.diginamic.operations.CalculMoyenne;

/**
 * Classe de test pour la classe CalculMoyenne 
 * @author eltahhansana
 *
 */
public class TestMoyenne {

	public static void main(String[] args) {
		
		//Initialisation d'un tableau de double
		double [] array =  {1.2, 27.8, 12.3, 5.0};
		
		// Ajout d'un élément au tableau array
		double [] nouveauArray = CalculMoyenne.ajout(array,2);
		
		// Calcul moyenne de nouveauArray
		double moyenneArray = CalculMoyenne.calcul(nouveauArray);
		
		// Affichage des résultats
		System.out.println("Le nouveau tableau est : " + Arrays.toString(nouveauArray));
		System.out.println("La moyenne de ce nouveau tableau est :" + moyenneArray);

	}

}
