package UD5_AI1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Nos permite escribir y leer notas de un diario.
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("diario.txt", true))) {
            System.out.print("Escriba una nota: ");
            String nota = sc.nextLine();
            bw.write(nota);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al escribir el diario.");
        }

        System.out.println("\nContenido del diario:");

        try (BufferedReader br = new BufferedReader(new FileReader("diario.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el diario.");
        }
    }
}

