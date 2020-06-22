/**
 * 
 */
package fr.diginamic.recensement;

import java.util.Scanner;

/**
 * Classe RecherchePopulationVilleService, elle hérite de la classe MenuService, permet de rechercher la population total d'une ville donnée
 * 
 * @author eltahhansana
 *
 */
public class RecherchePopulationVilleService extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		System.out.println("Quel est le nom de la ville dont vous souhaitez rechercher la population total ? ");
		
		// Recupérer le choix de l'utilisateur
		String choix = scanner.nextLine();
				
		// Pour chaque ville chercher la correspondance
		for (Ville ville : recensement.getListVilles()) {
			if (ville.getNomCommune().equalsIgnoreCase(choix)
					|| ville.getNomCommune().toLowerCase().startsWith(choix.toLowerCase())) {
				
				System.out.println("La population total pour " + ville.getNomCommune() + " est de : " + ville.getPopulationTotale() + "\n");
				
			}
		}
	}

}
