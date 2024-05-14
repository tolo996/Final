
package edu.jdc.view;

import edu.jdc.model.Evento;
import java.util.List;


public class Vista {

  
  
      
    public void mostrarEventos(List<Evento> eventos) {
        for (Evento evento : eventos) {
            System.out.println(evento.getId() + ": " + evento.getContenido());
        }
    }
} 

