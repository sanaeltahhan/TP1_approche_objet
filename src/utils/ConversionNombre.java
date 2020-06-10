package utils;

import static java.lang.Integer.max;

public class ConversionNombre {

	public static void main(String[] args) {
		
		String nbr = "100";
		int result = Integer.parseInt(nbr);
		System.out.println("Le résultat est : " + result);

		int a = 15;
		int b = 23;
		
		int max = max(a, b);
		// int max = Integer.max(a, b);
		
		System.out.println(max);
		

	}

}
