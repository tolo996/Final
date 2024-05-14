
package edu.jdc.model;

import java.util.Objects;


public class paginaWeb {
    private String url;
    private String titulo;

    public paginaWeb() {
    }

    public paginaWeb(String url, String titulo) {
        this.url = url;
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    
}
