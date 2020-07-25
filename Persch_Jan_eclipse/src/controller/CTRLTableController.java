/**
 * 
 */
package controller;

import javafx.collections.ObservableList;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.Callback;
import javafx.util.converter.BooleanStringConverter;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.IntegerStringConverter;
import model.MODELWare;


/**
 * The Class CTRL_TableController.
 *
 * @author  Jan Persch
 */
public class CTRLTableController {
	
	/** The TableColumn tbltable. */
	static TableView<MODELWare> tbltable = new TableView<MODELWare>();
	
	/** The TableColumn tcartikel. */
	static TableColumn<MODELWare, String> tcartikel = new TableColumn<MODELWare, String>("Artikel");
	
	/** The TableColumn tcanzahl. */
	static TableColumn<MODELWare, Integer> tcanzahl = new TableColumn<MODELWare, Integer>("Anzahl");
	
	/** The TableColumn tcgewicht. */
	static TableColumn<MODELWare, Double> tcgewicht = new TableColumn<MODELWare, Double>("Gewicht");
	
	/** The TableColumn tcpalette. */
	static TableColumn<MODELWare, Boolean> tcpalette = new TableColumn<MODELWare, Boolean>("Auf Palette");
	
	
	/**
	 * Sets the table content.
	 *
	 * @param warenliste the new table content
	 */
	public static void setTableContent(ObservableList<MODELWare> warenliste) {
		//connects the celltype with the MODELWare attribute
		tcartikel.setCellValueFactory(new PropertyValueFactory<>("name"));
		tcanzahl.setCellValueFactory(new PropertyValueFactory<>("anzahl"));
		tcgewicht.setCellValueFactory(new PropertyValueFactory<>("gewicht"));
		tcpalette.setCellValueFactory(new PropertyValueFactory<>("palette"));	
		tbltable.getItems().addAll(warenliste);	
		
		tcartikel.setCellFactory(
				TextFieldTableCell.<MODELWare>forTableColumn());
		tcanzahl.setCellFactory(
				TextFieldTableCell.<MODELWare, Integer>forTableColumn(
						new IntegerStringConverter()));
		tcgewicht.setCellFactory(
				TextFieldTableCell.<MODELWare, Double>forTableColumn(
						new DoubleStringConverter()));	
		tcpalette.setCellFactory(
				TextFieldTableCell.<MODELWare, Boolean>forTableColumn(
						new BooleanStringConverter()));
		// sets what will happen, when a cellvalue is changed
		tcartikel.setOnEditCommit((CellEditEvent<MODELWare, String> event) -> {
			TablePosition<MODELWare, String> position = event.getTablePosition();
			String newArtikelName = event.getNewValue();
			int rowNumber = position.getRow();
			MODELWare ware = event.getTableView().getItems().get(rowNumber);
			ware.setArtikelName(newArtikelName); });
		tcanzahl.setOnEditCommit((CellEditEvent<MODELWare, Integer> event) -> {
			TablePosition<MODELWare, Integer> position = event.getTablePosition();
			Integer newArtikelAnzahl = event.getNewValue();
			int rowNumber = position.getRow();
			MODELWare ware = event.getTableView().getItems().get(rowNumber);
			ware.setArtikelAnzahl(newArtikelAnzahl); });
		tcgewicht.setOnEditCommit((CellEditEvent<MODELWare, Double> event) -> {
			TablePosition<MODELWare, Double> position = event.getTablePosition();
			double newArtikelGewicht = event.getNewValue();
			int rowNumber = position.getRow();
			MODELWare ware = event.getTableView().getItems().get(rowNumber);
			ware.setArtikelGewicht(newArtikelGewicht); });
		tcpalette.setOnEditCommit((CellEditEvent<MODELWare, Boolean> event) -> {
			TablePosition<MODELWare, Boolean> position = event.getTablePosition();
			boolean newPalette = event.getNewValue();
			int rowNumber = position.getRow();
			MODELWare ware = event.getTableView().getItems().get(rowNumber);
			ware.setPalette(newPalette); });
	}
	
	/**
	 * Creates adds the columns to the table.
	 */
	public static void  createTable() {
		tbltable.setEditable(false);
		tbltable.getColumns().addAll(tcartikel, tcanzahl, tcgewicht, tcpalette);
	}
	
	/**
	 * Clear table.
	 */
	public static void clearTable() {
		tbltable.getItems().clear();
	}
	
	/**
	 * Sets the table parameter changeable to true.
	 */
	public static void setTableChangable() {
		tbltable.setEditable(true);
	}
	
	/**
	 * Sets the table parameter changeable to false.
	 */
	public static void setTableNotChangable() {
		tbltable.setEditable(false);
	}
	
	/**
	 * Gets the table.
	 *
	 * @return the table
	 */
	public static TableView<MODELWare> getTable() {
		return tbltable;
	}
	
}
