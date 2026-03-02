package UD5;

import java.io.Serializable;
/**
 * Clase Persona a serializar
 */


public class Persona implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *
	 */


	//Atributos
	private String nombre;
	private int edad;

	    //Contructor
	    public Persona(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	    }

	    @Override
	    public String toString() {
	        return nombre + " (" + edad + " años)";
	    }
	}
