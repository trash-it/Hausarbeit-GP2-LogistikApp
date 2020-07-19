package view;

import controller.CTRL_TableController;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.MODEL_Ware;



public class VIEW_ShowAll {

//	static TableView<MODEL_Ware> tbl_table = new TableView<MODEL_Ware>();
//	static TableColumn<MODEL_Ware, String> tc_artikel = new TableColumn<MODEL_Ware, String>("Artikel");
//	static TableColumn<MODEL_Ware, Integer> tc_anzahl = new TableColumn<MODEL_Ware, Integer>("Anzahl");
//	static TableColumn<MODEL_Ware, Double> tc_gewicht = new TableColumn<MODEL_Ware, Double>("Gewicht");
//	static TableColumn<MODEL_Ware, Boolean> tc_palette = new TableColumn<MODEL_Ware, Boolean>("Auf Palette");

	
	public static VBox getBox() { 
		VBox vbox = new VBox();
		vbox.getChildren().add(CTRL_TableController.getTable());
		return vbox;
	}

//	public static void fillTable(ObservableList<MODEL_Ware> data) {
//		System.out.println("VIEW_SHOWALL fillTable");
//
//			tc_artikel.setCellValueFactory(new PropertyValueFactory<>("name"));
//			tc_anzahl.setCellValueFactory(new PropertyValueFactory<>("anzahl"));
//			tc_gewicht.setCellValueFactory(new PropertyValueFactory<>("gewicht"));
//			tc_palette.setCellValueFactory(new PropertyValueFactory<>("palette"));
//			tbl_table.getItems().addAll(data);
//	}
		
	public static Text getText() {
		Text text = new Text();
		text.setText("Zeige Lagerbestand");
		return text;
	}

//	public static void createTable() {
//		tbl_table.setEditable(false);
////		tbl_table.getColumns().addAll(tc_artikel, tc_anzahl, tc_gewicht, tc_palette);
//	}
//	
//	public static void clearTable() {
//		tbl_table.getItems().clear();
//	}


}
