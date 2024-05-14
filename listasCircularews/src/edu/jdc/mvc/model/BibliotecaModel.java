/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.mvc.model;

/**
 *
 * @author ASUS
 */
public class BibliotecaModel {

    Libro primero;
    Libro ultimo;

    public BibliotecaModel() {
        this.primero = null;
        this.ultimo = null;
    }

    public void agregarLibro(String titulo) {
        Libro nuevoLibro = new Libro(titulo);
        if (primero == null) {
            primero = nuevoLibro;
        } else {
            ultimo.next = nuevoLibro;
        }
        ultimo = nuevoLibro;
        ultimo.next = primero; 
    }
    public void eliminarLibro(String titulo) {
        if (primero == null) {
            System.out.println("La biblioteca está vacía.");
            return;
        }

        if (primero.titulo.equals(titulo)) {
            if (primero == ultimo) {
                primero = null;
                ultimo = null;
            } else {
                primero = primero.next;
                ultimo.next = primero;
            }
            return;
        }

        Libro actual = primero;
        while (actual.next != primero) {
            if (actual.next.titulo.equals(titulo)) {
                if (actual.next == ultimo) {
                    ultimo = actual;
                }
                actual.next = actual.next.next;
                return;
            }
            actual = actual.next;
        }

        System.out.println("El libro '" + titulo + "' no se encontró en la biblioteca.");
    }

    public String mostrarLibros() {
        if (primero == null) {
            return "La biblioteca esta vacia.";
        }
        StringBuilder libros = new StringBuilder();
        Libro actual = primero;
        do {
            libros.append("- ").append(actual.titulo).append("\n");
            actual = actual.next;
        } while (actual != primero);
        return libros.toString();
    }
}


