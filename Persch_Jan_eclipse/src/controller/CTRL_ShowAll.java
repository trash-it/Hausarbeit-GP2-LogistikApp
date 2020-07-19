/**
 * 
 */
package controller;

import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import model.MODEL_Ware;


/**
 * @author  Jan Persch
 * @param <warenliste>
 *
 */
public class CTRL_ShowAll {
	
	static TableView<MODEL_Ware> tbl_table = new TableView<MODEL_Ware>();
	static TableColumn<MODEL_Ware, String> tc_artikel = new TableColumn<MODEL_Ware, String>("Artikel");
	static TableColumn<MODEL_Ware, Integer> tc_anzahl = new TableColumn<MODEL_Ware, Integer>("Anzahl");
	static TableColumn<MODEL_Ware, Double> tc_gewicht = new TableColumn<MODEL_Ware, Double>("Gewicht");
	static TableColumn<MODEL_Ware, Boolean> tc_palette = new TableColumn<MODEL_Ware, Boolean>("Auf Palette");
	
	
	public static void setTableContent(ObservableList<MODEL_Ware> warenliste){

				tc_artikel.setCellValueFactory(new PropertyValueFactory<>("name"));
				tc_anzahl.setCellValueFactory(new PropertyValueFactory<>("anzahl"));
				tc_gewicht.setCellValueFactory(new PropertyValueFactory<>("gewicht"));
				tc_palette.setCellValueFactory(new PropertyValueFactory<>("palette"));
				tbl_table.getItems().addAll(warenliste);
		
}
	
	public static void  createTable() {
		tbl_table.setEditable(false);
		tbl_table.getColumns().addAll(tc_artikel, tc_anzahl, tc_gewicht, tc_palette);
	}
	
	public static void clearTable() {
	tbl_table.getItems().clear();
}
	
	public static TableView<MODEL_Ware> getTable() {
		return tbl_table;
	}
	
}
