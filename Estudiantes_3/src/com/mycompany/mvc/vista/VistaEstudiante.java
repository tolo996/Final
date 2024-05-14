/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc.vista;

import com.mycompany.mvc.controlador.ControladorEstudiantes;
import com.mycompany.mvc.modelo.Estudiante;
import java.util.Scanner;

public class VistaEstudiante {

    private Scanner scanner;
    private ControladorEstudiantes Controlador;

    public VistaEstudiante() {
        this.scanner = new Scanner(System.in);
        Controlador=new ControladorEstudiantes();
    }
 public void setControlador(ControladorEstudiantes controlador) {
        this.Controlador = controlador;
    }
    public void mostrarMenu() {
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Eliminar estudiante");
        System.out.println("3. Actualizar estudiante");
        System.out.println("4. Salir");
    }

    public void solicitarDatosEstudiante() {
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el ID del estudiante:");
        int id = Integer.parseInt(scanner.nextLine());
        Controlador.agregarEstudiante(nombre, id);
    }

    public void solicitarEliminarEstudiante() {
        System.out.println("Ingrese el ID del estudiante a eliminar:");
        int id = Integer.parseInt(scanner.nextLine());
        Controlador.eliminarEstudiante(id);
    }

    public void solicitarActualizarEstudiante() {
        System.out.println("Ingrese el ID del estudiante a actualizar:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el nuevo nombre:");
        String nuevoNombre = scanner.nextLine();
        Controlador.actualizarEstudiante(id, nuevoNombre);
    }
}
