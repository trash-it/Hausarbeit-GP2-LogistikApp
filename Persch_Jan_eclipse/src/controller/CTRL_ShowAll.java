/**
 * 
 */
package controller;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;

import view.LagerProgrammStart;
import view.VIEW_Add;
import view.VIEW_Change;
import view.VIEW_Delete;
import view.VIEW_Export;
import view.VIEW_Import;
import view.VIEW_ShowAll;
import model.MODEL_Ware;
import model.MODEL_WarenListe; 

/**
 * @author  Jan Persch
 * @param <warenliste>
 *
 */
public class CTRL_ShowAll {
	

	public static void setTableContent(MODEL_WarenListe warenliste){
		
		ObservableList data = FXCollections.observableArrayList(warenliste);
		
		//VIEW_ShowAll.setList(warenliste);
		VIEW_ShowAll.fillTable(data);
		
		
		
	}

}
