package view;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class VIEW_Export {

	public static VBox getBox() { 
		VBox vbox = new VBox();
		Text text = new Text(20, 40, "EXPORT");
		vbox.getChildren().add(text);
		return vbox;
	}

	public static Text getText() {
		Text text = new Text();
		text.setText("In Datei speichern");
		return text;
	}
}
