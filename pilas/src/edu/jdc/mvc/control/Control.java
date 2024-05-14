package edu.jdc.mvc.control;

import edu.jdc.mvc.model.Pila;
import java.util.Scanner;
import java.util.Stack;

public class Control {

    public Control() {
    }

    public void solicitudDatos() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cadena de caracteres:");
        String cadena = scanner.nextLine();

        boolean balanceado = Pila.verificarBalance(cadena);
        if (balanceado) {
            System.out.println("La cadena esta balanceada.");
        } else {
            System.out.println("La cadena no esta balanceada.");
        }
    }

    public void init() {
        solicitudDatos();
    }

}
