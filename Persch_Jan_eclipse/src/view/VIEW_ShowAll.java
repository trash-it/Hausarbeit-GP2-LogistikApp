package view;

import java.util.ArrayList;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.MODEL_Ware;


public class VIEW_ShowAll {

	static TableView<MODEL_Ware> tbl_table = new TableView<MODEL_Ware>();
	static TableColumn<MODEL_Ware, String> tc_artikel = new TableColumn<MODEL_Ware, String>("Artikel");
	static TableColumn<MODEL_Ware, Integer> tc_anzahl = new TableColumn<MODEL_Ware, Integer>("Anzahl");
	static TableColumn<MODEL_Ware, Double> tc_gewicht = new TableColumn<MODEL_Ware, Double>("Gewicht");
	static TableColumn<MODEL_Ware, Boolean> tc_palette = new TableColumn<MODEL_Ware, Boolean>("Auf Palette");

	
	public static VBox getBox() { 
		
		

		VBox vbox = new VBox();


		
		
		
		vbox.getChildren().add(tbl_table);
		return vbox;
	}

	public static void fillTable(ObservableList data) {
		System.out.println("VIEW_SHOWALL fillTable");
		System.out.println(LagerProgrammStart.warenliste.getWare(0).getName());
		System.out.println(LagerProgrammStart.warenliste.getWare(1).getName());


		//SimpleStringProperty artikel = new SimpleStringProperty(LagerProgrammStart.getWarenliste().warenListe.get(0).getName());
		
			tc_artikel.setCellValueFactory(new PropertyValueFactory<>("name"));
			tc_anzahl.setCellValueFactory(new PropertyValueFactory<>("anzahl"));
			tc_gewicht.setCellValueFactory(new PropertyValueFactory<>("gewicht"));
			tc_palette.setCellValueFactory(new PropertyValueFactory<>("palette"));
			
			
				tbl_table.getItems().addAll(data);
			
			

			
		
		
	//	tc_artikel.setCellValueFactory(new PropertyValueFactory<>(LagerProgrammStart.warenliste.getWare(0).getName()));
	//	tc_anzahl.setCellValueFactory(new PropertyValueFactory<>(String.valueOf(LagerProgrammStart.warenliste.getWare(0).getAnzahl())));
	//	tc_gewicht.setCellValueFactory(new PropertyValueFactory<>(String.valueOf(LagerProgrammStart.warenliste.getWare(0).getGewicht())));
	//	tc_palette.setCellValueFactory(new PropertyValueFactory<>(String.valueOf(LagerProgrammStart.warenliste.getWare(0).isPalette())));
		
		
		
	}
	
	
	public static Text getText() {

		Text text = new Text();
		text.setText("Zeige Lagerbestand");
		return text;
	}

	public static void createTable() {
		
		tbl_table.setEditable(true);
		tbl_table.getColumns().addAll(tc_artikel, tc_anzahl, tc_gewicht, tc_palette);
		
	}


}
