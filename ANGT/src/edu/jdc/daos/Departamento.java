
package edu.jdc.daos;

import edu.jdc.configuracion.Conexion;
import edu.jdc.interfaces.Funcionalidad;
import java.util.List;


public class Departamento extends Conexion implements Funcionalidad<Departamento>{

    @Override
    public Boolean registrar(Departamento objRegistrar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Departamento> consultar(String orden) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Departamento buscar(int llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
