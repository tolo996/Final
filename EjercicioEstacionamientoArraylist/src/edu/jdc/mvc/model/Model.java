/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.mvc.model;

/**
 *
 * @author ASUS
 */
public class Model {
    private String placa;
    private String nombrePropietario;
    private String modelo;

    // Constructor
    public Model(String placa, String nombrePropietario, String modelo) {
        this.placa = placa;
        this.nombrePropietario = nombrePropietario;
        this.modelo = modelo;
    }

    // Getters y Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
