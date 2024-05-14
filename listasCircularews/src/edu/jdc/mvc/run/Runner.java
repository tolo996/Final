
package edu.jdc.mvc.run;

import edu.jdc.mvc.control.BibliotecaControl;
import edu.jdc.mvc.model.BibliotecaModel;
import edu.jdc.mvc.vista.Vista;
import java.util.Scanner;


public class Runner {

    public static void main(String[] args) {
        BibliotecaModel bibliotecaModel = new BibliotecaModel();
        Vista bibliotecaView = new Vista();
        BibliotecaControl bibliotecaController = new BibliotecaControl(bibliotecaModel);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el titulo del libro: ");
                    scanner.nextLine(); 
                    String titulo = scanner.nextLine();
                    bibliotecaController.agregarLibro(titulo);
                    break;
                case 2:
                    System.out.print("Ingrese el título del libro a eliminar: ");
                    scanner.nextLine(); 
                    String tituloEliminar = scanner.nextLine();
                    bibliotecaController.eliminarLibros(tituloEliminar);
                    break;
                case 3:
                    String libros = bibliotecaController.obtenerLibros();
                    bibliotecaView.mostrarLibros(libros);
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida. Intentelo de nuevo.");
            }
        }
    }
}
