/**
 * 
 */
package controller;

import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import model.MODEL_Ware;


/**
 * @author  Jan Persch
 * @param <warenliste>
 *
 */
public class CTRL_TableController {
	
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
				
				
				tc_artikel.setCellFactory(TextFieldTableCell.<MODEL_Ware> forTableColumn());
				
				tc_artikel.setOnEditCommit((CellEditEvent<MODEL_Ware,String> event) -> {
					TablePosition<MODEL_Ware,String> position = event.getTablePosition();
					String newArtikelName = event.getNewValue();
					
					int rowNumber = position.getRow();
					MODEL_Ware ware = event.getTableView().getItems().get(rowNumber);
					
					ware.setArtikelName(newArtikelName);	});
				
				
		
}
	
	public static void  createTable() {
		tbl_table.setEditable(false);
		tbl_table.getColumns().addAll(tc_artikel, tc_anzahl, tc_gewicht, tc_palette);
	}
	
	public static void clearTable() {
	tbl_table.getItems().clear();
}
	
	public static void setTableChangable() {
		tbl_table.setEditable(true);
	}
	
	public static void setTableNotChangable() {
		tbl_table.setEditable(false);
	}
	
	public static TableView<MODEL_Ware> getTable() {
		return tbl_table;
	}
	
}
