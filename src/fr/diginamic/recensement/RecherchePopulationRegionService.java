/**
 * 
 */
package fr.diginamic.recensement;

import java.util.Scanner;

/**
 * Classe RecherchePopulationRegionService, elle hérite de la classe MenuService, permet de rechercher la population total d'une région donnée
 * 
 * @author eltahhansana
 *
 */
public class RecherchePopulationRegionService extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		System.out.println("Quel est le nom de la région dont vous souhaitez rechercher la population total ?");
		
		// Recupérer le choix de l'utilisateur
		String choix = scanner.nextLine();
		
		// Initialisation de la population d'une région
		int populationRegion = 0;
		
		// Pour chaque ville dont la region vaut le choix de l'utilisateur ajouter sa population total à la variable populationRegion
		for (Ville ville : recensement.getListVilles()) {
			if (ville.getNomRegion().equalsIgnoreCase(choix)) {
				populationRegion= populationRegion + ville.getPopulationTotale();
			}
		}
		if (populationRegion == 0) {
			System.out.println("La région " + choix.toLowerCase() + " n'existe pas.");
		}
		else {
			System.out.println("La population total de le région " + choix.toLowerCase() + " est de : " + populationRegion + "\n");

		}
				
	}

}
