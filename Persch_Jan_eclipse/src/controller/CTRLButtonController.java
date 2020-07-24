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
	       LagerProgrammStart.changeVBox(VIEWShowAll.getBox(), VIEWShowAll.getBottomBox());
	       LagerProgrammStart.changeStatusText(VIEWShowAll.getStatusText());
	       break;
	   case "add":
	       LagerProgrammStart.changeVBox(VIEWAdd.getCenterBox(), VIEWAdd.getBottomBox());
	       LagerProgrammStart.changeStatusText(VIEWAdd.getStatusText());
	       break;
	   case "change":
	       CTRLTableController.clearTable();
	       CTRLTableController.setTableChangable();
	       CTRLTableController.setTableContent(LagerProgrammStart.getWarenliste());
	       LagerProgrammStart.changeVBox(VIEWChange.getBox(), VIEWChange.getBottomBox());
	       LagerProgrammStart.changeStatusText(VIEWChange.getStatusText());
	       break;
	   case "delete":
	       LagerProgrammStart.changeVBox(VIEWDelete.getBox(), VIEWDelete.getBottomBox());
	       LagerProgrammStart.changeStatusText(VIEWDelete.getStatusText());

	       break;
	   case "export":
	       LagerProgrammStart.changeVBox(VIEWExport.getBox(), VIEWExport.getBottomBox());
	       LagerProgrammStart.changeStatusText(VIEWExport.getStatusText());
	       break;
	   case "import":
	       LagerProgrammStart.changeVBox(VIEWImport.getBox(), VIEWImport.getBottomBox());
	       LagerProgrammStart.changeStatusText(VIEWImport.getStatusText());
	       break;
	   }
	return null;
	}

}
