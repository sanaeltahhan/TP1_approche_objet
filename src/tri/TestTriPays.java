package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTriPays {

	public static void main(String[] args) {

		// Initialisation d'un Set
		List<Pays> list = new ArrayList<>();
		
		// Remplissage du Set
		list.add(new Pays("USA", 328_239_523, 62606));
		list.add(new Pays("France", 69_861_344, 43551));
		list.add(new Pays("Allemagne", 82_801_531, 50206));
		list.add(new Pays("UK", 63_421_628, 43620));
		list.add(new Pays("Italie", 61_302_519, 37970));
		list.add(new Pays("Japon", 124_856_424, 42659));
		list.add(new Pays("Chine", 1_408_089_559, 16624));
		list.add(new Pays("Russie", 126_434_660, 27900));
		list.add(new Pays("Inde", 1_386_249_417, 5174));
		
		// Tri de la liste
		Collections.sort(list);
		
		System.out.println(list);
	}

}
