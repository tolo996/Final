/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc.runner;

import com.mycompany.mvc.controlador.controladorEstudiante;
import com.mycompany.mvc.vista.vistaEstudiante;

/**
 *
 * @author ASUS
 */
public class Runner {
    public static void main(String[] args) {
         vistaEstudiante objectVista=new vistaEstudiante();
         controladorEstudiante objectController= new controladorEstudiante(objectVista);
         objectController.init();
    }
}
