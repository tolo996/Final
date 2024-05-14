
package edu.jdc.mvc.view;

import edu.jdc.mvc.controller.Control;
import edu.jdc.mvc.model.Model;
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

    // Método para solicitar y registrar un nuevo carro
    public void registrarCarro() {
        System.out.println("Ingrese la placa del carro:");
        String placa = scanner.nextLine();
        System.out.println("Ingrese el nombre del propietario:");
        String nombrePropietario = scanner.nextLine();
        System.out.println("Ingrese el modelo del carro:");
        String modelo = scanner.nextLine();

        controlador.agregarCarro(placa, nombrePropietario, modelo);
        System.out.println("Carro registrado exitosamente.");
    }

    // Método para mostrar la lista de carros registrados
    public void mostrarListaCarros() {
        List<Model> listaCarros = controlador.obtenerListaCarros();
        System.out.println("Lista de carros registrados:");
        for (Model carro : listaCarros) {
            System.out.println("Placa: " + carro.getPlaca() + ", Propietario: " + carro.getNombrePropietario() + ", Modelo: " + carro.getModelo());
        }
    }
}

