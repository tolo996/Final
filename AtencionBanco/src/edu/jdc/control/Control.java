package edu.jdc.control;

import edu.jdc.model.Clientes;
import java.util.LinkedList;
import java.util.Queue;

public class Control {

    private Queue<Clientes> colaClientes = new LinkedList<>();

    public void aniadirCliente(String name) {
        Clientes nuevoCliente = new Clientes(name);
        colaClientes.add(nuevoCliente);
        System.out.println("Cliente " + nuevoCliente.getNombre() + " con el ID " + nuevoCliente.getId() + " ha sido anadido a la cola.");
    }

    public void atenderCliente() {
        if (!colaClientes.isEmpty()) {
            Clientes cliente = colaClientes.poll();
            System.out.println("Cliente " + cliente.getNombre() + " con el ID " + cliente.getId() + " esta siendo atendido");
        } else {
            System.out.println("no hay clientes en la cola");
        }
    }

    public void imprimirCola() {
        if (colaClientes.isEmpty()) {
            System.out.println("no hay clientes en la cola");

        } else {
            System.out.println("Cola actual");
            for (Clientes cliente : colaClientes) {
                System.out.println("Cliente ID: " + cliente.getId() + ", Nombre: " + cliente.getNombre());

            }

        }

    }
}
