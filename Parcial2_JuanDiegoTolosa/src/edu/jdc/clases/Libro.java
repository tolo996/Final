
package edu.jdc.clases;

import java.util.Objects;


public class Libro {
    private int codLibro;
    private String nombreLibro;
    private String autorLibro;
    private Editorial codEditorial;
    private int valorLibro;

    public Libro() {
    }

    public Libro(int codLibro, String nombreLibro, String autorLibro, Editorial codEditorial, int valorLibro) {
        this.codLibro = codLibro;
        this.nombreLibro = nombreLibro;
        this.autorLibro = autorLibro;
        this.codEditorial = codEditorial;
        this.valorLibro = valorLibro;
    }

    public int getCodLibro() {
        return codLibro;
    }

    public void setCodLibro(int codLibro) {
        this.codLibro = codLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public Editorial getCodEditorial() {
        return codEditorial;
    }

    public void setCodEditorial(Editorial codEditorial) {
        this.codEditorial = codEditorial;
    }

    public int getValorLibro() {
        return valorLibro;
    }

    public void setValorLibro(int valorLibro) {
        this.valorLibro = valorLibro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.codLibro;
        hash = 29 * hash + Objects.hashCode(this.nombreLibro);
        hash = 29 * hash + Objects.hashCode(this.autorLibro);
        hash = 29 * hash + Objects.hashCode(this.codEditorial);
        hash = 29 * hash + this.valorLibro;
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
        final Libro other = (Libro) obj;
        if (this.codLibro != other.codLibro) {
            return false;
        }
        if (this.valorLibro != other.valorLibro) {
            return false;
        }
        if (!Objects.equals(this.nombreLibro, other.nombreLibro)) {
            return false;
        }
        if (!Objects.equals(this.autorLibro, other.autorLibro)) {
            return false;
        }
        return Objects.equals(this.codEditorial, other.codEditorial);
    }

    @Override
    public String toString() {
        return "Libro{" + "codLibro=" + codLibro + ", nombreLibro=" + nombreLibro + ", autorLibro=" + autorLibro + ", codEditorial=" + codEditorial + ", valorLibro=" + valorLibro + '}';
    }
    
}
