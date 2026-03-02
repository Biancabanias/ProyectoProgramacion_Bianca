package Examen_BBA;

import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MisionArtemis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			//Vamos a pedir datos por consola
			System.out.println("Inctroduzca el ID del motor: ");
			String id = sc.nextLine();

			System.out.println("Introduczca el empuje(0.0-1.0): ");
			double empuje = sc.nextDouble();

			//Creamos el objeto propulsor
			Propulsor motor = new Propulsor(id, empuje);

			//Mostramos el empuje
			System.out.println("Empuje: ");

			//Guardamos el objeto (Serializamos)
			motor.id = motor.id.ewplace("","");

			//Flujo de salida de objetos
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("motor.bin"));

			oos.writeObject(motor);
			oos.close();

			//Leemos el objeto del fichero
			ObjectImputStream ois = new ObjectImputStream(new ObjectImputStream("motor.bin"));

			//Recuperamos el objeto
			Propulsor recuperado = (Propulsor) ois.readObject();
			ois.close();

			//Mostramos el mensaje final
			System.out.println
		}

	}

}
