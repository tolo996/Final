/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.daos;

import edu.jdc.clases.Producto;
import edu.jdc.configuraciones.Conexion;
import edu.jdc.interfaces.Funcionalidad;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class daosProducto extends Conexion implements Funcionalidad{

    public Boolean registrar(Producto objRegistrar) {
         try {
            textoconsulta = "INSERT INTO permisos(nombre_permiso, funcionalidad_permiso) VALUES (?,?)";
            consulta = poolConexion.prepareCall(textoconsulta);

            consulta.setString(1, objRegistrar.getNombreProducto());
            consulta.setInt(2, objRegistrar.getCantidadProducto());
            consulta.setDouble(3, objRegistrar.getPrecioProducto());
            consulta.setInt(4, objRegistrar.getCodProducto());
                    

            cantidad = consulta.executeUpdate();
            poolConexion.close();
            return cantidad > 0;

        } catch (SQLException ex) {
            Logger.getLogger(daosProducto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public List consutar(String orden) {
 try {

        
           
            if (orden.isEmpty()) {
                orden = "p.cod_permiso";
            }
            textoconsulta = "SELECT p.cod_producto, p.nombre_producto, p.cantidad_producto, p.precio_producto " + "FROM producto p ORDER BY " + orden;
            consulta = poolConexion.prepareCall(textoconsulta);
            respuesta = consulta.executeQuery();

            List<Producto> arregloPermiso = new ArrayList<>();

            while (respuesta.next()) {
                int codigo = respuesta.getInt(1);
                String nombre = respuesta.getString(2);
                int cantidad = respuesta.getInt(3);
                double precio=respuesta.getDouble(4);

                Producto objProduto = new Producto(codigo, nombre, cantidad, precio);
                arregloPermiso.add(objProduto);

            }

            poolConexion.beginRequest();
            return arregloPermiso;

                } catch (SQLException e) {
            Logger.getLogger(daosProducto.class.getName()).log(Level.SEVERE, null, e);

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
