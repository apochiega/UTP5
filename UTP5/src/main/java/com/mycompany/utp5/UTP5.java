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
        Organigrama organigrama = new Organigrama("RECTORÍA");
        organigrama.agregarNodo("VICERRECTORÍA DEL MEDIO UNIVERSITARIO", "RECTORÍA");
        organigrama.agregarNodo("VICERRECTORÍA ADMINISTRATIVA", "RECTORÍA");
        organigrama.agregarNodo("VICERRECTORÍA ACADÉMICA", "RECTORÍA");
        organigrama.agregarNodo("FACULTAD DE CIENCIAS EMPRESARIALES", "VICERRECTORÍA ACADÉMICA");
        organigrama.agregarNodo("FACULTAD DE CIENCIAS HUMANAS", "VICERRECTORÍA ACADÉMICA");
        organigrama.agregarNodo("FACULTAD DE PSICOLOGÍA", "VICERRECTORÍA ACADÉMICA");
        organigrama.agregarNodo("FACULTAD DE INGENIERÍA Y TECNOLOGÍAS", "VICERRECTORÍA ACADÉMICA");
        organigrama.agregarNodo("VICERRECTORÍA ADMINISTRATIVA", "FACULTAD DE INGENIERÍA Y TECNOLOGÍAS");
        organigrama.agregarNodo("VICERRECTORÍA ADMINISTRATIVA", "FACULTAD DE INGENIERÍA Y TECNOLOGÍAS");
        organigrama.agregarNodo("VICERRECTORÍA ADMINISTRATIVA", "FACULTAD DE INGENIERÍA Y TECNOLOGÍAS");
        
        

        organigrama.imprimirOrganigrama();
    }
}
