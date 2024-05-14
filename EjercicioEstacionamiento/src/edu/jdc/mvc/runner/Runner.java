package edu.jdc.mvc.runner;

import edu.jdc.mvc.controller.Control;
import edu.jdc.mvc.view.View;
import java.util.Scanner;


public class Runner {
    
    public static void main(String[] args) {
        Control controlador = new Control();
        View vista = new View(controlador);
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Bienvenido al sistema de registro de carros");
            System.out.println("1. Registrar un nuevo carro");
            System.out.println("2. Mostrar la lista de carros registrados");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el número

            switch (opcion) {
                case 1:
                    vista.registrarCarro();
                    break;
                case 2:
                    vista.mostrarListaCarros();
                    break;
                case 3:
                    System.out.println("¡Gracias por usar nuestro sistema de registro de carros!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número válido.");
            }
        } while (opcion != 3);
        
        scanner.close();
    }
}
    

