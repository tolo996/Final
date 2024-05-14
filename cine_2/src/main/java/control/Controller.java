/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;


import model.Cine;
import view.IOmanagger;

/**
 *
 * @author ASUS
 */
public class Controller {
private String nombreUsuario;
private String numeroVoletas;
private String edad;


private IOmanagger objectIOmanagger;
private Cine objectModel;

    public Controller() {
        objectIOmanagger=new IOmanagger();
        objectModel=new Cine();
        nombreUsuario=" ";
        numeroVoletas=" ";
        edad=" ";
       
        
               
    }
    public void solicitudDatos(){
        
        nombreUsuario= "digite su nombre: ";
        edad= "digite su edad: ";
        numeroVoletas="digite el numero de tiquetes que desea";
        String mensaje=objectModel.precio(numeroVoletas);
        
     
        
        
        objectIOmanagger.recibirDatos(nombreUsuario, numeroVoletas, edad);
          
       objectIOmanagger.mostrarPrecio(mensaje);
       
    }
  
    
    
    public void init(){
        solicitudDatos();
       
        
        
    }
}
