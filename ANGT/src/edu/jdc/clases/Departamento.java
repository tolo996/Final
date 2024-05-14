
package edu.jdc.clases;

public class Departamento {
    private int codDepartamento;
    private String nombreDepartamento;

    public Departamento() {
    }

    public Departamento(int codDepartamento, String nombreDepartamento) {
        this.codDepartamento = codDepartamento;
        this.nombreDepartamento = nombreDepartamento;
    }

    public int getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(int codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    @Override
    public String toString() {
        return "Departamento{" + "codDepartamento=" + codDepartamento + ", nombreDepartamento=" + nombreDepartamento + '}';
    }
    
}
