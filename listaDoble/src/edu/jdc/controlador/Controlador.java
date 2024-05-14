
package edu.jdc.controlador;

import edu.jdc.vista.Vista;
import java.util.Scanner;


public class Controlador {

    public Controlador() {
    }
    
    public void Menu(){
    Vista listaTareas = new Vista();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1.Agregar estudiante al inicio");
            System.out.println("2.Eliminar primer estudiante");
            System.out.println("3.Agregar ultimo estudiante");
            System.out.println("4.Eliminar Ultimo estudiante");
            System.out.println("5.Mostrar lista");
            System.out.println("6.Salir");
            System.out.print("Selecciona una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después del número

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el estudiante a agregar: ");
                    String estudianteAgregar = scanner.nextLine();
                    listaTareas.agregarEstudiante(estudianteAgregar);
                    break;
                case 2:
                    System.out.print("Ingrese la tarea a completar: ");
                    String tareaCompletar = scanner.nextLine();
                    listaTareas.EliminarEstudianteInicio();
                    break;
                case 3:
                    listaTareas.agregarUltimoEstudiante();
                    break;
                case 4:
                    String tareaEliminar = scanner.nextLine();
                    listaTareas.eliminarUltimoEstudiante(estudianteAgregar);
                    break;
                case 5:
                    int tareasPendientes = listaTareas.mostrarLista();
                    System.out.println("Tareas pendientes: " + tareasPendientes);
                    break;
                case 6:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
    public void init(){
        Menu();
    }
}
