package view;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class VIEW_Add {

	public static VBox getBox() { 
		VBox vbox = new VBox();
		Text text = new Text(20, 40, "ADD");
		vbox.getChildren().add(text);
		return vbox;
	}

	public static Text getText() {
		Text text = new Text();
		text.setText("Einlagern");
		return text;
	}
}
