package view;


import controller.CTRLDelete;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.MODELWare;


// TODO: Auto-generated Javadoc
/**
 * The Class VIEW_Delete.
 */
public class VIEWDelete {

	/**
	 * Gets the box.
	 *
	 * @return the box
	 */
	public static VBox getBox() { 
		VBox vbox = new VBox();
		ListView<String> list = new ListView<>();
		ObservableList<String> items = FXCollections.observableArrayList ();
		for(MODELWare artikel: LagerProgrammStart.getWarenliste()) {
			items.add(artikel.getName());
		}
		list.setItems(items);
		
		Text txt_artikel = new Text(20, 40, "Welcher Artikel soll gelöscht werden?:");
		TextField tf_artikel = new TextField();
		Button btn_delete = new Button("Löschen");
		vbox.getChildren().addAll(list, txt_artikel, tf_artikel, btn_delete);
		btn_delete.setOnAction(e -> CTRLDelete.actionButton(tf_artikel.getText())); 
		return vbox;
	}

	/**
	 * Gets the descritption text.
	 *
	 * @return the descritption text
	 */
	public static Text getDescritptionText() {
		Text text = new Text();
		text.setText("Den zu löschenden \n "
				+ "Artikelnamen eingeben");
		return text;	
	}
	
	/**
	 * Gets the text.
	 *
	 * @return the text
	 */
	public static Text getText() {
		Text text = new Text();
		text.setText("Auslagern");
		return text;
	}
}
