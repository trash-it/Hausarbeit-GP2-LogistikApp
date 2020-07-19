package view;

import controller.CTRL_Add;
import controller.CTRL_Delete;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.MODEL_Ware;
import model.MODEL_WarenListe;

public class VIEW_Delete {

	public static VBox getBox() { 
		VBox vbox = new VBox();
		ListView<String> list = new ListView<>();
		ObservableList<String> items = FXCollections.observableArrayList ();
		for(MODEL_Ware artikel: LagerProgrammStart.getWarenliste()) {
			items.add(artikel.getName());
		}
		list.setItems(items);
		
		Text txt_artikel = new Text(20, 40, "Welcher Artikel soll gelöscht werden?:");
		TextField tf_artikel = new TextField();
		Button btn_delete = new Button("Löschen");
		vbox.getChildren().addAll(list, txt_artikel, tf_artikel, btn_delete);
		btn_delete.setOnAction(e -> CTRL_Delete.actionButton(tf_artikel.getText())); 
		return vbox;
	}

	public static Text getText() {
		Text text = new Text();
		text.setText("Auslagern");
		return text;
	}
}
