package maps;

import java.util.HashMap;
import java.util.Iterator;

public class FusionMap {
	
	public static void main(String args[]) {
		
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		// Creation map3
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		// Premier iterator pour ajouter les element de map1 dans map3
		Iterator <Integer> iter = map1.keySet().iterator();
		while(iter.hasNext()) {
			Integer value = iter.next();			
			map3.put(value, map1.get(value));
			
		}
		
		// Deuxieme iterator pour ajouter les element de map2 dans map3
		Iterator <Integer> iter2 = map2.keySet().iterator();
		while(iter2.hasNext()) {
			Integer value2 = iter2.next();			
			map3.put(value2, map2.get(value2));
			
		}
		
		System.out.println(map3);

	}
	

}
