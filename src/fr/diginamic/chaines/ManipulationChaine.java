package fr.diginamic.chaines;

import java.util.Arrays;

import entities.Personne;
import fr.diginamic.banque.entites.Compte;

/**
 * Classe ManipulationChaine pour manipuler des chaines de caracteres
 * @author eltahhansana
 *
 */
public class ManipulationChaine {

	/**
	 * Point d'entrée
	 * @param args
	 */
	public static void main(String[] args) {
		
		String chaine = "Durand;Marcel;012543;1 523.5";
		
		// Utilisez la méthode charAt(int index) pour afficher le premier caractère de la chaine de caractères.
		char premierCaractere = chaine.charAt(0);
		
		// Utilisez la méthode length() pour afficher la taille de la chaine de caractères
		int tailleChaine = chaine.length();
		
		// Utilisez la méthode indexOf(char c) pour afficher l’index du premier « ; » contenu dans la chaine de caractères.
		int index = chaine.indexOf(';');
		
		// Combinez la méthode substring et indexOf pour extraire le nom de famille de la personne.
		String nomDeFamille = chaine.substring(0, index);

		// Utilisez la méthode toUpperCase() pour afficher le nom de famille en majuscules.
		String nomDeFamilleMaj = chaine.substring(0, index).toUpperCase();

		// Utilisez la méthode toLowerCase() pour afficher le nom de famille en minuscule.
		String nomDeFamilleMin = chaine.substring(0, index).toLowerCase();
		
		//Utilisez la méthode split pour découper la chaine de caractères en morceaux. Le
		//séparateur est le caractère « ; ». Cette méthode retourne un tableau. Affichez le
		//tableau ainsi obtenu.
		String [] chaineDecouper = chaine.split(";");
		
		//Creez une instance et Client et de Compte à partir des éléments issus du découpage de la chaine de caractères.
		
		//Création de l'instance personne
		Personne personne1 = new Personne(chaineDecouper[0], chaineDecouper[1]);
		
		// Traitement de la chaine de caractères contenant le solde pour enlever l'espace 
		String chaineSansEspace = chaineDecouper[3].replace(" ", "");
		
		// Creation d'une instance compte
		Compte comptePersonne1 = new Compte(chaineDecouper[2], Double.parseDouble(chaineSansEspace));
		
		// Affichage des résultats des traitements 
		System.out.println("Premier caractère : " + premierCaractere);
		System.out.println("La taille de la chaine est : " + tailleChaine);
		System.out.println("L'index du premier ';' est " + index);
		System.out.println("Le nom de famille de la personne est : " + nomDeFamille);
		System.out.println("Le nom de famille de la personne en majuscule est : " + nomDeFamilleMaj);
		System.out.println("Le nom de famille de la personne en minuscule est : " + nomDeFamilleMin);
		System.out.println("La chaine découpée est : " + Arrays.toString(chaineDecouper));
		System.out.println(" ");
		
		System.out.println("La personne est : " + personne1.getPrenom() + " " + personne1.getNom() + "\nVoici ses informations de compte : " + comptePersonne1);
	}

}
