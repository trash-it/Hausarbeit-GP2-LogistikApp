package view;

import controller.CTRL_Add;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class VIEW_Add {

	public static VBox getBox() { 
		VBox vbox = new VBox();
		Text txt_artikel = new Text(20, 40, "Artikel:");
		Text txt_anzahl = new Text(20, 40, "Anzahl:");
		Text txt_gewicht = new Text(20, 40, "Gewicht:");

		
		TextField tf_artikel = new TextField();
		TextField tf_anzahl = new TextField();
		TextField tf_gewicht = new TextField();
		
		CheckBox cb_palette = new CheckBox("Palettierbar?");
		cb_palette.setIndeterminate(true);
		
		Button btn_speichern = new Button("Speichern");
        
        btn_speichern.setOnAction(e -> CTRL_Add.actionButton(tf_artikel.getText(), Integer.parseInt(tf_anzahl.getText()), Float.parseFloat(tf_gewicht.getText()), checkCheckbox(cb_palette))); 
		
		vbox.getChildren().addAll(txt_artikel, tf_artikel, txt_anzahl, tf_anzahl, txt_gewicht, tf_gewicht, cb_palette, btn_speichern);
		return vbox;
	}

	private static boolean checkCheckbox(CheckBox cb_palette) {
		
		return cb_palette.isSelected();
	}

	public static Text getText() {
		Text text = new Text();
		text.setText("Einlagern");
		return text;
	}
}
