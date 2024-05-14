
package edu.jdc.clases;


public class Galpones {
    private int codGalpon;
    private int cantidadGallinas;
    private double ancho;
    private double largo;

    public Galpones() {
    }

    public Galpones(int codGalpon, int cantidadGallinas, double ancho, double largo) {
        this.codGalpon = codGalpon;
        this.cantidadGallinas = cantidadGallinas;
        this.ancho = ancho;
        this.largo = largo;
    }

    public int getCodGalpon() {
        return codGalpon;
    }

    public void setCodGalpon(int codGalpon) {
        this.codGalpon = codGalpon;
    }

    public int getCantidadGallinas() {
        return cantidadGallinas;
    }

    public void setCantidadGallinas(int cantidadGallinas) {
        this.cantidadGallinas = cantidadGallinas;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Galpones{" + "codGalpon=" + codGalpon + ", cantidadGallinas=" + cantidadGallinas + ", ancho=" + ancho + ", largo=" + largo + '}';
    }
    
    
    
}
