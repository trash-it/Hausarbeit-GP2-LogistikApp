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

/**
 * @author  Jan Persch
 *
 */
public class CTRL_ButtonController {
	
	public static Node actionButton(String string) {
		

		
		switch(string) {
		case "showAll":
			CTRL_TableController.clearTable();
			CTRL_TableController.setTableNotChangable();
			 CTRL_TableController.setTableContent(LagerProgrammStart.getWarenliste());
			 LagerProgrammStart.changeCenterVBox(VIEW_ShowAll.getBox());
			 LagerProgrammStart.changeStatusText(VIEW_ShowAll.getText());
			 break;
		case "add":
			LagerProgrammStart.changeCenterVBox(VIEW_Add.getBox());
			LagerProgrammStart.changeStatusText(VIEW_Add.getText());
			break;
		case "change":
			CTRL_TableController.clearTable();
			CTRL_TableController.setTableChangable();
			CTRL_TableController.setTableContent(LagerProgrammStart.getWarenliste());
			
			 LagerProgrammStart.changeCenterVBox(VIEW_Change.getBox());
			 LagerProgrammStart.changeStatusText(VIEW_Change.getText());
			 
			 break;
		case "delete":
			LagerProgrammStart.changeCenterVBox(VIEW_Delete.getBox());
			LagerProgrammStart.changeStatusText(VIEW_Delete.getText());
			break;
		case "export":
			 LagerProgrammStart.changeCenterVBox(VIEW_Export.getBox());
			 LagerProgrammStart.changeStatusText(VIEW_Export.getText());
			 
			 break;
		case "import":
			LagerProgrammStart.changeCenterVBox(VIEW_Import.getBox());
			LagerProgrammStart.changeStatusText(VIEW_Import.getText());
			break;
		}
		return null;
		
		
		
	}

}
