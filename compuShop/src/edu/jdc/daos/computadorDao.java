
package edu.jdc.daos;

import edu.jdc.clases.Computador;
import edu.jdc.configuraciones.Conexion;
import edu.jdc.interfaces.Funcionalidad;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class computadorDao extends Conexion implements Funcionalidad {

    public Boolean registrar(Computador objRegistrar) {
  try {
            textoconsulta = "INSERT INTO permisos(cod_computador, marca_computador) VALUES (?,?)";
            consulta = poolConexion.prepareCall(textoconsulta);

            consulta.setString(1, objRegistrar.getMarcaComputador());
            consulta.setString(2, objRegistrar.getProcesadorComputador());

            cantidad = consulta.executeUpdate();
            poolConexion.close();
            return cantidad > 0;

        } catch (SQLException ex) {
            Logger.getLogger(computadorDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public List consutar(String orden) {
       try {

        
           
            if (orden.isEmpty()) {
                orden = "cod_computador";
            }
            textoconsulta = "SELECT cod_computador, marca_computador, procesador_computador, precio_computador, capacidad_computador " + "FROM computadores p ORDER BY " + orden;
            consulta = poolConexion.prepareCall(textoconsulta);
            respuesta = consulta.executeQuery();

            List<Computador> arregloPc = new ArrayList<>();

            while (respuesta.next()) {
                int codigo = respuesta.getInt(1);
                String marca = respuesta.getString(2);
                String procesador = respuesta.getString(3);
                double precio=respuesta.getDouble(4);
                int capacidad=respuesta.getInt(5);
                

                Computador objPc = new Computador(codigo, marca, procesador, precio, capacidad);
                arregloPc.add(objPc);

            }

            poolConexion.beginRequest();
            return arregloPc;

                } catch (SQLException e) {
            Logger.getLogger(computadorDao.class.getName()).log(Level.SEVERE, null, e);

        }
        return null;
 
    }

    @Override
    public Object buscar(int llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean actualizar(Object objActulaizar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean elimiar(int llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer cantidadRegistros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean registrar(Object objRegistrar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
