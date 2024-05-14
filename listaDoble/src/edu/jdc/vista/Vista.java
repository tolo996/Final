package edu.jdc.vista;

import edu.jdc.modelo.Nodo;

public class Vista {

    private Nodo inicio;

    public Vista() {
        this.inicio = null;
    }

    public void agregarEstudiante(String estudiante) {
        Nodo nuevoNodo = new Nodo(estudiante);
        if (inicio == null) {
            inicio = nuevoNodo;
            
            if (inicio== nuevoNodo) {
                
                inicio= nuevoNodo.getAnterior();
                
            }
        } else {
            Nodo temp = inicio;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
        System.out.println("Tarea agregada: " + estudiante);
    }

    public void EliminarEstudianteInicio() {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.equals(inicio)) {
               
                return;
            }
            temp = temp.getSiguiente();
        }
        System.out.println("El estudiante no existe en la lista.");
    }

    public void agregarUltimoEstudiante() {
        System.out.println("Lista de tareas:");
        Nodo temp = inicio;
        while (temp != null) {
            String estado = temp.isCompletada() ? "Completada" : "Pendiente";
            System.out.println(temp.getEstudiante()+ " - " + estado);
            temp = temp.getSiguiente();
        }
    }

    public void eliminarUltimoEstudiante(String estudiante) {
        if (inicio == null) {
            System.out.println("La lista de tareas está vacía.");
            return;
        }

        if (inicio.getEstudiante().equals(estudiante)) {
            inicio = inicio.getSiguiente();
            System.out.println("Tarea eliminada: " + estudiante);
            return;
        }

        Nodo temp = inicio;
        while (temp.getSiguiente() != null && !temp.getSiguiente().getEstudiante().equals(estudiante)) {
            temp = temp.getSiguiente();
        }

        if (temp.getSiguiente() != null) {
            temp.setSiguiente(temp.getSiguiente().getSiguiente());
            System.out.println("estudiante eliminado: " + estudiante);
        } else {
            System.out.println("el estudiante no existe en la lista.");
        }
    }

    public int mostrarLista() {
        int contador = 0;
        Nodo temp = inicio;
        while (temp != null) {
            if (!temp.isCompletada()) {
                contador++;
            }
            temp = temp.getSiguiente();
        }
        return contador;
    }
}
