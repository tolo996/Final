/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.mvc.controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Control {
    private List<String> listaCarros;

    // Constructor
    public Control() {
        listaCarros = new ArrayList<>();
    }

    // Método para agregar un nuevo carro al estacionamiento
    public void agregarCarro(String carro) {
        listaCarros.add(carro);
    }

    // Método para obtener la lista de carros registrados
    public List<String> obtenerListaCarros() {
        return listaCarros;
    }
}

