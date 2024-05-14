package edu.jdc.modelo;

import java.util.Random;

public class juegoModel {

    Nodo inicio;
    int numSillas;

    public juegoModel(int numSillas) {
        this.numSillas = numSillas;
        crearSillas();
    }

    private void crearSillas() {
        inicio = new Nodo();
        Nodo actual = inicio;
        for (int i = 1; i < numSillas; i++) {
            actual.siguiente = new Nodo();
            actual = actual.siguiente;
        }
        actual.siguiente = inicio; // Cerramos la lista circular
    }

    public void simularMusica() {
        Random random = new Random();
        int pasos = random.nextInt(numSillas); // Número aleatorio de pasos antes de detenerse

        for (int i = 0; i < pasos; i++) {
            inicio = inicio.siguiente; // Movimiento alrededor de las sillas
        }
        ocuparSillaAleatoria();
    }

    private void ocuparSillaAleatoria() {
         Random random = new Random();
    int sillaAleatoria = random.nextInt(numSillas); // Silla aleatoria a ocupar

    Nodo actual = inicio;
    for (int i = 0; i < sillaAleatoria; i++) {
        actual = actual.siguiente;
    }
    actual.ocupada = true;
    }
    

    public void ocuparSilla() {
        Nodo anterior = inicio;
        while (anterior.siguiente != inicio) {
            anterior = anterior.siguiente;
        }
        anterior.siguiente = inicio.siguiente; // Eliminamos el nodo actual (silla ocupada)
        inicio = inicio.siguiente; // Movemos el inicio al siguiente nodo
        numSillas--; // Reducimos el número de sillas disponibles
    }

    public boolean hayGanador() {
        return numSillas == 1; // Solo hay un ganador si queda una sola silla
    }

    public void mostrarEstado() {
        Nodo actual = inicio;
        System.out.println("Estado actual del juego:");
        for (int i = 0; i < numSillas; i++) {
            System.out.println("Silla " + (i + 1) + ": " + (actual.ocupada ? "Ocupada" : "Desocupada"));
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
