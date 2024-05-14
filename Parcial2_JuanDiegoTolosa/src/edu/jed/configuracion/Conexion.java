
package edu.jed.configuracion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class Conexion {
    private String urlConexion;
    private String claveConexion;
    private String usuarioconexion;
    private String driverConexion;

    protected String textoConsulta;
    protected ResultSet respuesta;
    protected Connection poolConexion;
    protected Integer cantidad;
    protected PreparedStatement consulta;

    public Conexion() {
        usuarioconexion = "user_java";
        claveConexion = "123456";
        urlConexion = "jdbc:postgresql://localhost:5432/bd_autoVenta2";
        driverConexion = "org.postgresql.Driver";

        conectar();

    }

    private void conectar() {
        try {
            Class.forName(driverConexion);
            poolConexion = (Connection) DriverManager.getConnection(urlConexion, usuarioconexion, claveConexion);
            System.out.println("conexion establecida con la base de datos postgresql");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}


