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
	public void traiter(Recensement recensement, Scanner scanner) throws ClasseException {
		
		System.out.println("Quel est le numéro du département dont vous souhaitez rechercher la population total ? ");
		
		// Recupérer le choix de l'utilisateur
		String choix = scanner.nextLine();
		
		// Initialisation Boolean pour lancer une exception si l'utilisateur donne departement inconnu
		boolean trouve = false;
		
		int population = 0;
		for (Ville ville : recensement.getListVilles()) {
			if ( ville.getCodeDepartement().equalsIgnoreCase(choix)) {
				population = population + ville.getPopulationTotale();
				trouve = true;
				
			}
		}
		
		if (! trouve) {
			throw new ClasseException("Le numero de département que vous avez saisie est incorrect");
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
