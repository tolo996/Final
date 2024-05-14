
package edu.jdc.clases;


public class Bodega {
    private int codBodego;
    private String nombreBodega;
    private int inicioCategoria;
    private int finalCategoria;

    public Bodega() {
    }

    public Bodega(int codBodego, String nombreBodega, int inicioCategoria, int finalCategoria) {
        this.codBodego = codBodego;
        this.nombreBodega = nombreBodega;
        this.inicioCategoria = inicioCategoria;
        this.finalCategoria = finalCategoria;
    }

    public int getCodBodego() {
        return codBodego;
    }

    public void setCodBodego(int codBodego) {
        this.codBodego = codBodego;
    }

    public String getNombreBodega() {
        return nombreBodega;
    }

    public void setNombreBodega(String nombreBodega) {
        this.nombreBodega = nombreBodega;
    }

    public int getInicioCategoria() {
        return inicioCategoria;
    }

    public void setInicioCategoria(int inicioCategoria) {
        this.inicioCategoria = inicioCategoria;
    }

    public int getFinalCategoria() {
        return finalCategoria;
    }

    public void setFinalCategoria(int finalCategoria) {
        this.finalCategoria = finalCategoria;
    }

    @Override
    public String toString() {
        return "Bodega{" + "codBodego=" + codBodego + ", nombreBodega=" + nombreBodega + ", inicioCategoria=" + inicioCategoria + ", finalCategoria=" + finalCategoria + '}';
    }
    
    
    
}
