/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jan Persch
 *
 */
public class MODEL_WarenListe {
	
	public List<MODEL_Ware> warenListe = new ArrayList<>();

	int number;
	
	public MODEL_WarenListe() {
	

	}
	
	public void addWare(String name, int anzahl, double gewicht, boolean palette) {
		warenListe.add(new MODEL_Ware(name, anzahl, gewicht, palette));
		
	}
	
	public String getName() {
		return warenListe.get(0).getName();
	}
	
	public int getAnzahl() {
		return warenListe.get(0).getAnzahl();
	}
	
	public double getGewicht() {
		return warenListe.get(0).getGewicht();
	}
	
	public double getGewicht1() {
		return warenListe.get(1).getGewicht();
	}
	
	public boolean getPalette() {
		return warenListe.get(0).isPalette();
	}

	public MODEL_Ware getWare(int number) {
		return warenListe.get(number);
		
	}
}
