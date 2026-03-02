package UD5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ejmReader {

    public static void main(String[] args) {

        // Para comprobar que el programa ARRANCA
        System.out.println("Programa iniciado");

        try (
            BufferedReader br = new BufferedReader(new FileReader("origen.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("destino.txt"))
        ) {

            String linea;

            while ((linea = br.readLine()) != null) {
                bw.write(linea.toUpperCase());
                bw.newLine();
            }

            System.out.println("Archivo creado correctamente");

        } catch (IOException e) {
            System.out.println("Error al leer o escribir el archivo");
            e.printStackTrace();
        }
    }
}


