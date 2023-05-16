/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.utp5;

/**
 *
 * @author pijua
 */
public class UTP5 {

    public static void main(String[] args) {
        //Se crea la base del organigrama. Será el nodo de menor nivel.
        Organigrama organigrama = new Organigrama("RECTORÍA");

        //Se crean nodos a partir del primer String, como hijos de RECTORÍA, la raíz.
        organigrama.agregarNodo("VICERRECTORÍA DEL MEDIO UNIVERSITARIO", "RECTORÍA");
        organigrama.agregarNodo("VICERRECTORÍA ADMINISTRATIVA", "RECTORÍA");
        organigrama.agregarNodo("VICERRECTORÍA ACADÉMICA", "RECTORÍA");

        //Se crean los nodos del nivel 2, hijos de VICERRECTORÍA ACADÉMICA: nivel 1.
        organigrama.agregarNodo("FACULTAD DE CIENCIAS EMPRESARIALES", "VICERRECTORÍA ACADÉMICA");
        organigrama.agregarNodo("FACULTAD DE CIENCIAS HUMANAS", "VICERRECTORÍA ACADÉMICA");
        organigrama.agregarNodo("FACULTAD DE PSICOLOGÍA", "VICERRECTORÍA ACADÉMICA");
        organigrama.agregarNodo("FACULTAD DE INGENIERÍA Y TECNOLOGÍAS", "VICERRECTORÍA ACADÉMICA");

        //Se crean los nodos del nivel 3, hijos de FACULTAD DE INGENIERÍA Y TECNOLOGÍAS: nivel 2.
        organigrama.agregarNodo("VICERRECTORÍA ADMINISTRATIVA", "FACULTAD DE INGENIERÍA Y TECNOLOGÍAS");
        organigrama.agregarNodo("VICERRECTORÍA ADMINISTRATIVA", "FACULTAD DE INGENIERÍA Y TECNOLOGÍAS");
        organigrama.agregarNodo("VICERRECTORÍA ADMINISTRATIVA", "FACULTAD DE INGENIERÍA Y TECNOLOGÍAS");

        //Se imprime en pantalla el organigrama para visualizar lo creado.
        organigrama.imprimirOrganigrama();
    }
}
