
package edu.jdc.view;

import edu.jdc.control.Control;
import java.util.Scanner;


public class View {
     private Control controller;
    private Scanner scanner;

    public View(Control controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        boolean run = true;
        while(run) {
            System.out.println("1. Anadir Cliente");
            System.out.println("2. Atender Cliente");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Salir");
            System.out.print("Por favor escoger una opcion: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch(choice) {
                case 1:
                    System.out.print("Digite el nombre del cliente: ");
                    String name = scanner.nextLine();
                    controller.aniadirCliente(name);
                    break;
                case 2:
                    controller.atenderCliente();
                    break;
                case 3:
                    controller.imprimirCola();
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor digite un numero valido");
            }
        }
    }
}
