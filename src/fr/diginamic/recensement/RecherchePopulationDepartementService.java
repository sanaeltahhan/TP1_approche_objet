/**
 * 
 */
package fr.diginamic.recensement;

import java.util.Scanner;

/**
 * Classe RecherchePopulationDepartementService, elle hérite de la classe MenuService, permet de rechercher la population total d'un département donnée
 * 
 * @author eltahhansana
 *
 */
public class RecherchePopulationDepartementService extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		System.out.println("Quel est le numéro du département dont vous souhaitez rechercher la population total ? ");
		
		// Recupérer le choix de l'utilisateur
		String choix = scanner.nextLine();
		
		int population = 0;
		for (Ville ville : recensement.getListVilles()) {
			if ( ville.getCodeDepartement().equalsIgnoreCase(choix)) {
				population = population + ville.getPopulationTotale();
				
			}
		}
		
		if (population > 0) {
			System.out.println("La population du département " + choix + " est de " + population);
		}
		else {
			System.out.println("Le département " + choix + " n'existe pas.");
		}
		
		System.out.println();

	}

}
