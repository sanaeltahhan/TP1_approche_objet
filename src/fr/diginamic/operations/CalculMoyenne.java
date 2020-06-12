package fr.diginamic.operations;

import java.util.Arrays;

/**
 * Classe de clalcul de moyenne
 * @author eltahhansana
 *
 */
public class CalculMoyenne {
	
	private double [] array;

	/**
	 * Constructeur
	 * 
	 */
	public CalculMoyenne() {
		// On construit un tableau de longeur 0
		this.array = new double[0];
	}
	
	/**Methode qui permet d'ajouter un élément au tableau en gérant sa taille
	 * @param array tableau de double où l'on souhaite ajouter un élément 
	 * @param d l'élement a ajouté au tableau
	 */
	public static double[] ajout( double [] array ,double d) {
		
		double[] newArray = Arrays.copyOf(array, array.length + 1);
		newArray[array.length] = d;
		return newArray;
	}
	
	/**Methode du calcul de la moyenne des élément du tableau passé en parametre
	 * @param array tableau de double
	 * @return double
	 */
	public static double calcul(double [] array) {
		
		double somme = 0;
		for (int i = 0; i < array.length; i++) {
			somme = somme + array[i];
		}
		
		return somme/array.length;
	}
	
	

}
