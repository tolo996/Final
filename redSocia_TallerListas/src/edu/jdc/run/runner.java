
package edu.jdc.run;

import edu.jdc.control.control;
import edu.jdc.model.Evento;
import edu.jdc.model.Secuencia;
import edu.jdc.view.Vista;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class runner {

   

         public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Secuencia secuencia = new Secuencia();

        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar evento");
            System.out.println("2. Eliminar evento por ID");
            System.out.println("3. Buscar eventos por tipo");
            System.out.println("4. Buscar eventos por usuario");
            System.out.println("5. Listar todos los eventos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del evento: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Ingrese el tipo de evento: ");
                    String tipo = scanner.nextLine();
                    System.out.print("Ingrese el ID del usuario: ");
                    int idUsuario = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Ingrese el contenido del evento: ");
                    String contenido = scanner.nextLine();
                    secuencia.agregarEvento(new Evento(id, tipo, idUsuario, new Date(), contenido));
                    break;
                case 2:
                    System.out.print("Ingrese el ID del evento a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    secuencia.eliminarEvento(idEliminar);
                    break;
                case 3:
                    System.out.print("Ingrese el tipo de evento a buscar: ");
                    String tipoBuscar = scanner.nextLine();
                    List<Evento> eventosPorTipo = secuencia.buscarEventosPorTipo(tipoBuscar);
                    System.out.println("Eventos encontrados:");
                    for (Evento evento : eventosPorTipo) {
                        System.out.println(evento.getId() + ": " + evento.getContenido());
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el ID del usuario a buscar: ");
                    int idUsuarioBuscar = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    List<Evento> eventosPorUsuario = secuencia.buscarEventosPorUsuario(idUsuarioBuscar);
                    System.out.println("Eventos encontrados:");
                    for (Evento evento : eventosPorUsuario) {
                        System.out.println(evento.getId() + ": " + evento.getContenido());
                    }
                    break;
                case 5:
                    System.out.println("Todos los eventos:");
                    List<Evento> todosEventos = secuencia.listarEventos(null, -1);
                    for (Evento evento : todosEventos) {
                        System.out.println(evento.getId() + ": " + evento.getContenido());
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
            System.out.println();
        } while (opcion != 0);
        scanner.close();
    }
}
    

    

