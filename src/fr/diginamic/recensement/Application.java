package fr.diginamic.recensement;

import java.util.Scanner;

/**
 * Classe Application qui va permettre d'executer notre code
 * 
 * @author eltahhansana
 *
 */
public class Application {

	// Point d'entrée de l'application
	public static void main(String[] args) {

		// Initialisation du Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Initialisation du Recensement
		Recensement recensement = RecensementUtil.lire();

		
		if (recensement == null) {
			System.out.println("L'application s'est s'arrétée, le fichier est corrompu ou n'existe pas.");
			System.exit(0);
		}
		
		// Menu utilisateur
		int choix = 0;
		
		do {
			// Affichage du menu
			System.out.println("***** Recensement population *****");
			System.out.println("1. Rechercher la population d'une ville");
			System.out.println("2. Rechercher la population d'un département");
			System.out.println("3. Rechercher la population d'une région");
			System.out.println("4. Rechercher les 10 régions les plus peuplées");
			System.out.println("5. Rechercher les 10 départements les plus peuplées");
			System.out.println("6. Rechercher les 10 villes les plus peuplées d'un département");
			System.out.println("7. Rechercher les 10 villes les plus peuplées d'une région");
			System.out.println("8. Rechercher les 10 villes les plus peuplées de France");
			System.out.println("9. Sortir");
			
			
			// Poser une question à l'utilisateur
			String choixUtilisateur = scanner.nextLine();

			// Conversion du choix utilisateur en int
			choix = Integer.parseInt(choixUtilisateur);

			// On exécute l'option correspondant au choix de l'utilisateur
			switch (choix) {
			case 1:
				RecherchePopulationVilleService rechercheVille = new RecherchePopulationVilleService();
				try {
					rechercheVille.traiter(recensement, scanner);
				} catch (ClasseException e2) {
					//e2.printStackTrace();
					System.err.println(e2.getMessage());
				}
				break;
			
			  case 2: RecherchePopulationDepartementService rechercheDept = new RecherchePopulationDepartementService(); 
			  	try {
					rechercheDept.traiter(recensement,scanner);
				} catch (ClasseException e1) {
					//e1.printStackTrace();
					System.err.println(e1.getMessage());
				} 
			  	break; 
			  
			  case 3: RecherchePopulationRegionService rechercheRegion = new RecherchePopulationRegionService(); 
			  	try {
					rechercheRegion.traiter(recensement,scanner);
				} catch (ClasseException e1) {
					//e1.printStackTrace();
					System.err.println(e1.getMessage());
				} 
			  	break;
			  	
			  case 4: Recherche10RegionPlusPeupleeService rechercheRegionPlusPeuplee = new Recherche10RegionPlusPeupleeService(); 
			  	rechercheRegionPlusPeuplee.traiter(recensement,scanner); 
			  	break;
			  	
			  case 5: Recherche10DepartementPlusPeupleeService rechercheDepartementPlusPeuplee = new Recherche10DepartementPlusPeupleeService(); 
			  	rechercheDepartementPlusPeuplee.traiter(recensement,scanner); 
			  	break; 
			  
			  case 6: Recherche10VillePlusPeupleeDepartementService rechercheVillePlusPeupleeDepartement = new Recherche10VillePlusPeupleeDepartementService(); 
				try {
					rechercheVillePlusPeupleeDepartement.traiter(recensement,scanner);
				} catch (ClasseException e) {
					//e.printStackTrace();
					System.err.println(e.getMessage());
				} 
			  	break;
			  
			  case 7: Recherche10VillePlusPeupleeRegionService rechercheVillePlusPeupleeRegion = new Recherche10VillePlusPeupleeRegionService(); 
				try {
					rechercheVillePlusPeupleeRegion.traiter(recensement,scanner);
				} catch (ClasseException e) {
					//e.printStackTrace();
					System.err.println(e.getMessage());
				} 
			  	break;
			  	
			  case 8: Recherche10VillePlusPeupleeService rechercheVillePlusPeuplee = new Recherche10VillePlusPeupleeService(); 
			  rechercheVillePlusPeuplee.traiter(recensement,scanner); 
			  	break;
			 
			}
		} while (choix != 9);

		scanner.close();
	}
}
		
		// #################### ANCIEN CODE EXO INTRO #############################
		//}
		
		/*for (Ville ville : listeVille) {
			if (ville.getNomCommune().equals("Montpellier")) {
				System.out.println("Les informations de cette ville sont: " + ville);
			}
		}
		
		System.out.println();
		
		// Exploitez les données dont vous disposez pour afficher la population de tout le département de l’Hérault.
		int population = 0;
		for (Ville ville : listeVille) {
			if ( ville.getCodeDepartement().equals("34")) {
				population = population + ville.getPopulationTotale();
				
			}
		}
		System.out.println("La population de tout le département d'Hérault est de " + population);
		
		// Affichez la plus petite ville du département
		Ville plusPetiteVilleDep = listeVille.get(0);
		
		for (Ville ville : listeVille) {
			if (ville.getPopulationTotale() < plusPetiteVilleDep.getPopulationTotale() && ville.getCodeDepartement().equals("34")) {
				plusPetiteVilleDep = ville;
			}
		}
		System.out.println();
		System.out.println("La plus petite ville de ce département est : " + plusPetiteVilleDep.getNomCommune());
		
		// Affichez les 10 plus grandes villes du département
		// Initialisation d'une liste qui va contenir toute les ville d'un département donnée
		List<Ville> listeVilleDep= new ArrayList<Ville>();
		
		// Remplissage de listeVilleDep avec toute les villes d'un departement donnée
		for (Ville ville : listeVille) {
			if (ville.getCodeDepartement().equals("34")) {
				listeVilleDep.add(ville);
			}
		}
		
		// Tri de la liste par ordre décroissant des plus grande ville d'un département donnée (en fonction de la population total dans la ville)
		Collections.sort(listeVilleDep, new ComparatorPlusGrandeVille());
		
		// Passe une ligne
		System.out.println();
		
		// Affichage des 10 premiers éléments de la liste listeVilleDep
		System.out.println("Les 10 plus grandes villes de ce département sont : ");
		for (int i =0; i<10; i++) {
			System.out.println(listeVilleDep.get(i).getNomCommune());
		}
		
		// Affichez les 10 plus petites villes du département
		
		// Tri de la liste par ordre croissant des plus petite ville d'un département donnée (en fonction de la population total dans la ville)
		Collections.sort(listeVilleDep, new ComparatorPlusPetiteVille());
		
		// Passe une ligne 
		System.out.println();
		System.out.println("Les 10 plus petites villes de ce département sont : ");
		for (int i =0; i<10; i++) {
			System.out.println(listeVilleDep.get(i).getNomCommune());
		}
		
		// Affichez la population de toute la région Occitanie
		
		// Initialisation varible pour faire la somme
		int populationRegion = 0;
		
		// Pour chaque ville dont la region vaut Occitanie ajouter sa population total à la variable populationRegion
		for (Ville ville : listeVille) {
			if (ville.getNomRegion().equals("Occitanie")) {
				populationRegion= populationRegion + ville.getPopulationTotale();
			}
		}
		// Passe une ligne 
		System.out.println();
		
		// Affichage de la population total de la region donnée
		System.out.println("La population total de cette region est de : " + populationRegion);
		
		// -------- Affichez les 10 villes les plus importantes de la région Occitanie----------
		
		// Initialisation d'une liste qui va contenir toute les ville d'une région donnée
		List<Ville> listeVilleReg= new ArrayList<Ville>();
		
		// Remplissage de listeVilleReg avec toute les villes une region donnée
		for (Ville ville : listeVille) {
			if (ville.getNomRegion().equals("Occitanie")) {
				listeVilleReg.add(ville);
			}
		}
		
		// Tri de la liste par ordre décroissant des plus importante ville d'une region donnée (en fonction de la population total dans la ville)
		Collections.sort(listeVilleReg, new ComparatorPlusGrandeVille());
		
		// Passe une ligne
		System.out.println();
		
		// Affichage des 10 premiers éléments de la liste listeVilleReg
		System.out.println("Les 10 plus importante villes de la region Occitanie sont : ");
		for (int i = 0; i<10; i++) {
			System.out.println(listeVilleReg.get(i).getNomCommune());
		}
		
		// -----------Affichez le département le plus peuplé de la région Occitanie---------
		
		
		 * Ville departementPlusPeplee; for (Ville ville : listeVilleReg) { if
		 * (ville.getPopulationTotale())
		 * 
		 * }
		 
		
		// ------------- Afficher les 10 villes les plus peuplées de France----------
		
		// Tri de la liste par ordre décroissant des villes les  plus peuplées
		Collections.sort(listeVille, new ComparatorPlusGrandeVille());
		System.out.println();
		System.out.println("Les 10 villes les plus peuplées de france sont : ");
		for (int i = 0; i<10; i++) {
			System.out.println(listeVille.get(i).getNomCommune());
			
		}
		
			
			
			 * } catch (IOException e){
			 * 
			 * System.out.println(e.getMessage());
			 * 
			 * }
			 */

