package essais;

import entities.AdressePostale;
import entities.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne p1 = new Personne("Dubois","Marc");
		Personne p2 = new Personne("Dupont", "Lisa", new AdressePostale(1,"rue de la paix",54444,"Lala"));
		
		
		
		System.out.println(p1);
	}
}
