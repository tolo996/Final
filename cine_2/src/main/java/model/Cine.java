/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Cine {
private int precioTickets;
private String mensaje;
    public Cine() {
    }
    
    public  String  precio(String numeroVoletas){
        precioTickets=Integer.parseInt(numeroVoletas)*15000;
        mensaje="el precio es: "+precioTickets;
        
    return mensaje;
        
   
      
    }
}
