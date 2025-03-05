/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona.Proyecto;

/**
 *
 * @author gesle
 */
abstract class Personas {
    protected String nombre;
    protected int edad;
    protected String dni;
    protected String genero;
    protected String nacionalidad;

    public Personas(String nombre, int edad, String dni, String genero, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public abstract void DatosInfo();
}
