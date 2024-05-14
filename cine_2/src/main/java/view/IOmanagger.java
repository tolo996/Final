/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class IOmanagger {
private String nombreUsuario2;
private int edad2;
private int numeroTiquetes;
private String precio;
    public IOmanagger() {
        
    }
    public void recibirDatos(String nombreUsuario, String numeroVoletas, String edad){
        nombreUsuario2=JOptionPane.showInputDialog(nombreUsuario);
        edad2=Integer.parseInt(JOptionPane.showInputDialog(edad));
        numeroTiquetes=Integer.parseInt( JOptionPane.showInputDialog(numeroVoletas));
        
    }
    public String mostrarPrecio(String mensaje){
        
       JOptionPane.showMessageDialog(null, mensaje);
       
    return " ";
        
    }
            
}
