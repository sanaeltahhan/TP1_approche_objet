package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	private double tauxRemuneration;

	public CompteTaux(String numeroDeCompte, double soldeDuCompte, double tauxRemuneration) {
		super(numeroDeCompte, soldeDuCompte);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", et le taux de remuneration est de " + tauxRemuneration;
		
	}

}
