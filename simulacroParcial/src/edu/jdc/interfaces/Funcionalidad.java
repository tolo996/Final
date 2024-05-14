package edu.jdc.interfaces;

import java.util.List;


public interface Funcionalidad <T>{
    
    public Boolean registrar(T objRegistrar);
    
    public List<T> consutar (String orden);
    
    public T buscar(int llavePrimaria);
    
    public Boolean actualizar(T objActulaizar);
    
    public Boolean elimiar(int llavePrimaria);
    
    public Integer cantidadRegistros();
    
}
