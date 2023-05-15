/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utp5;

/**
 *
 * @author pijua
 */
public class Organigrama {
    Nodo raiz;

    public Organigrama(String nombreRaiz) {
        raiz = new Nodo(nombreRaiz);
    }

    public void agregarNodo(String nombreNodo, String nombrePadre) {
        Nodo nodo = new Nodo(nombreNodo);
        Nodo padre = buscarNodo(raiz, nombrePadre);
        
        if (padre != null) {
            padre.agregarHijo(nodo);
        }
        
        
    }

    private Nodo buscarNodo(Nodo elementoActual, String nombre) {
        if (elementoActual.nombre.equals(nombre)) {
            return elementoActual;
        }

        for (Nodo hijo : elementoActual.obtenerHijos()) {
            Nodo resultado = buscarNodo(hijo, nombre);
            if (resultado != null) {
                return resultado;
            }
        }

        return null;
    }

    public void imprimirOrganigrama() {
        imprimirNodo(raiz, "");
    }

    private void imprimirNodo(Nodo nodoActual, String espacios) {
        System.out.println(espacios + "- " + nodoActual.nombre);
        for (Nodo hijo : nodoActual.obtenerHijos()) {
            imprimirNodo(hijo, espacios + "  ");
        }
    }

   
}
