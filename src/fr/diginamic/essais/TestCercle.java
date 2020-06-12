package fr.diginamic.essais;

import java.text.DecimalFormat;

import fr.diginamic.entites.Cercle;

/**
 * TestCercle est la classe qui sert a exécuté les méthodes crées dans Cercle
 * 
 * @author eltahhansana
 *
 */
public class TestCercle {

	/**
	 * Methode executable
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Initialisation des deux cercles
		Cercle cercle1 = new Cercle(2.0);
		Cercle cercle2 = new Cercle(4.0);
		
		//Calcul du perimetre et de la surface des deux cecles
		double perimetreCercle1 = cercle1.calculPerimetre(cercle1.getRayon());
		double surfaceCercle1 = cercle1.calculSurface(cercle1.getRayon());
		
		double perimetreCercle2 = cercle2.calculPerimetre(cercle2.getRayon());
		double surfaceCercle2 = cercle2.calculSurface(cercle2.getRayon());
		
		// Formater pour n'avoir que deux chiffres après la virgule
		DecimalFormat df = new DecimalFormat("0.00"); 
		
		//Affichage des resultats

		System.out.println("Le perimetre du cercle de rayon " + cercle1.getRayon() + " est de " + df.format(perimetreCercle1) + " et sa surface est de " + df.format(surfaceCercle1));
		System.out.println("Le perimetre du cercle de rayon " + cercle2.getRayon() + " est de " + df.format(perimetreCercle2) + " et sa surface est de " + df.format(surfaceCercle2));
				

	}

}
