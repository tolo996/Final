
package edu.jdc.mvc.model;


public class Nodo {
    private Estudiantes estudiante;
    private Nodo siguiente;

    // Constructor
    public Nodo(Estudiantes estudiante) {
        this.estudiante = estudiante;
        this.siguiente = null;
    }

    // Getters y Setters
    public Estudiantes getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiantes estudiante) {
        this.estudiante = estudiante;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}

