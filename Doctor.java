/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona.Proyecto;

/**
 *
 * @author gesle
 */
class Doctor extends com.mycompany.persona.Personas {
    private String especialidad;
    private String numeroLicencia;
    private String hospital;

    public Doctor(String nombre, int edad, String dni, String genero, String nacionalidad, String especialidad, String numeroLicencia, String hospital) {
        super(nombre, edad, dni, genero, nacionalidad);
        this.especialidad = especialidad;
        this.numeroLicencia = numeroLicencia;
        this.hospital = hospital;
    }

    public void atenderPaciente() {
        System.out.println("EL DOCTOR " + getNombre() + " ESTA ATENDIENDO A UN PACIENTE");
        System.out.println("\n-------INFORMACION DOCTOR--------\n");
        DatosInfo();
    }

    public void DatosInfo() {
        System.out.println("Doctor: " + getNombre());
        System.out.println("DNI: " + getDni());
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Numero de Licencia: " + numeroLicencia);
        System.out.println("Hospital: " + hospital);
    }
}