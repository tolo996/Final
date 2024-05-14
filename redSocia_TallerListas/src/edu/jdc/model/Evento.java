package edu.jdc.model;

import java.util.*;

public class Evento {

    private int id;
    private String tipoEvento;
    private int idUsuario;
    private Date fechaHora;
    private String contenido;

    public Evento(int id, String tipoEvento, int idUsuario, Date fechaHora, String contenido) {
        this.id = id;
        this.tipoEvento= tipoEvento;
        this.idUsuario = idUsuario;
        this.fechaHora = fechaHora;
        this.contenido = contenido;
    }

    public int getId() {
        return id;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public String getContenido() {
        return contenido;
    }
}
