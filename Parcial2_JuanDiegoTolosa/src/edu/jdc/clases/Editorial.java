
package edu.jdc.clases;

import java.util.Objects;


public class Editorial {
    private int codEditorial;
    private String nombreEditorial;
    private String direccionEditorial;
    private String generoEditorial;
    private int cantLibros;

    public Editorial() {
    }

    public Editorial(int codEditorial, String nombreEditorial, String direccionEditorial, String generoEditorial, int cantLibros) {
        this.codEditorial = codEditorial;
        this.nombreEditorial = nombreEditorial;
        this.direccionEditorial = direccionEditorial;
        this.generoEditorial = generoEditorial;
        this.cantLibros = cantLibros;
    }

    public int getCodEditorial() {
        return codEditorial;
    }

    public void setCodEditorial(int codEditorial) {
        this.codEditorial = codEditorial;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public String getDireccionEditorial() {
        return direccionEditorial;
    }

    public void setDireccionEditorial(String direccionEditorial) {
        this.direccionEditorial = direccionEditorial;
    }

    public String getGeneroEditorial() {
        return generoEditorial;
    }

    public void setGeneroEditorial(String generoEditorial) {
        this.generoEditorial = generoEditorial;
    }

    public int getCantLibros() {
        return cantLibros;
    }

    public void setCantLibros(int cantLibros) {
        this.cantLibros = cantLibros;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.codEditorial;
        hash = 97 * hash + Objects.hashCode(this.nombreEditorial);
        hash = 97 * hash + Objects.hashCode(this.direccionEditorial);
        hash = 97 * hash + Objects.hashCode(this.generoEditorial);
        hash = 97 * hash + this.cantLibros;
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
        final Editorial other = (Editorial) obj;
        if (this.codEditorial != other.codEditorial) {
            return false;
        }
        if (this.cantLibros != other.cantLibros) {
            return false;
        }
        if (!Objects.equals(this.nombreEditorial, other.nombreEditorial)) {
            return false;
        }
        if (!Objects.equals(this.direccionEditorial, other.direccionEditorial)) {
            return false;
        }
        return Objects.equals(this.generoEditorial, other.generoEditorial);
    }
    

    @Override
    public String toString() {
        return "Editorial{" + "codEditorial=" + codEditorial + ", nombreEditorial=" + nombreEditorial + ", direccionEditorial=" + direccionEditorial + ", generoEditorial=" + generoEditorial + ", cantLibros=" + cantLibros + '}';
    }
    
}
