package edu.jdc.configuracion;


import java.sql.ResultSet;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Conexion {

    private String urlConexion;
    private String claveConexion;
    private String usuarioConexion;
    private String driverConexion;

    
    
    protected String textoConsulta;
    protected ResultSet respuesta;
    protected Connection  poolConexion;
    protected Integer cantidad;
    protected PreparedStatement Consulta;

    public Conexion() {
        usuarioConexion="user_java";
        claveConexion="12345";
        urlConexion="jdbc:postgresql://localhost:5432/DB_happyHen";
        driverConexion="org.postgresql.Driver";
        conectar();
    }
    
    private void conectar(){
        try {
            Class.forName(driverConexion);
            poolConexion=DriverManager.getConnection(urlConexion, usuarioConexion, claveConexion);
            System.out.println("conexion estable con la base de datos Postgresql");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
