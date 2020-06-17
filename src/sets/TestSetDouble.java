package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {

		Set<Double> set = new HashSet<>();
		
		set.add(1.5);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);

		System.out.println(set);
		
		// Recherchez le plus grand élément de la collection
		double max = Integer.MIN_VALUE;
		
		for (double element : set) {
			if (element > max) {
				max = element;
			}
		}
		System.out.println("Le plus grand element de la set est : " + max);
		
		// Supprimez le plus petit élément de la collection
		double min = Integer.MAX_VALUE;
		
		for (double element : set) {
			if (element < min) {
				min = element;
			}
		}
		System.out.println("Le plus petit element de la set est : " + min);
		
		// Suppression du min de la set 
		set.remove(min);
		
		// Affichage de la set modifiée
		System.out.println(set);
		
		

	}

}
