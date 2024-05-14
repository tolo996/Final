package edu.jdc.clases;

public class PermisoRol {

    private Permiso codperomiso;
    private Roles codRol;

    public PermisoRol() {
    }

    public PermisoRol(Permiso codperomiso, Roles codRol) {
        this.codperomiso = codperomiso;
        this.codRol = codRol;
    }

    public Permiso getCodperomiso() {
        return codperomiso;
    }

    public void setCodperomiso(Permiso codperomiso) {
        this.codperomiso = codperomiso;
    }

    public Roles getCodRol() {
        return codRol;
    }

    public void setCodRol(Roles codRol) {
        this.codRol = codRol;
    }

    @Override
    public String toString() {
        return "PermisoRol{" + "codperomiso=" + codperomiso + ", codRol=" + codRol + '}';
    }

}
