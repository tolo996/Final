/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc.controlador;

import com.mycompany.mvc.modelo.Estudiante;
import com.mycompany.mvc.vista.VistaEstudiante;
import java.util.ArrayList;
import java.util.List;

public class ControladorEstudiantes {
     private VistaEstudiante vista;

    private List<Estudiante> listaEstudiantes;
    private Estudiante objectEstudiante;

    public ControladorEstudiantes() {
    }

    
    public ControladorEstudiantes(VistaEstudiante vista) {
        this.listaEstudiantes = new ArrayList<>();
        objectEstudiante = new Estudiante();

    }

    public void agregarEstudiante(String nombre, int id) {
        listaEstudiantes.add(new Estudiante(nombre, id));
    }

    public void eliminarEstudiante(int id) {
        listaEstudiantes.removeIf(estudiante -> estudiante.getId() == id);
    }

    public void actualizarEstudiante(int id, String nuevoNombre) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getId() == id) {
                estudiante.setNombre(nuevoNombre);
                break;
            }
        }
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }
    public void init(){
       
    }
}
