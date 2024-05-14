
package edu.jdc.runner;

import edu.jdc.control.Control;
import edu.jdc.view.View;
import java.util.Scanner;


public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de sillas para el juego: ");
        int numSillas = scanner.nextInt();

        Control juegoController = new Control(numSillas);
        View juegoView = new View();

        while (!juegoController.hayGanador()) {
            juegoView.mostrarMensaje("La musica esta sonando!");
            juegoController.simularMusica();
            juegoView.mostrarMensaje("La musica se detuvo!");
            juegoController.ocuparSilla();
            juegoController.mostrarEstado();
        }

        juegoView.mostrarMensaje("Tenemos un ganador!");
        scanner.close();
}
}