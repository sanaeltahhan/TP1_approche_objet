package fr.diginamic.salaire;

/**
 * 
 * Classe fille de Intervenant, qui désigne un salarié du journal
 * 
 * @author eltahhansana
 *
 */
public class Salarie extends Intervenant {
	
	private double salaireMensuel;


	/** Constructeur
	 * @param prenom
	 * @param nom
	 * @param salaireMensuel
	 */
	public Salarie(String prenom, String nom, double salaireMensuel) {
		super(prenom, nom);
		this.salaireMensuel = salaireMensuel;
	}

	@Override
	public double getSalaire() {
		return salaireMensuel;
	}
	
	@Override
	public String getStatut() {
		return "salarié";
	}

}
