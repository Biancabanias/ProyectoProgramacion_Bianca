package UD5_AI1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Serializa y deserializa animales.
 */
public class Ejercicio6 {

    public static void main(String[] args) {

        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("animales.dat"));

            oos.writeObject(new Animal("Mapache", 3));
            oos.writeObject(new Animal("Huron", 2));
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("animales.dat"));

            Animal a1 = (Animal) ois.readObject();
            Animal a2 = (Animal) ois.readObject();

            System.out.println(a1);
            System.out.println(a2);

            ois.close();

        } catch (Exception e) {
            System.out.println("Ha fallado la serialización.");
        }
    }
}

