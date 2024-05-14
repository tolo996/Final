/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.mvc.view;

import edu.jdc.mvc.controller.Control;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
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

        String carro = "Placa: " + placa + ", Propietario: " + nombrePropietario + ", Modelo: " + modelo;
        controlador.agregarCarro(carro);
        System.out.println("Carro registrado exitosamente.");
    }

    // Método para mostrar la lista de carros registrados
    public void mostrarListaCarros() {
        List<String> listaCarros = controlador.obtenerListaCarros();
        System.out.println("Lista de carros registrados:");
        for (String carro : listaCarros) {
            System.out.println(carro);
        }
    }

}
