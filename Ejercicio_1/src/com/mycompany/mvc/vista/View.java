/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc.vista;

import com.mycompany.mvc.modelo.Retiro;
import com.mycompany.mvc.modelo.Transaccion;
import java.util.Scanner;

public class View {
private Scanner leer;
    public View() {
        this.leer = new Scanner(System.in);
    }
    
    public int menu(){
        System.out.println("\nTramites de cuenta Bancaria: ");
        System.out.println("1. depositar");
        System.out.println("2. retirar");
        System.out.println("3. mostrar Transacciones");
        System.out.println("4. mostrar retiros");
        System.out.println("5. salir");
        System.out.println("Seleccione una opcion: ");
        int opcion = leer.nextInt();
        leer.nextLine();
                
        
        return opcion;
        
    }
    public Transaccion obtenerDatosTransaccion(){
        System.out.println("ingrese el numero de cuenta al cual desea consignar: ");
        String numeroCuenta=leer.nextLine();
        System.out.println("ingrese el nombre del duenio de la cuenta: ");
        String nombreCuenta=leer.nextLine();
        System.out.println("ingrese la cantidad que desea depositar: ");
        String cantidadDinero=leer.nextLine();
        
    return new Transaccion(numeroCuenta,nombreCuenta, cantidadDinero);
        
    }
    
    public Retiro obtenerDatosRetiro(){
        System.out.println("ingrese su numero de cuenta: ");
        String numeroCuenta=leer.nextLine();
        System.out.println("ingrese su contraseña de 4 digitos");
        String contrasenia=leer.nextLine();
        System.out.println("ingrese la cantidad que desea retirar");
        
        String cantidadDinero=leer.nextLine();
        
        
        
    return new Retiro(numeroCuenta, contrasenia, cantidadDinero);
        
    }
    public void mostrarTransacciones(Transaccion objectTransaccion){
        if (objectTransaccion==null) {
            System.out.println("no ha hecho ninguna transaccion");
        }else{
            System.out.println("\ntransacciones: ");
            System.out.println("numero de cuenta:"+objectTransaccion.getNumeroCuenta());
            System.out.println("nombre del usuario: "+objectTransaccion.getNombreCuenta());
            System.out.println("cantidad depositada: "+objectTransaccion.validarTransaccion());
        }
    }
     public void mostrarRetiros (Retiro objectRetiro){
        if (objectRetiro==null) {
            System.out.println("no ha hecho ninguna transaccion");
        }else{
            System.out.println("\nretiros: ");
            System.out.println("numero de cuenta:"+objectRetiro.getNumeroCuenta());
            System.out.println("cantidad depositada: "+objectRetiro.getCantidadDinero());
        }
    }
    
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
