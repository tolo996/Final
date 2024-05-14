package edu.jdc.daos;

import edu.jdc.clases.Permiso;
import edu.jdc.configuracion.Conexion;
import edu.jdc.interfaces.Funcionalidades;
import static java.awt.AWTEventMulticaster.add;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoPermiso extends Conexion implements Funcionalidades<Permiso> {

    @Override
    public Boolean registrar(Permiso objRegistrar) {
        try {
            textoConsulta = "INSERT INTO permisos(nombre_permiso,funcionalidad_permiso)VALUES(?,?)";

            Consulta = poolConexion.prepareCall(textoConsulta);
            Consulta.setString(1, objRegistrar.getNombrePermiso());
            Consulta.setString(2, objRegistrar.getFuncionalidadPermiso());//llamamos a la base de datos y decimos quien registra

            cantidad = Consulta.executeUpdate();
            poolConexion.close();
            return cantidad > 0;

        } catch (SQLException ex) {

            Logger.getLogger(DaoPermiso.class.getName()).log(Level.SEVERE, null, ex);

            return false;
        }

    }

    @Override
    public List<Permiso> consultar(String orden) {
        try{
        if (orden.isEmpty()) {
            orden = "p.cod_permiso";
        }
        textoConsulta = "SELECT p.codpermiso.p.mnombrepermiso. p.funcionalidadpermiso" + "FROM permisos p ORDER BY" + orden;

        Consulta=poolConexion.prepareCall(textoConsulta);
        
        respuesta=Consulta.executeQuery();
        
        List<Permiso> arregloPermisos=new ArrayList<>();
        
        while(respuesta.next()){
            int codigo=respuesta.getInt(1);
            String nombre=respuesta.getString(2);
            String funcionalidad=respuesta.getString(3);
            
            
            Permiso objPermiso=new Permiso(codigo,nombre,funcionalidad);
            
            arregloPermisos.add(objPermiso);
            
            
            
        }
        poolConexion.close();
        return arregloPermisos;
        }catch(SQLException ex){
             Logger.getLogger(DaoPermiso.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return null;
        
        
        
        
    }

    @Override
    public Permiso buscar(int llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean actualizar(Permiso objActualizar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean eliminar(int llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer cantidadRegistros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
