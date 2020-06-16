package fr.diginamic.essais;

import fr.diginamic.formes.interf.Cercle;
import fr.diginamic.formes.interf.ObjetGeometrique;
import fr.diginamic.formes.interf.Rectangle;

public class TestObjetGeometrique {

	public static void main(String[] args) {

		ObjetGeometrique [] tabObjGeo = new ObjetGeometrique[2];
		
		tabObjGeo[0] = new Cercle(2);
		tabObjGeo[1] = new Rectangle(2,4);
		
		for (int i=0; i<tabObjGeo.length; i++ ) {
			System.out.println("Le perimetre est : " + tabObjGeo[i].perimetre());
			System.out.println("La surface est : " + tabObjGeo[i].surface());
		}
	}

}
