/**
 * 
 */
package controller;

import javafx.scene.Node;

import view.LagerProgrammStart;
import view.VIEW_Add;
import view.VIEW_Change;
import view.VIEW_Delete;
import view.VIEW_Export;
import view.VIEW_Import;
import view.VIEW_ShowAll;
import model.MODEL_WarenListe; 

/**
 * @author  Jan Persch
 *
 */
public class CTRL_Add {
	
	
	public static void actionButton(String name, int anzahl, float gewicht, boolean palette) {
		
		
		LagerProgrammStart.addWare(name, anzahl, gewicht, palette);
		

		
		
	}

}
