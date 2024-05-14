
package edu.jdc.clases;

import java.util.Objects;


public class Producto {
    private int codProducto;
    private String nombreProducto;
    private int cantidadProducto;
    private double precioProducto;

    public Producto() {
    }

    public Producto(int codProducto, String nombreProducto, int cantidadProducto, double precioProducto) {
        this.codProducto = codProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.codProducto;
        hash = 89 * hash + Objects.hashCode(this.nombreProducto);
        hash = 89 * hash + this.cantidadProducto;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.precioProducto) ^ (Double.doubleToLongBits(this.precioProducto) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" + "codProducto=" + codProducto + ", nombreProducto=" + nombreProducto + ", cantidadProducto=" + cantidadProducto + ", precioProducto=" + precioProducto + '}';
    }
    

  

}
