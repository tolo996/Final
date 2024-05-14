
package edu.jdc.mvc.view;

import edu.jdc.mvc.control.Control;
import edu.jdc.mvc.model.Estudiantes;
import java.util.List;
import java.util.Scanner;


public class View {
     private Control controlador;
    private Scanner scanner;

    // Constructor
    public View(Control controlador) {
        this.controlador = controlador;
        scanner = new Scanner(System.in);
    }

    // Método para solicitar y registrar un nuevo estudiante
    public void registrarEstudiante() {
        System.out.println("Ingrese el código del estudiante:");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de leer el número
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la edad del estudiante:");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de leer el número

        controlador.agregarEstudiante(codigo, nombre, edad);
        System.out.println("Estudiante registrado exitosamente.");
    }

    // Método para mostrar la lista de estudiantes registrados
    public void mostrarListaEstudiantes() {
        List<Estudiantes> listaEstudiantes = controlador.obtenerListaEstudiantes();
        System.out.println("Lista de estudiantes registrados:");
        for (Estudiantes estudiante : listaEstudiantes) {
            System.out.println("Código: " + estudiante.getCodigo() + ", Nombre: " + estudiante.getNombre() + ", Edad: " + estudiante.getEdad());
        }
    }

}
