/**
 * 
 */
package controller;

import view.LagerProgrammStart;

/**
 * @author  Jan Persch
 *
 */
public class CTRL_Add {
	
	
	public static void actionButton(String name, int anzahl, float gewicht, boolean palette) {
		LagerProgrammStart.addWare(name, anzahl, gewicht, palette);
	}
}
