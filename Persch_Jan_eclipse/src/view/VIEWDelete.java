package view;


import controller.CTRLDelete;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import model.MODELWare;

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
        ObservableList<String> items = FXCollections.observableArrayList();
        for (MODELWare artikel: LagerProgrammStart.getWarenliste()) {
            items.add(artikel.getName());
        }
        list.setItems(items);
		
        Text txtartikel = new Text(20, 40, "Welcher Artikel soll gelöscht werden?:");
        TextField tfartikel = new TextField();
        Button btndelete = new Button("Löschen");
        vbox.getChildren().addAll(list, txtartikel, tfartikel, btndelete);
        btndelete.setOnAction(e -> CTRLDelete.actionButton(tfartikel.getText())); 
        return vbox;
    }
    
    /**
     * Gets the bottomBox .
     *
     * @return the bottomBox 
     */ 
    public static VBox getBottomBox() {
        VBox vbox = new VBox();
        vbox.getChildren().add(getDescriptionText()); 
        return  vbox;
    }

    /**
     * Gets the description text.
     *
     * @return the description text
     */
    public static Text getDescriptionText() {
        Text text = new Text();
        text.setText("Den zu löschenden "
                + "Artikelnamen eingeben");
        text.setTextAlignment(TextAlignment.CENTER);
        return text;	
    }
	
    /**
     * Gets the Status text.
     *
     * @return the text
     */
    public static Text getStatusText() {
        Text text = new Text();
        text.setText("Auslagern");
        
        return text;
    }
}
