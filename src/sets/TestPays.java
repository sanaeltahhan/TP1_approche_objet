package sets;

import java.util.HashSet;
import java.util.Set;

/**
 * Classe de test pour la classe Test
 * @author eltahhansana
 *
 */
public class TestPays {

	public static void main(String[] args) {
		
		// Initialisation d'un Set
		Set<Pays> set = new HashSet<>();
		
		// Remplissage du Set
		set.add(new Pays("USA", 328_239_523, 62606));
		set.add(new Pays("France", 69_861_344, 43551));
		set.add(new Pays("Allemagne", 82_801_531, 50206));
		set.add(new Pays("UK", 63_421_628, 43620));
		set.add(new Pays("Italie", 61_302_519, 37970));
		set.add(new Pays("Japon", 124_856_424, 42659));
		set.add(new Pays("Chine", 1_408_089_559, 16624));
		set.add(new Pays("Russie", 126_434_660, 27900));
		set.add(new Pays("Inde", 1_386_249_417, 5174));
		

		
		System.out.println(set);
		
		// Recherchez le pays avec le PIB/habitant le plus important
		Pays paysPibMax = set.iterator().next();
		
		for (Pays element : set) {
			if (element.getPib() > paysPibMax.getPib()) {
				paysPibMax = element;
			}
		}
		System.out.println();
		
		System.out.println("Le pays avec le PIB/habitant le plus important est : " + paysPibMax);
				
		// Recherchez le pays avec le PIB total le plus important
		Pays paysPibTotal = set.iterator().next();
		for (Pays element : set) {
			if (element.getPib() * element.getNbrHabitant() > paysPibTotal.getPib() * paysPibTotal.getNbrHabitant()) {
				paysPibTotal = element;
			}
		}
		System.out.println();

		System.out.println("Le pays avec le PIB total le plus important est : " + paysPibTotal + ", il est de " + paysPibTotal.getPib() * paysPibTotal.getNbrHabitant());

		// Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le plus petit
		Pays paysPibTotalMin = set.iterator().next();
		for (Pays element : set) {
			if (element.getPib() * element.getNbrHabitant() < paysPibTotalMin.getPib() * paysPibTotalMin.getNbrHabitant()) {
				paysPibTotalMin = element;
			}
		}
		
		System.out.println();
		System.out.println("Le pays ayant le PIB total le plus faible est : " + paysPibTotalMin.getNom() + ", avec " + paysPibTotalMin.getPib() * paysPibTotalMin.getNbrHabitant());
		
		System.out.println();
		
		paysPibTotalMin.setNom(paysPibTotalMin.getNom().toUpperCase());
		System.out.println(set);
		
		// Supprimez le pays dont le PIB total est le plus petit
		set.remove(paysPibTotalMin);
		
		System.out.println();
		
		System.out.println("La set final est : " + set);

	}

}
