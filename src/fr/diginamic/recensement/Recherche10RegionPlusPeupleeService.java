/**
 * 
 */
package fr.diginamic.recensement;

import java.util.Collections;
import java.util.Scanner;

/**
 * Classe Recherche10RegionPlusPeupleeService, elle hérite de la classe MenuService, permet de rechercher les 10 régions les plus peuplées
 * @author eltahhansana
 *
 */
public class Recherche10RegionPlusPeupleeService extends MenuService {
	
	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		// Tri de la liste par ordre décroissant des plus importantes régions (en fonction de la population total dans la ville)
		Collections.sort(recensement.getListRegions(), new ComparatorPlusGrandeRegion());
		
		// Passe une ligne
		System.out.println();
		
		// Affichage des 10 premiers éléments de la liste des régions
		System.out.println("Les 10 régions les plus peuplées sont : \n");
		for (int i = 0; i<10; i++) {
			System.out.println(recensement.getListRegions().get(i).getNom() + "\n");
		}
	}

}
