/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc.controlador;

import com.mycompany.mvc.modelo.Estudiante;
import com.mycompany.mvc.vista.vistaEstudiante;

/**
 *
 * @author ASUS
 */
public class controladorEstudiante {

    private vistaEstudiante objectVista;
    private Estudiante objecModel;

    
    public controladorEstudiante(vistaEstudiante objectEstudiante) {
        objectVista= objectEstudiante;
    }
    public void menu(){
     boolean salir = false;
     while (!salir) {
            int opcion = objectVista.menu();
            switch (opcion) {
                case 1:
                    objecModel= objectVista.obtenerDatos();
                    objectVista.mostrarMensaje("se ha agregado exitosamente.");
                    break;

                case 2:
                    objectVista.mostrarLista(objecModel);
                    break;
                default:
                    objectVista.mostrarMensaje("La opcion que acaba de digitar no es valida.");

            }

        }
    
    }
      
    
    
    public void init(){
          menu();
    }
}
