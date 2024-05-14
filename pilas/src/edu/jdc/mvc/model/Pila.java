
package edu.jdc.mvc.model;

import java.util.Stack;


public class Pila {
 public static boolean verificarBalance(String cadena) {
        Stack<Character> pila = new Stack<>();

        for (char caracter : cadena.toCharArray()) {
            if (caracter == '(') {
                pila.push(caracter);
            } else if (caracter == ')') {
                if (pila.isEmpty() || pila.pop() != '(') {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }   
}
