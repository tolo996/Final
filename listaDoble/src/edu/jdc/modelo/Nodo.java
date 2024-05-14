package edu.jdc.modelo;

public class Nodo {

    private String estudiante;
    private boolean completada;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(String tarea) {
        this.estudiante = estudiante;
        this.completada = false;
        this.siguiente = null;
        this.anterior =null;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void completarTarea() {
        completada = true;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
}
