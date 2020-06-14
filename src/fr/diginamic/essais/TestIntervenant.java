package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

/**
 * Classe de test pour la classe Intervenant
 * @author eltahhansana
 *
 */
public class TestIntervenant {

	public static void main(String[] args) {
		
		// Instanciation d'un salarié et d'un pigiste
		Salarie salarie1 = new Salarie("Marc", "Dubois", 2000.0);
		Pigiste pigiste1 = new Pigiste("Sarah", "Longois", 2, 600.0);
		
		// Affichage du salarié et du pigiste instanciés
		System.out.println("Le salaire du salarie1 est : " + salarie1.getSalaire() + " €.");
		System.out.println("Le salaire du pigiste1 est : " + pigiste1.getSalaire() + " €.");
		
		// Passe une ligne
		System.out.println();
		
		// Affichage du résultat de la méthode afficherDonnees
		salarie1.afficherDonnees();
		pigiste1.afficherDonnees();

	}

}
