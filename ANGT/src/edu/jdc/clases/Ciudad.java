
package edu.jdc.clases;

public class Ciudad {
    private String nombreCiudad;
    private String cantidadPoblacion;
    private int areaExtencion;
    private Departamento nombreDepartamento;

    public Ciudad() {
    }

    public Ciudad(String nombreCiudad, String cantidadPoblacion, int areaExtencion, Departamento nombreDepartamento) {
        this.nombreCiudad = nombreCiudad;
        this.cantidadPoblacion = cantidadPoblacion;
        this.areaExtencion = areaExtencion;
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getCantidadPoblacion() {
        return cantidadPoblacion;
    }

    public void setCantidadPoblacion(String cantidadPoblacion) {
        this.cantidadPoblacion = cantidadPoblacion;
    }

    public int getAreaExtencion() {
        return areaExtencion;
    }

    public void setAreaExtencion(int areaExtencion) {
        this.areaExtencion = areaExtencion;
    }

    public Departamento getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(Departamento nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombreCiudad=" + nombreCiudad + ", cantidadPoblacion=" + cantidadPoblacion + ", areaExtencion=" + areaExtencion + ", nombreDepartamento=" + nombreDepartamento + '}';
    }

   
    
}
