
package edu.jdc.clases;

import java.util.Objects;


public class Computador {
   private  int codComptador;
   private String marcaComputador;
   private String procesadorComputador;
   private double precioComputador;
   private int capacidadDiscoComputador;

    public Computador() {
    }

    public Computador(int codComptador, String marcaComputador, String procesadorComputador, double precioComputador, int capacidadDiscoComputador) {
        this.codComptador = codComptador;
        this.marcaComputador = marcaComputador;
        this.procesadorComputador = procesadorComputador;
        this.precioComputador = precioComputador;
        this.capacidadDiscoComputador = capacidadDiscoComputador;
    }

    public void setCodComptador(int codComptador) {
        this.codComptador = codComptador;
    }

    public void setMarcaComputador(String marcaComputador) {
        this.marcaComputador = marcaComputador;
    }

    public void setProcesadorComputador(String procesadorComputador) {
        this.procesadorComputador = procesadorComputador;
    }

    public void setPrecioComputador(double precioComputador) {
        this.precioComputador = precioComputador;
    }

    public void setCapacidadDiscoComputador(int capacidadDiscoComputador) {
        this.capacidadDiscoComputador = capacidadDiscoComputador;
    }

    public int getCodComptador() {
        return codComptador;
    }

    public String getMarcaComputador() {
        return marcaComputador;
    }

    public String getProcesadorComputador() {
        return procesadorComputador;
    }

    public double getPrecioComputador() {
        return precioComputador;
    }

    public int getCapacidadDiscoComputador() {
        return capacidadDiscoComputador;
    }
   
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.codComptador;
        hash = 97 * hash + Objects.hashCode(this.marcaComputador);
        hash = 97 * hash + Objects.hashCode(this.procesadorComputador);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.precioComputador) ^ (Double.doubleToLongBits(this.precioComputador) >>> 32));
        hash = 97 * hash + this.capacidadDiscoComputador;
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
        final Computador other = (Computador) obj;
        if (this.codComptador != other.codComptador) {
            return false;
        }
        if (Double.doubleToLongBits(this.precioComputador) != Double.doubleToLongBits(other.precioComputador)) {
            return false;
        }
        if (this.capacidadDiscoComputador != other.capacidadDiscoComputador) {
            return false;
        }
        if (!Objects.equals(this.marcaComputador, other.marcaComputador)) {
            return false;
        }
        return Objects.equals(this.procesadorComputador, other.procesadorComputador);
    }

    @Override
    public String toString() {
        return "Computador{" + "codComptador=" + codComptador + ", marcaComputador=" + marcaComputador + ", procesadorComputador=" + procesadorComputador + ", precioComputador=" + precioComputador + ", capacidadDiscoComputador=" + capacidadDiscoComputador + '}';
    }
   
}
