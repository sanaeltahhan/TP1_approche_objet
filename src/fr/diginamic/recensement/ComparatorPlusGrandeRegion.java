/**
 * 
 */
package fr.diginamic.recensement;

import java.util.Comparator;

/**
 * Classe ComparatorPlusGrandeRegion qui permet de trier les régions en fonction de leur population de la plus grande à la plus petite
 *  
 * @author eltahhansana
 *
 */
public class ComparatorPlusGrandeRegion implements Comparator<Region> {
	
	@Override
	public int compare(Region region1, Region region2) {
		int result = Integer.valueOf(region1.getPopulation()).compareTo(region2.getPopulation());
		return -result;

	}

}
