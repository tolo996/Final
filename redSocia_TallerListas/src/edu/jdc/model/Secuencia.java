
package edu.jdc.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Secuencia {
    private List<Evento> eventos;

    public Secuencia() {
        eventos = new ArrayList<>();
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
        Collections.sort(eventos, Comparator.comparing(Evento::getFechaHora));
    }

    public void eliminarEvento(int id) {
        eventos.removeIf(evento -> evento.getId() == id);
    }

    public List<Evento> buscarEventosPorTipo(String tipoEvento) {
        List<Evento> eventosEncontrados = new ArrayList<>();
        for (Evento evento : eventos) {
            if (evento.getTipoEvento().equals(tipoEvento)) {
                eventosEncontrados.add(evento);
            }
        }
        return eventosEncontrados;
    }

    public List<Evento> buscarEventosPorUsuario(int idUsuario) {
        List<Evento> eventosEncontrados = new ArrayList<>();
        for (Evento evento : eventos) {
            if (evento.getIdUsuario() == idUsuario) {
                eventosEncontrados.add(evento);
            }
        }
        return eventosEncontrados;
    }

    public List<Evento> listarEventos(String tipoEventoFiltro, int idUsuarioFiltro) {
        List<Evento> eventosListados = new ArrayList<>();
        for (Evento evento : eventos) {
            if ((tipoEventoFiltro == null || evento.getTipoEvento().equals(tipoEventoFiltro)) &&
                    (idUsuarioFiltro == -1 || evento.getIdUsuario() == idUsuarioFiltro)) {
                eventosListados.add(evento);
            }
        }
        return eventosListados;
    }
}
