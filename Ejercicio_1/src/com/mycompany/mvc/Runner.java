/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc;

import com.mycompany.mvc.controlador.Controller;
import com.mycompany.mvc.vista.View;

/**
 *
 * @author ASUS
 */
public class Runner {
    public static void main(String[] args) {
        View objectVista=new View();
         Controller objectController= new Controller(objectVista);
         objectController.init();
         
    }
 
  
  

 
    
}
