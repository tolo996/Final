
package edu.jdc.interfaces;

import java.util.List;


public interface Funcionalidad <T> {
    public Boolean registrar(T objRegistrar);
    
    public List<T> consultar(String orden);
    
    public T buscar(Integer llavePrimaria);
    
    public boolean actualizar(T objActualizar);
    
    public boolean eliminar(int llavePrimaria);
    
    public Integer cantidadRegistros();
    
    // archivo sql files proyecto clickderecho new folder nombre, clickderecho foldernombre new sqlfile
    // librerias clicderecho add jarrar driver postgres
    //abrie postgres crear la bd con userjava nuevo query crear la tabla 
    
}

