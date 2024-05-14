
package edu.jdc.mvc.control;

import edu.jdc.mvc.model.Estudiantes;
import java.util.ArrayList;
import java.util.List;

public class Control {
     private List<Estudiantes> listaEstudiantes;

    // Constructor
    public Control() {
        listaEstudiantes = new ArrayList<>();
    }

    // Método para agregar un nuevo estudiante
    public void agregarEstudiante(int codigo, String nombre, int edad) {
        Estudiantes nuevoEstudiante = new Estudiantes(codigo, nombre, edad);
        listaEstudiantes.add(nuevoEstudiante);
    }

    // Método para obtener la lista de estudiantes registrados
    public List<Estudiantes> obtenerListaEstudiantes() {
        return listaEstudiantes;
    }

}
