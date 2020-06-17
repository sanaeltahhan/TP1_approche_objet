package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays pays1, Pays pays2) {
		int result = Integer.valueOf(pays1.getNbrHabitant()).compareTo(pays2.getNbrHabitant());
		return result;
	}

}
