
package edu.jdc.clases;

public class Ventas {
   private int codVenta;
   private Bodega codBodega;
   private Ventas cantidadVenta;
   private Ventas fecha;

    public Ventas() {
    }

    public Ventas(int codVenta, Bodega codBodega, Ventas cantidadVenta, Ventas fecha) {
        this.codVenta = codVenta;
        this.codBodega = codBodega;
        this.cantidadVenta = cantidadVenta;
        this.fecha = fecha;
    }

    public int getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(int codVenta) {
        this.codVenta = codVenta;
    }

    public Bodega getCodBodega() {
        return codBodega;
    }

    public void setCodBodega(Bodega codBodega) {
        this.codBodega = codBodega;
    }

    public Ventas getCantidadVenta() {
        return cantidadVenta;
    }

    public void setCantidadVenta(Ventas cantidadVenta) {
        this.cantidadVenta = cantidadVenta;
    }

    public Ventas getFecha() {
        return fecha;
    }

    public void setFecha(Ventas fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Ventas{" + "codVenta=" + codVenta + ", codBodega=" + codBodega + ", cantidadVenta=" + cantidadVenta + ", fecha=" + fecha + '}';
    }
   
    
   
   
}
