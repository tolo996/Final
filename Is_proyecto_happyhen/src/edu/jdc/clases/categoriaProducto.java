
package edu.jdc.clases;

public class categoriaProducto {
    private int codigoCategoriaHuevo;
    private String nombreCategoriaHuevo;
    private String valorInicial;
    private String valorFinal;

    public categoriaProducto() {
    }

    public categoriaProducto(int codigoCategoriaHuevo, String nombreCategoriaHuevo, String valorInicial, String valorFinal) {
        this.codigoCategoriaHuevo = codigoCategoriaHuevo;
        this.nombreCategoriaHuevo = nombreCategoriaHuevo;
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
    }

    public int getCodigoCategoriaHuevo() {
        return codigoCategoriaHuevo;
    }

    public void setCodigoCategoriaHuevo(int codigoCategoriaHuevo) {
        this.codigoCategoriaHuevo = codigoCategoriaHuevo;
    }

    public String getNombreCategoriaHuevo(){ 
        return nombreCategoriaHuevo;
    }

    public void setNombreCategoriaHuevo(String nombreCategoriaHuevo) {
        this.nombreCategoriaHuevo = nombreCategoriaHuevo;
    }

    public String getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(String valorInicial) {
        this.valorInicial = valorInicial;
    }

    public String getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(String valorFinal) {
        this.valorFinal = valorFinal;
    }

    @Override
    public String toString() {
        return "categoriaProducto{" + "codigoCategoriaHuevo=" + codigoCategoriaHuevo + ", nombreCategoriaHuevo=" + nombreCategoriaHuevo + ", valorInicial=" + valorInicial + ", valorFinal=" + valorFinal + '}';
    }
    
    
}
