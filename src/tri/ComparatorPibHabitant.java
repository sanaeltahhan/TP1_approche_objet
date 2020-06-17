package tri;

import java.util.Comparator;

public class ComparatorPibHabitant implements Comparator<Pays>{
	
	@Override
	public int compare(Pays pays1, Pays pays2) {
		int result = Double.valueOf(pays1.getPib()).compareTo(pays2.getPib());
		return result;
	}

}
