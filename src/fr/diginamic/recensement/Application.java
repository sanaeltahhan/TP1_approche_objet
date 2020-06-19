package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;

import tri.ComparatorPibHabitant;

/**
 * Classe Application qui va permettre d'executer notre code
 * @author eltahhansana
 *
 */
public class Application {

	// Point d'entrée de l'application
	public static void main(String[] args) {

		try {
			File file = new File("/Users/eltahhansana/Documents/DTA_Ing/Java11/TP_approche_objet/recensement 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			
			// Permet de retirer l'entête du fichier CSV de la liste
		    lignes.remove(0);
		    
		    List<Ville> listeVille = new ArrayList <Ville>();
		    
			for (String ligne : lignes ) {
				
				// Decoupages de chaque ligne en tableau de chaine de caractère grâce au séparateur ";"
				String [] parties = ligne.split(";");
				
				// Affectation de chaque case du tableau au variable correspondante
				int codeRegion = Integer.parseInt(parties[0]);
				String nomRegion = parties[1];
				String codeDepartement = parties[2];
				int codeCommune = Integer.parseInt(parties[5]);
				String nomCommune = parties[6];
				String populationTot = parties[9];
				
				// On enleve les espaces pour la population et on convertit en int
				int populationTotale = Integer.parseInt(populationTot.replace(" ", "").trim());
				
				// Instanciation d'un objet Ville avec les informations récupérées
				Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);
				
				listeVille.add(ville);
								
				//System.out.println(Arrays.toString(parties));

			}
			
			//System.out.println(listeVille);
			
			//System.out.println("Le nombre de lignes du fichier est de : " + lignes.size());
			
			// Recherchez dans la liste la ville de Montpellier et affichez toutes les informations la concernant
			for (Ville ville : listeVille) {
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
			
			/*
			 * Ville departementPlusPeplee; for (Ville ville : listeVilleReg) { if
			 * (ville.getPopulationTotale())
			 * 
			 * }
			 */
			
			// ------------- Afficher les 10 villes les plus peuplées de France----------
			
			// Tri de la liste par ordre décroissant des villes les  plus peuplées
			Collections.sort(listeVille, new ComparatorPlusGrandeVille());
			System.out.println();
			System.out.println("Les 10 villes les plus peuplées de france sont : ");
			for (int i = 0; i<10; i++) {
				System.out.println(listeVille.get(i).getNomCommune());
				
			}
			
			
		}
		catch (IOException e){
			
			System.out.println(e.getMessage());
			
		}
	}

}
