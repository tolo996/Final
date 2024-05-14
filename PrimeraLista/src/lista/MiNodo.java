/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;


public class MiNodo {
    private MiNodo miNodo;
    private int dato;
    private MiNodo siguiente;
    private MiNodo cabeza;

    public MiNodo() {
    }

    public MiNodo(MiNodo miNodo, int dato, MiNodo siguiente, MiNodo cabeza) {
        this.miNodo = miNodo;
        this.dato = dato;
        this.siguiente = siguiente;
        this.cabeza = cabeza;
    }

    public MiNodo getMiNodo() {
        return miNodo;
    }

    public void setMiNodo(MiNodo miNodo) {
        this.miNodo = miNodo;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public MiNodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(MiNodo siguiente) {
        this.siguiente = siguiente;
    }

    public MiNodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(MiNodo cabeza) {
        this.cabeza = cabeza;
    }
    
    
    
    
}
