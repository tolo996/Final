
package edu.jdc.run;

import edu.jdc.control.Control;
import edu.jdc.view.View;


public class Runner {
    
    public static void main(String[] args) {
        Control controller = new Control();
        View view = new View(controller);
        view.mostrarMenu();
    }

}
