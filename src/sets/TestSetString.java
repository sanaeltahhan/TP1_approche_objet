package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");
		
		System.out.println(set);
		
		// Recherchez le pays dans cette liste qui a le plus grand nombre de lettres
		String paysPlusGrandNbDeLettres = set.iterator().next();
		if (paysPlusGrandNbDeLettres != null) {
			for (String element: set) {
				if (element.length()>paysPlusGrandNbDeLettres.length()) {
					paysPlusGrandNbDeLettres = element;
				}
			}
			System.out.println("Le nom du pays ayant le plus de lettres : "+paysPlusGrandNbDeLettres);
			
			// Suppression du pays 
			set.remove(paysPlusGrandNbDeLettres);
			System.out.println("La nouvelle set est :" + set);
		} else {
			System.out.println("La set est non valide");
		}
		

	}

}
