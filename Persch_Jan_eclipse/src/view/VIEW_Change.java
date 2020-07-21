package view;

import controller.CTRL_TableController;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;



public class VIEW_Change {

	
	public static VBox getBox() { 
		VBox vbox = new VBox();
		vbox.getChildren().add(CTRL_TableController.getTable());
		return vbox;
	}

	public static Text getDescritptionText() {
		Text text = new Text();
		text.setText("Zellen sind editierbar \n"
				+ "Für Paletten \n"
				+ "true oder false eingeben");
		return text;	
	}
		
	public static Text getText() {
		Text text = new Text();
		text.setText("Editiere Lagerbestand");
		return text;
	}

}
