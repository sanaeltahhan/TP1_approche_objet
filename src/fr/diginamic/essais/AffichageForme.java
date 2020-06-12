package fr.diginamic.essais;

import java.text.DecimalFormat;

import fr.diginamic.formes.Forme;

/**
 * 
 * Classe pour afficher le perimetre ainsi que la surface d'une forme
 * @author eltahhansana
 *
 */
public class AffichageForme {
	
	public static void afficher (Forme forme) {
		
		// Formater pour n'avoir que deux chiffres après la virgule
		DecimalFormat df = new DecimalFormat("0.00"); 
		
		System.out.println("Le perimetre est "+df.format(forme.calculerPerimetre() )+ " et sa surface est " + df.format(forme.calculerSurface()));
	}

}
