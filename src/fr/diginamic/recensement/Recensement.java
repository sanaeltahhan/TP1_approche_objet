/**
 * 
 */
package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

/**
 * @author eltahhansana
 *
 */
public class Recensement {
	
	
	/** listVilles */
	private List<Ville> listVilles  = new ArrayList<Ville>();
	
	/** listRegions */
	private List<Region> listRegions = new ArrayList<Region>();
	
	private List<Departement> listDepartement = new ArrayList<Departement>();

	/** Getter
	 * @return the listVilles
	 */
	public List<Ville> getListVilles() {
		return listVilles;
	}

	/** Setter
	 * @param listVilles the listVilles to set
	 */
	public void setListVilles(List<Ville> listVilles) {
		this.listVilles = listVilles;
	}

	/** Getter
	 * @return the listRegions
	 */
	public List<Region> getListRegions() {
		return listRegions;
	}

	/** Setter
	 * @param listRegions the listRegions to set
	 */
	public void setListRegions(List<Region> listRegions) {
		this.listRegions = listRegions;
	}

	/** Getter
	 * @return the listDepartement
	 */
	public List<Departement> getListDepartement() {
		return listDepartement;
	}

	/** Setter
	 * @param listDepartement the listDepartement to set
	 */
	public void setListDepartement(List<Departement> listDepartement) {
		this.listDepartement = listDepartement;
	}
	

	

}
