
package edu.jdc.clases;


public class Producto {
    private int codProducto;
    private Inventario codInventario;
    private categoriaProducto codCategoria;
    private int cantidadProducto;

    public Producto() {
    }

    public Producto(int codProducto, Inventario codInventario, categoriaProducto codCategoria, int cantidadProducto) {
        this.codProducto = codProducto;
        this.codInventario = codInventario;
        this.codCategoria = codCategoria;
        this.cantidadProducto = cantidadProducto;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public Inventario getCodInventario() {
        return codInventario;
    }

    public void setCodInventario(Inventario codInventario) {
        this.codInventario = codInventario;
    }

    public categoriaProducto getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(categoriaProducto codCategoria) {
        this.codCategoria = codCategoria;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "codProducto=" + codProducto + ", codInventario=" + codInventario + ", codCategoria=" + codCategoria + ", cantidadProducto=" + cantidadProducto + '}';
    }
    
    
    
}
