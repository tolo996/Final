/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.mvc.runner;

import edu.jdc.mvc.control.Control;
import edu.jdc.mvc.view.View;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Runner {

    public static void main(String[] args) {

        Control controlador = new Control();
        // Crear la vista y pasar el controlador
        View vista = new View(controlador);
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Bienvenido al sistema de registro de estudiantes");
            System.out.println("1. Registrar un nuevo estudiante");
            System.out.println("2. Mostrar la lista de estudiantes registrados");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el número

            switch (opcion) {
                case 1:
                    vista.registrarEstudiante();
                    break;
                case 2:
                    vista.mostrarListaEstudiantes();
                    break;
                case 3:
                    System.out.println("¡Gracias por usar nuestro sistema de registro de estudiantes!");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, ingrese un numero valido.");
            }
        } while (opcion != 3);
        scanner.close();
    }

}
