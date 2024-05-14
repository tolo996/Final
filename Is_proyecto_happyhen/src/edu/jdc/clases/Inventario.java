/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.clases;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Inventario {
    private int codInventario;
    private Date fecha;
    private Bodega codBodega;
    private Usuario documentoUsuario;
    private Galpones codGalpon;
    private LocalTime horaInicioInventario;
    private LocalTime hora5FinaleInventario;

    public Inventario() {
    }

    public Inventario(int codInventario, Date fecha, Bodega codBodega, Usuario documentoUsuario, Galpones codGalpon, LocalTime horaInicioInventario, LocalTime hora5FinaleInventario) {
        this.codInventario = codInventario;
        this.fecha = fecha;
        this.codBodega = codBodega;
        this.documentoUsuario = documentoUsuario;
        this.codGalpon = codGalpon;
        this.horaInicioInventario = horaInicioInventario;
        this.hora5FinaleInventario = hora5FinaleInventario;
    }

    public int getCodInventario() {
        return codInventario;
    }

    public void setCodInventario(int codInventario) {
        this.codInventario = codInventario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Bodega getCodBodega() {
        return codBodega;
    }

    public void setCodBodega(Bodega codBodega) {
        this.codBodega = codBodega;
    }

    public Usuario getDocumentoUsuario() {
        return documentoUsuario;
    }

    public void setDocumentoUsuario(Usuario documentoUsuario) {
        this.documentoUsuario = documentoUsuario;
    }

    public Galpones getCodGalpon() {
        return codGalpon;
    }

    public void setCodGalpon(Galpones codGalpon) {
        this.codGalpon = codGalpon;
    }

    public LocalTime getHoraInicioInventario() {
        return horaInicioInventario;
    }

    public void setHoraInicioInventario(LocalTime horaInicioInventario) {
        this.horaInicioInventario = horaInicioInventario;
    }

    public LocalTime getHora5FinaleInventario() {
        return hora5FinaleInventario;
    }

    public void setHora5FinaleInventario(LocalTime hora5FinaleInventario) {
        this.hora5FinaleInventario = hora5FinaleInventario;
    }

    @Override
    public String toString() {
        return "Inventario{" + "codInventario=" + codInventario + ", fecha=" + fecha + ", codBodega=" + codBodega + ", documentoUsuario=" + documentoUsuario + ", codGalpon=" + codGalpon + ", horaInicioInventario=" + horaInicioInventario + ", hora5FinaleInventario=" + hora5FinaleInventario + '}';
    }
    
    

}