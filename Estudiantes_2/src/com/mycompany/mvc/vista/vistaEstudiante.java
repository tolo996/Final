
package com.mycompany.mvc.vista;

import com.mycompany.mvc.modelo.Estudiante;
import java.util.ArrayList;
import java.util.Scanner;


public class vistaEstudiante {

    private Scanner leer;
   
    public vistaEstudiante() {
          this.leer = new Scanner(System.in);
         
    }
    public int menu(){
        System.out.println(".........................");
        System.out.println("\nRegistro estudiante");
        System.out.println("1. Agregar");
        System.out.println("2. Mostrar Lista");
        System.out.println("3. Actualizar");
        System.out.println("4. Eliminar");
        System.out.println("5. Ver estudiantes");
        System.out.println("6. salir");
        System.out.println("Seleccione una opcion: ");
        System.out.println("......................... ");
        int opcion = leer.nextInt();
        leer.nextLine();
                
        
        return opcion;
    }
    
    public Estudiante obtenerDatos(){
        System.out.println("digite el nombre del estudiante: ");
        String estudiante = leer.nextLine();
        System.out.println("digite el id de estudiante");
        String idEstudiante = leer.nextLine();
        
        
        
        return new Estudiante(estudiante, idEstudiante);
        
    }
    public void mostrarLista(Estudiante objectEstudiante){
        if (objectEstudiante==null) {
            System.out.println("no ha agregado ningun estudiante");
            
        }else{
            System.out.println("nombre: "+objectEstudiante.getEstudiante());
            System.out.println("id: "+objectEstudiante.getIdEstudiante());
        }
    }
  
    public void actualizarEstudiante(){
        
        
    } 
   
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
