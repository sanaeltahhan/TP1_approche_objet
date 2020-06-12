package fr.diginamic.operations;

/**
 * Classe de réalisation d'operation basic (+, -, *, /)
 * 
 * @author eltahhansana
 *
 */
public class Operations {
	
	/** Methode qui retourne le resultat d'un calcul basique de deux chiffres
	 * @param a premier chiffre
	 * @param b deuxieme chiffre
	 * @param operateur opérateur du calcul
	 * @return double
	 */
	public static double calcul (double a, double b, char operateur) {
		
		double resultat = 0;
		
		switch(operateur) {
		  case '+':
			  resultat = a+b;
		    break;
		    
		  case '-':
			  resultat = a-b;
		    break;
		  case '*':
			  resultat = a*b;
		    break;
		  
		  case '/':
			  resultat = a/b;
		    break;
		  default:
		}
		return resultat;
		
	}

}
