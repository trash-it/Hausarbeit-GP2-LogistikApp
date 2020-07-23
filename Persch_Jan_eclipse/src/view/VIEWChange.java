package view;

import controller.CTRLTableController;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;



// TODO: Auto-generated Javadoc
/**
 * The Class VIEW_Change.
 */
public class VIEWChange {

	
	/**
	 * Gets the box.
	 *
	 * @return the box
	 */
	public static VBox getBox() { 
		VBox vbox = new VBox();
		vbox.setPadding(new Insets(10, 50 , 50 , 50));
		vbox.getChildren().add(CTRLTableController.getTable());
		return vbox;
	}

	/**
	 * Gets the descritption text.
	 *
	 * @return the descritption text
	 */
	public static Text getDescritptionText() {
		Text text = new Text();
		text.setText("Zellen sind editierbar \n"
				+ "Für Paletten \n"
				+ "true oder false eingeben");
		return text;	
	}
		
	/**
	 * Gets the text.
	 *
	 * @return the text
	 */
	public static Text getText() {
		Text text = new Text();
		text.setText("Editiere Lagerbestand");
		return text;
	}

}
