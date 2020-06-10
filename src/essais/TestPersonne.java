package essais;

import entities.AdressePostale;
import entities.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		
		p1.nom = "Dubois";
		p1.prenom = "Marc";
		p1.adresse_postale = new AdressePostale();
		
		p1.adresse_postale.numeroDeRue = 10;
		p1.adresse_postale.libelleDeLaRue = "rue de java";
		p1.adresse_postale.codePostal = 54400;
		p1.adresse_postale.ville = "Longwy";
		

		
		p2.nom = "EL Tahhan";
		p2.prenom = "Sana";
		p2.adresse_postale = new AdressePostale();

		
		
		System.out.println(p1);
	}
}
