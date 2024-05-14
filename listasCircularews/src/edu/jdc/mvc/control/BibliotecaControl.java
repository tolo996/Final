
package edu.jdc.mvc.control;

import edu.jdc.mvc.model.BibliotecaModel;


public class BibliotecaControl {
   
   private  BibliotecaModel bibliotecaModel;

    public BibliotecaControl(BibliotecaModel bibliotecaModel) {
        this.bibliotecaModel = bibliotecaModel;
    }

    public void agregarLibro(String titulo) {
        bibliotecaModel.agregarLibro(titulo);
    }
    
    public void eliminarLibros(String titulo) {
        bibliotecaModel.eliminarLibro(titulo);
    }

    public String obtenerLibros() {
        return bibliotecaModel.mostrarLibros();
    }

}
