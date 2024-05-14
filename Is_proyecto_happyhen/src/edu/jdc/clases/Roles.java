package edu.jdc.clases;

public class Roles {

    private int codRol;
    private String nombreRol;

    public Roles() {
    }

    public Roles(int codRol, String nombreRol) {
        this.codRol = codRol;
        this.nombreRol = nombreRol;
    }

    public int getCodRol() {
        return codRol;
    }

    public void setCodRol(int codRol) {
        this.codRol = codRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    @Override
    public String toString() {
        return "Roles{" + "codRol=" + codRol + ", nombreRol=" + nombreRol + '}';
    }

}
