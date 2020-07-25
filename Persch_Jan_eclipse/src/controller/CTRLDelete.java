package controller;

import view.LagerProgrammStart;

/**
 * The Class CTRL_Delete.
 */
public class CTRLDelete {

    /**
     * Action button.
     *
     * @param artikelname the artikelname
     */
    public static void actionButton(String artikelname) {
        int size = LagerProgrammStart.getWarenliste().size() - 1;
       // System.out.println("CTRL_Delete size = " + size);	
	for(int i = 0; i <= size; i++){
	   // System.out.println("CTRL_Delete" + i);
	    if(LagerProgrammStart.getWarenliste().get(i).getName().equals(artikelname)) {
	        LagerProgrammStart.getWarenliste().remove(i);
		break;
	    } else {
	    		int nummer = (Integer.parseInt(artikelname) - 1);
	    		int nummer2 = LagerProgrammStart.getWarenliste().size();
	    		if(nummer <= nummer2) {
	    			LagerProgrammStart.getWarenliste().remove(nummer);
	    			break;
	    	}
	    }
	    
	    
	    	
		}
	}
}


