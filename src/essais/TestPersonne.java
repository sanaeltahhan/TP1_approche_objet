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
		
		p1.adresse_postale.numero_de_rue = 10;
		p1.adresse_postale.libellé_de_la_rue = "rue de java";
		p1.adresse_postale.code_postal = 54400;
		p1.adresse_postale.ville = "Longwy";
		

		
		p2.nom = "EL Tahhan";
		p2.prenom = "Sana";
		p2.adresse_postale = new AdressePostale();

		
		
		System.out.println(p1);
	}
}
