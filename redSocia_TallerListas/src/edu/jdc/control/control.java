package edu.jdc.control;

import edu.jdc.model.Evento;
import edu.jdc.model.Secuencia;
import edu.jdc.view.Vista;
import java.util.List;

public class control {

    private Secuencia modelo;
    private Vista vista;

    public control(Secuencia modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void agregarEvento(Evento evento) {
        modelo.agregarEvento(evento);
    }

    public void eliminarEvento(int id) {
        modelo.eliminarEvento(id);
    }

    public void mostrarEventos(List<Evento> eventos) {
        vista.mostrarEventos(eventos);
    }
}


