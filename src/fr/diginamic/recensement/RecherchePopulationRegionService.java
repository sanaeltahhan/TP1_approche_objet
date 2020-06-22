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
	public void traiter(Recensement recensement, Scanner scanner) throws ClasseException {

		System.out.println("Quel est le nom de la région dont vous souhaitez rechercher la population total ?");
		
		// Recupérer le choix de l'utilisateur
		String choix = scanner.nextLine();
		
		// Initialisation Boolean pour lancer une exception si l'utilisateur donne une région inconnu
		boolean trouve = false;
		
		// Initialisation de la population d'une région
		int populationRegion = 0;
		
		// Pour chaque ville dont la region vaut le choix de l'utilisateur ajouter sa population total à la variable populationRegion
		for (Ville ville : recensement.getListVilles()) {
			if (ville.getNomRegion().equalsIgnoreCase(choix)) {
				populationRegion= populationRegion + ville.getPopulationTotale();
				trouve = true;
			}
		}
		
		if (! trouve) {
			throw new ClasseException("La région que vous avez saisie est incorrect");
		}
		
		System.out.println("La population total de le région " + choix.toLowerCase() + " est de : " + populationRegion + "\n");

		
		
				
	}

}
