/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc.modelo;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Estudiante {

    private String estudiante;
    private String idEstudiante;
    private ArrayList<Estudiante> listaEstudiantes;

    public Estudiante() {
    }

    public Estudiante(String estudiante, String idEstudiante) {
        this.estudiante = estudiante;
        this.idEstudiante = idEstudiante;
        this.listaEstudiantes = new ArrayList<>();
    }

    public String ListaEstudiantes(){
        listaEstudiantes.add(estudiante,idEstudiante);
        return null;
        
    }
    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

}
