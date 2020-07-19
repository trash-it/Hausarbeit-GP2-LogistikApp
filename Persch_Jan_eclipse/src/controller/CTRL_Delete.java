package controller;

import model.MODEL_Ware;
import view.LagerProgrammStart;

public class CTRL_Delete {
	
	
	public static void actionButton(String artikelname) {
		int size = LagerProgrammStart.getWarenliste().size() - 1;
		System.out.println("CTRL_Delete size = " + size);
		
		for(int i = 0; i <= size; i++){
			System.out.println("CTRL_Delete" + i);
			if(LagerProgrammStart.getWarenliste().get(i).getName().equals(artikelname)) {
				LagerProgrammStart.getWarenliste().remove(i);
				break;
			}
		}
	}

}
