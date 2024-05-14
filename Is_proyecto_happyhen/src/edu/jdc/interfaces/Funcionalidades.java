package edu.jdc.interfaces;

import java.util.List;

public interface Funcionalidades<T> {

    public Boolean registrar(T objRegistrar);

    public List<T> consultar(String orden);

    public T buscar(int llavePrimaria);

    public Boolean actualizar(T objActualizar);

    public Boolean eliminar(int llavePrimaria);

    public Integer cantidadRegistros();

}
