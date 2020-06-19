/**
 * 
 */
package fr.diginamic.recensement;

import java.util.Comparator;

/**
 *Classe ComparatorPlusPetiteVille qui permet de trier les villes en fonction de leur population de la plus petite à la plus grande 
 *
 * @author eltahhansana
 *
 */
public class ComparatorPlusPetiteVille implements Comparator<Ville> {

	@Override
	public int compare(Ville ville1, Ville ville2) {
		int result = Integer.valueOf(ville1.getPopulationTotale()).compareTo(ville2.getPopulationTotale());
		return result;

	}

}
