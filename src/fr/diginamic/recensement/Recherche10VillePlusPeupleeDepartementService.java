/**
 * 
 */
package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Classe Recherche10VillePlusPeupleeDepartementService, elle hérite de la classe MenuService, permet de rechercher les 10 villes les plus peuplées d'un département donnée
 * 
 * @author eltahhansana
 *
 */
public class Recherche10VillePlusPeupleeDepartementService extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) throws ClasseException {
		
		System.out.println("Quel est le numéro de département dont vous souhaitez avoir les 10 villes les plus peuplées ? ");
		
		// Initialisation Boolean pour lancer une exception si l'utilisateur donne departement inconnu
		boolean trouve = false;
		
		// Recupérer le choix de l'utilisateur
		String choix = scanner.nextLine();
		
		List <Ville> listVilleDepartement = new ArrayList<Ville>();
		
		for (Ville ville : recensement.getListVilles()) {
			if (ville.getCodeDepartement().equalsIgnoreCase(choix)) {
				listVilleDepartement.add(ville);
				trouve = true;
			}
		}
		
		if (! trouve) {
			throw new ClasseException("Le numero de département que vous avez saisie est incorrect");
		}
		
		// Tri de la liste par ordre décroissant des villes les plus peuplées
		Collections.sort(listVilleDepartement, new ComparatorPlusGrandeVille());
		
		// Passe une ligne
		System.out.println();
		
		System.out.println("Les 10 villes les plus peuplées du département " + choix + " sont : \n");
		
		// Si la liste contients moins de 10 éléments (ex: Paris -> 75) afficher l'intégraliter de la liste 
		// sinon afficher les 10 premiers éléments de la liste des villes appartenant au département donner par l'utilisateur
		if (listVilleDepartement.size() < 10) {
			for (int i = 0; i<listVilleDepartement.size(); i++) {
				System.out.println(listVilleDepartement.get(i).getNomCommune());
			}
		}else {
			for (int i = 0; i<10; i++) {
				System.out.println(listVilleDepartement.get(i).getNomCommune());
			}
		}
		
		System.out.println();
				

	}

}
