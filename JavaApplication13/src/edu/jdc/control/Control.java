package edu.jdc.control;

import edu.jdc.modelo.juegoModel;

public class Control {

    private juegoModel juegoModell;

    juegoModel juegoModel;

    public Control(int numSillas) {
        this.juegoModel = new juegoModel(numSillas);
    }

    public void simularMusica() {
        juegoModel.simularMusica();
    }

    public boolean hayGanador() {
        return juegoModel.hayGanador();
    }

    public void mostrarEstado() {
        juegoModel.mostrarEstado();
    }

    public void ocuparSilla() {
        juegoModel.ocuparSilla();
    }
}
