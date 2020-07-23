package utilities;

import controller.CTRLTableController;
import view.VIEWShowAll;

/**
 * The Class initialHelper which prepares different stuff on the program start.
 */
public class InitialHelper {
	

	/**
	 * Creates the show all table.
	 */
	public static void createShowAllTable(){
		CTRLTableController.createTable();
	}

}
