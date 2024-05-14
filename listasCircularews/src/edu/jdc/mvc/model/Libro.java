
package edu.jdc.mvc.model;


public class Libro {

    String titulo;
    Libro next;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.next = null;
    }

    
}
