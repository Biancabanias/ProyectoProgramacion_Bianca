package COMPOSICION;

import java.util.ArrayList;

public class Banda {
	private String nombre;
	private ArrayList<Musico> músicos;

	public Banda(String nombre) {
		this.nombre = nombre;
		this.músicos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Musico> getMusicos() {
		return músicos;
	}

	public void agregarMusico(String nombre, int edad) {
		músicos.add(new Musico(nombre, edad));
	}
}
