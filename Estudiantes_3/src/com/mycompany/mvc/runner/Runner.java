/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc.runner;

import com.mycompany.mvc.controlador.ControladorEstudiantes;
import com.mycompany.mvc.vista.VistaEstudiante;

/**
 *
 * @author ASUS
 */
public class Runner {
    public static void main(String[] args) {
            VistaEstudiante vista = new VistaEstudiante();
        ControladorEstudiantes controlador = new ControladorEstudiantes(vista);
        vista.setControlador(controlador);
        vista.mostrarMenu();
    }
}
