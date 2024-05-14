/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.ejercicio;



public class ListaNodo {
    private ListaNodo cabeza;
    private ListaNodo siguiente;
    private ListaNodo miNodo;
    private int dato;

   
    public ListaNodo(ListaNodo cabeza, ListaNodo siguiente, ListaNodo miNodo, int dato) {
        this.cabeza = cabeza;
        this.siguiente = siguiente;
        this.miNodo = miNodo;
        this.dato = dato;
    }

    public ListaNodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(ListaNodo cabeza) {
        this.cabeza = cabeza;
    }

    public ListaNodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ListaNodo siguiente) {
        this.siguiente = siguiente;
    }

    public ListaNodo getMiNodo() {
        return miNodo;
    }

    public void setMiNodo(ListaNodo miNodo) {
        this.miNodo = miNodo;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
    
}
