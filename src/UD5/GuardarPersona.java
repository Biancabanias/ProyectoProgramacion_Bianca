package UD5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


	public class GuardarPersona {
		public static void main(String[] args) {

			//Creamos una instancia de Persona
			Persona p = new Persona("Lucía", 25);

			//Codigo para serializar la persona
			try (ObjectOutputStream oos = new ObjectOutputStream(new
				FileOutputStream("src\\\\UD5\\\\ persona.dat"))) {
				oos.writeObject(p);
				System.out.println("Objeto Persona guardado correctamente.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
