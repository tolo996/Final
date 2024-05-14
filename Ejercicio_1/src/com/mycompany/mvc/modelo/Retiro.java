/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc.modelo;

/**
 *
 * @author ASUS
 */
public class Retiro {
    private String numeroCuenta;
    private int cantidadDinero;
    private String contrasenia;
    private int saldo;

    public Retiro(String numeroCuenta, String contrasenia, String cantidadDinero) {
        this.numeroCuenta=numeroCuenta;
        this.contrasenia=contrasenia;
        this.cantidadDinero=Integer.parseInt(cantidadDinero);
        this.cantidadDinero=Integer.parseInt(cantidadDinero);
        saldo=100000;
                
    }
      public int validarRetiro(){
        int nuevoSaldo=(saldo-this.cantidadDinero);
          if (nuevoSaldo<0) {
              System.out.println("no cuenta con esa cantidad en su cuenta.");
              
          }
        return nuevoSaldo;
    }
    

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(int cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

   

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
    
}
