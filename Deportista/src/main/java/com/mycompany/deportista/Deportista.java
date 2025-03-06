/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona;

/**
 *
 * @author usuar
 */
public class Deportista extends Persona {
    private String deporte;
    private String equipo;
    private String posicion;

    public Deportista(String nombre, int edad, String dni, String genero, String nacionalidad,
                      String deporte, String equipo, String posicion) {
        super(nombre, edad, dni, genero, nacionalidad);
        this.deporte = deporte;
        this.equipo = equipo;
        this.posicion = posicion;
    }

    public void mostrarInformacion() {
        System.out.println("Deportista: " + getNombre());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Deporte: " + deporte);
        System.out.println("Equipo: " + equipo);
        System.out.println("Posición: " + posicion);
    }
}

