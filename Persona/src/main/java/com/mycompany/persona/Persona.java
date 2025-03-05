package com.mycompany.persona;

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

class Doctor extends Personas {
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

class Deportista extends Personas {
    private String deporte;
    private String posicion;

    public Deportista(String nombre, int edad, String dni, String genero, String nacionalidad, String deporte, String posicion) {
        super(nombre, edad, dni, genero, nacionalidad);
        this.deporte = deporte;
        this.posicion = posicion;
        this.nacionalidad = "Hondureño"; // Nacionalidad de la Deportista
        this.genero = "Femenino"; // Género de la Deportista
    }

    public void DatosInfo() {
        System.out.println("Deportista: " + getNombre());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("DNI: " + getDni());
        System.out.println("Deporte: " + deporte);
        System.out.println("Posicion: " + posicion);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Género: " + genero);
    }
}

public class Persona {
    public static void main(String[] args) {
        
        System.out.println("\n----------------------\n");
        
        Doctor doctor = new Doctor("Carlos", 35, "0501-1990-10799", "Masculino", "Hondureño", "Cardiologia", "AMM22", "Hospital Mario Catarino");
        doctor.atenderPaciente();

        System.out.println("\n----------------------\n");

        Deportista deportista = new Deportista("Alejandra", 28, "0501-1997-10988", "Femenino", "Hondureña", "Futbol", "Delantero");
        deportista.DatosInfo();
    }
}
