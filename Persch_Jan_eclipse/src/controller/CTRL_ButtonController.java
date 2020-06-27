/**
 * 
 */
package controller;

import javafx.scene.Node;
import view.LagerProgrammStart;
import view.VIEW_Add;
import view.VIEW_ShowAll;

/**
 * @author  Jan Persch
 *
 */
public class CTRL_ButtonController {
	
	public static Node actionButton(String string) {
		
		switch(string) {
		case "showAll":
			 LagerProgrammStart.changeCenterVBox(VIEW_ShowAll.getBox());
			 LagerProgrammStart.changeStatusText(VIEW_ShowAll.getText());
			 
			 break;
		case "add":
			LagerProgrammStart.changeCenterVBox(VIEW_Add.getBox());
			LagerProgrammStart.changeStatusText(VIEW_Add.getText());
			break;
		}
		return null;
		
		
		
	}

}
