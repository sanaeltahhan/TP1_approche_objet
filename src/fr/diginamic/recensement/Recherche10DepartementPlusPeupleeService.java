/**
 * 
 */
package fr.diginamic.recensement;

import java.util.Collections;
import java.util.Scanner;

/**
 * Classe Recherche10DepartementPlusPeupleeService, elle hérite de la classe MenuService, permet de rechercher les 10 département les plus peuplés
 * 
 * @author eltahhansana
 *
 */
public class Recherche10DepartementPlusPeupleeService extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		// Tri de la liste par ordre décroissant des plus importants départements (en fonction de la population total dans la ville)
		Collections.sort(recensement.getListDepartement(), new ComparatorPlusGrandDepartement());
		
		// Passe une ligne
		System.out.println();
		
		// Affichage des 10 premiers éléments de la liste de département
		System.out.println("Le numéro des 10 départements les plus peuplées sont : \n");
		for (int i = 0; i<10; i++) {
			System.out.println(recensement.getListDepartement().get(i).getCode());
		}
		System.out.println();

	}

}
