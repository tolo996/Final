
package edu.jdc.clases;

import java.util.Date;


public class Factura {
    private int codFactura;
    private Ventas codVenta;
    private Date fechaFactura;
    private int valorFactura;

    public Factura() {
    }

    public Factura(int codFactura, Ventas codVenta, Date fechaFactura, int valorFactura) {
        this.codFactura = codFactura;
        this.codVenta = codVenta;
        this.fechaFactura = fechaFactura;
        this.valorFactura = valorFactura;
    }

    public int getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(int codFactura) {
        this.codFactura = codFactura;
    }

    public Ventas getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(Ventas codVenta) {
        this.codVenta = codVenta;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public int getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(int valorFactura) {
        this.valorFactura = valorFactura;
    }

    @Override
    public String toString() {
        return "Factura{" + "codFactura=" + codFactura + ", codVenta=" + codVenta + ", fechaFactura=" + fechaFactura + ", valorFactura=" + valorFactura + '}';
    }
    
    
    
}
