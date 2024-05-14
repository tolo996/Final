/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc.modelo;


public class Transaccion {
    private String numeroCuenta;
    private String nombreCuenta;
    private int cantidadDinero;
    private int saldo;

    public Transaccion(String numeroCuenta, String nombreCuenta, String cantidadDinero) {
        this.numeroCuenta=numeroCuenta;
        this.nombreCuenta=nombreCuenta;
        this.cantidadDinero=Integer.parseInt(cantidadDinero);
        saldo=100000;
        
    }
    public int validarTransaccion(){
        int nuevoSaldo=(this.cantidadDinero+saldo);
        return nuevoSaldo;
        
    }
  

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public int getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(int cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

 
    
    
    
    
    
    
}
