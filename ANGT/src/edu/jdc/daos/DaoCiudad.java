
package edu.jdc.daos;

import edu.jdc.clases.Ciudad;
import edu.jdc.configuracion.Conexion;
import edu.jdc.interfaces.Funcionalidad;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DaoCiudad extends Conexion implements Funcionalidad<Ciudad>{

    @Override
    public Boolean registrar(Ciudad objRegistrar) {
try {
            textoconsulta = "INSERT INTO ciudad(nombre_ciudad, cantidad_poblacion) VALUES (?,?)";
            consulta = poolConexion.prepareCall(textoconsulta);

            consulta.setString(1, objRegistrar.getNombreCiudad());
            consulta.setString(2, objRegistrar.getCantidadPoblacion());

            cantidad = consulta.executeUpdate();
            poolConexion.close();
            return cantidad > 0;

        } catch (SQLException ex) {
            Logger.getLogger(DaoCiudad.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    @Override
    public List<Ciudad> consultar(String orden) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Ciudad buscar(int llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
