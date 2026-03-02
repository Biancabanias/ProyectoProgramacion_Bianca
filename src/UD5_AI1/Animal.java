package UD5_AI1;

import java.io.Serializable;

/**
 * Clase Animal serializable.
 */
public class Animal implements Serializable {

    String nombre;
    int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
	public String toString() {
        return nombre + " - " + edad + " años";
    }
}

