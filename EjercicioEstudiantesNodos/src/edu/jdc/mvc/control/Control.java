
package edu.jdc.mvc.control;

import edu.jdc.mvc.model.Estudiantes;
import edu.jdc.mvc.model.Nodo;


public class Control {
     private Nodo primerNodo;

    // Método para agregar un nuevo estudiante
    public void agregarEstudiante(int codigo, String nombre, int edad) {
        Estudiantes nuevoEstudiante = new Estudiantes(codigo, nombre, edad);
        Nodo nuevoNodo = new Nodo(nuevoEstudiante);

        if (primerNodo == null) {
            primerNodo = nuevoNodo;
        } else {
            Nodo temp = primerNodo;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }

    // Método para obtener la lista de estudiantes registrados
    public Nodo obtenerListaEstudiantes() {
        return primerNodo;
    }
}

