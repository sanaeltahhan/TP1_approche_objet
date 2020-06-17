package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import maps.Pays;

public class MapPays {

	public static void main(String[] args) {
		
		Map<String, Integer> mapPays = new HashMap<String, Integer>();
		
		mapPays.put("USA", 328_239_523);
		mapPays.put("France", 69_861_344);
		mapPays.put("Allemagne", 82_801_531);
		mapPays.put("UK", 63_421_628);
		mapPays.put("Italie", 61_302_519);
		mapPays.put("Japon", 124_856_424);
		mapPays.put("Chine", 1_408_089_559);
		mapPays.put("Russie", 126_434_660);
		mapPays.put("Inde", 1_386_249_417);
		
		String min = mapPays.keySet().iterator().next();
		
		Iterator <Integer> iter = mapPays.keySet().iterator();
		while(iter.hasNext()) {
			Integer value = iter.next();
			if (mapPays.get(value) < )
			
		}
		


	}

}
