/**
 * 
 */
package controller;

import javafx.scene.Node;
import view.LagerProgrammStart;
import view.VIEWAdd;
import view.VIEWChange;
import view.VIEWDelete;
import view.VIEWExport;
import view.VIEWImport;
import view.VIEWShowAll;

// TODO: Auto-generated Javadoc
/**
 * The Class CTRL_ButtonController.
 *
 * @author  Jan Persch
 */
public class CTRLButtonController {
	
    /**
     * Action button.
     *
     * @param string the string
     * @return the node
     */
    public static Node actionButton(String string) {
	switch (string) {
	   case "showAll":
	       CTRLTableController.clearTable();
	       CTRLTableController.setTableNotChangable();
	       CTRLTableController.setTableContent(LagerProgrammStart.getWarenliste());
	       LagerProgrammStart.changeCenterVBox(VIEWShowAll.getBox());
	       LagerProgrammStart.changeStatusText(VIEWShowAll.getText());
	       LagerProgrammStart.changeDescription(VIEWShowAll.getDescritptionText());
	       break;
	   case "add":
	       LagerProgrammStart.changeCenterVBox(VIEWAdd.getBox());
	       LagerProgrammStart.changeStatusText(VIEWAdd.getText());
	       LagerProgrammStart.changeDescription(VIEWAdd.getDescritptionText());
	       break;
	   case "change":
	       CTRLTableController.clearTable();
	       CTRLTableController.setTableChangable();
	       CTRLTableController.setTableContent(LagerProgrammStart.getWarenliste());
	       LagerProgrammStart.changeDescription(VIEWChange.getDescritptionText());
	       LagerProgrammStart.changeCenterVBox(VIEWChange.getBox());
	       LagerProgrammStart.changeStatusText(VIEWChange.getText());
	       break;
	   case "delete":
	       LagerProgrammStart.changeCenterVBox(VIEWDelete.getBox());
	       LagerProgrammStart.changeStatusText(VIEWDelete.getText());
	       LagerProgrammStart.changeDescription(VIEWDelete.getDescritptionText());
	       break;
	   case "export":
	       LagerProgrammStart.changeCenterVBox(VIEWExport.getBox());
	       LagerProgrammStart.changeStatusText(VIEWExport.getText());
	       LagerProgrammStart.changeDescription(VIEWExport.getDescritptionText());	 
	       break;
	   case "import":
	       LagerProgrammStart.changeCenterVBox(VIEWImport.getBox());
	       LagerProgrammStart.changeStatusText(VIEWImport.getText());
	       LagerProgrammStart.changeDescription(VIEWImport.getDescritptionText());
	       break;
	   }
	return null;
	}

}
