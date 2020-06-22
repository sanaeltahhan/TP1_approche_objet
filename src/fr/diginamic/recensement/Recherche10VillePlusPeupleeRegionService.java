/**
 * 
 */
package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Classe Recherche10VillePlusPeupleeRegionService, elle hérite de la classe MenuService, permet de rechercher les 10 villes les plus peuplées d'une région donnée
 * @author eltahhansana
 *
 */
public class Recherche10VillePlusPeupleeRegionService extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		System.out.println("Quel est le nom de la région dont vous souhaitez avoir les 10 villes les plus peuplées ? ");
		
		// Recupérer le choix de l'utilisateur
		String choix = scanner.nextLine();
		
		// Instanciation de la liste qui va permettre de stocker les villes d'une region donner
		List <Ville> listVilleRegion = new ArrayList<Ville>();
		
		for (Ville ville : recensement.getListVilles()) {
			if (ville.getNomRegion().equalsIgnoreCase(choix)) {
				listVilleRegion.add(ville);
			}
		}
		
		// Tri de la liste par ordre décroissant des villes les plus peuplées
		Collections.sort(listVilleRegion, new ComparatorPlusGrandeVille());
		
		// Passe une ligne
		System.out.println();
		
		System.out.println("Les 10 villes les plus peuplées de la région " + choix.toLowerCase() + " sont : \n");
		
		// Afficher les 10 premiers éléments de la liste des villes appartenant au département donner par l'utilisateur
		
		// TO DO gerer le cas ou la region n'existe pas
		for (int i = 0; i<10; i++) {
			System.out.println(listVilleRegion.get(i).getNomCommune());
		}
		
		System.out.println();
	}
		

}
