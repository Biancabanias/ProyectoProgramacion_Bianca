package UD5_AI1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Copia una imagen usando streams binarios.
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("imagen.jpg"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copia_imagen.jpg"))) {

            int dato;
            while ((dato = bis.read()) != -1) {
                bos.write(dato);
            }

            System.out.println("La imagen a sido copiada correctamente.");

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el aarchivo");
        } catch (IOException e) {
            System.out.println("Error al copiar el archivo.");
        }
    }
}

