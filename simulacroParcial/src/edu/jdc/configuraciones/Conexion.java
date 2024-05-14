/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.configuraciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public abstract class Conexion {
     private String urlConexion;
    private String claveConexion;
    private String usuarioConexion;
    private String driverConexion;
    
    protected String textoconsulta;
    protected ResultSet respuesta; 
    protected Connection poolConexion; 
    protected Integer cantidad;
    protected PreparedStatement consulta;

    public Conexion() {
        usuarioConexion = "user_java";
        claveConexion = "123456";
        urlConexion = "jdbc:postgresql://localhost:5432/bd_productos";
        driverConexion = "org.postgresql.Driver";
        conectar();
    }
    
    
    private void conectar (){
        try {
            Class.forName(driverConexion);
            poolConexion = DriverManager.getConnection(urlConexion,usuarioConexion,claveConexion);
            System.out.println("conexion establecidad con la bases de datos ");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
