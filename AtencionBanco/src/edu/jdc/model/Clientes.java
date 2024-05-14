
package edu.jdc.model;


public class Clientes {
   
    private static int idCounter = 1; 
    private int id;
    private String nombre;

    public Clientes(String nombre) {
        this.id = idCounter++;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

}
