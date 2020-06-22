/**
 * 
 */
package fr.diginamic.recensement;

import java.util.Collections;
import java.util.Scanner;

/**
 * Classe Recherche10VillePlusPeupleeService, elle hérite de la classe MenuService, permet de rechercher les 10 villes les plus peuplées de France
 *  
 * @author eltahhansana
 *
 */
public class Recherche10VillePlusPeupleeService extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		// Tri de la liste par ordre décroissant des villes les plus peuplée
		Collections.sort(recensement.getListVilles(), new ComparatorPlusGrandeVille());
		
		// Passe une ligne
		System.out.println();
		
		// Affichage des 10 premiers éléments de la liste des villes
		System.out.println("Les 10 villes les plus peuplées de France sont : \n");
		for (int i = 0; i<10; i++) {
			System.out.println(recensement.getListVilles().get(i).getNomCommune());
		}
		System.out.println();

	}

}
