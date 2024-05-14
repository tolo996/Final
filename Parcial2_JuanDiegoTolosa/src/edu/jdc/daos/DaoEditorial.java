/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.daos;

import edu.jdc.clases.Editorial;
import edu.jdc.interfaces.Funcionalidad;
import edu.jed.configuracion.Conexion;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class DaoEditorial extends Conexion implements Funcionalidad<Editorial>{

    @Override
    public Boolean registrar(Editorial objRegistrar) {
try{
      textoConsulta = "INSERT INTO Libros(cod_libro, cod_edito, modelo_vehiculo, placa_vehiculo, valor_vehiculo) VALUES (?,?,?,?,?) ";
            consulta = poolConexion.prepareCall(textoConsulta);
            consulta.setInt(1, objRegistrar.getCodEditorial());
            consulta.setInt(2, objRegistrar.getCantLibros());
            consulta.set
           
            cantidad = consulta.executeUpdate();
            poolConexion.beginRequest();
            return cantidad > 0;

        } catch (SQLException ex) {
            Logger.getLogger(DaoEditorial.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public List<Editorial> consultar(String orden) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Editorial buscar(Integer llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizar(Editorial objActualizar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(int llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer cantidadRegistros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
