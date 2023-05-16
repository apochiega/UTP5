/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utp5;

import java.util.ArrayList;

/**
 *
 * @author pijua
 */
public class Nodo {

    String nombre;

    ArrayList<Nodo> hijos;

    public Nodo(String nombre) {
        this.nombre = nombre;
        hijos = new ArrayList<>();
    }

    public void agregarHijo(Nodo hijo) {
        hijos.add(hijo);
    }

    public ArrayList<Nodo> obtenerHijos() {
        return hijos;
    }
}
