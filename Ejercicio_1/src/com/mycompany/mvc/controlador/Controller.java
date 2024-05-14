package com.mycompany.mvc.controlador;

import com.mycompany.mvc.modelo.Retiro;
import com.mycompany.mvc.modelo.Transaccion;
import com.mycompany.mvc.vista.View;

/*
nombre: Juan Diego Tolosa
fecha:20/02/2024
 */
public class Controller {

    private View vista;
    private Transaccion objectTransaccion;
    private Retiro objectRetiro;

    public Controller(View objectVista) {
        vista = objectVista;
    }

    public void menu() {
        boolean salir = false;

        while (!salir) {
            int opcion = vista.menu();
            switch (opcion) {
                case 1:
                    objectTransaccion = vista.obtenerDatosTransaccion();
                    vista.mostrarMensaje("Transaccion realizada exitosamente");
                    break;

                case 2:
                    objectRetiro = vista.obtenerDatosRetiro();
                    vista.mostrarMensaje("Su retiro se ha realizado exitosamente");
                    break;

                case 3:
                    vista.mostrarTransacciones(objectTransaccion);
                    break;
                    
                case 4:
                    vista.mostrarRetiros(objectRetiro);
                    break;
                case 5:
                    salir=true;
                    vista.mostrarMensaje("ha salido del programa...");
                    break;
                default:
                    vista.mostrarMensaje("La opcion que acaba de digitar no es valida.");

            }

        }
    }

    public void init() {
menu();
    }
}
