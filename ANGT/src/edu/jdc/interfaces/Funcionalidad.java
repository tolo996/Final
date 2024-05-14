package edu.jdc.interfaces;

import java.util.List;

public interface Funcionalidad<T> {

    public Boolean registrar(T objRegistrar);

    public List<T> consultar(String orden);

    public T buscar(int llavePrimaria);
}
