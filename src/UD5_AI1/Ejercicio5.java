package UD5_AI1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Hace un inventario en XML.
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        try (PrintWriter pw = new PrintWriter("inventario.xml")) {

            pw.println("<inventario>");
            pw.println("  <producto>");
            pw.println("    <nombre>Tortilla</nombre>");
            pw.println("    <stock>10</stock>");
            pw.println("  </producto>");
            pw.println("</inventario>");

        } catch (FileNotFoundException e) {
            System.out.println("Error creando el XML.");
        }
    }
}

