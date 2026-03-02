package UD5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AgenteSecreto {
/**
*
* @param args
*/
    public static void main(String[] args) {

        // Texto original
        String mensaje = "Este es un mensaje secreto";

        // Clave para el cifrado
        String clave = "CLAVE";

        // Ciframos el mensaje
        String mensajeCifrado = cifrarVigenereSimplificado(mensaje, clave);

        // Mostramos por pantalla
        System.out.println("Mensaje original: " + mensaje);
        System.out.println("Mensaje cifrado: " + mensajeCifrado);

        // Guardamos en un fichero
        guardarEnFichero("mensaje_secreto.txt", mensajeCifrado);
    }

    /**
     * Cifrado Vigenère simplificado:
     * - Solo cifra letras (A-Z / a-z).
     * - Mantiene espacios y signos tal cual.
     * - La clave se repite, usando solo letras de la clave.
     */
    public static String cifrarVigenereSimplificado(String texto, String clave) {
        if (texto == null) {
			return "";
		}
        if (clave == null) {
			clave = "";
		}

        // Nos quedamos solo con letras de la clave
        String claveLetras = clave.replaceAll("[^a-zA-Z]", "");
        if (claveLetras.isEmpty()) {
            return texto;
        }

        StringBuilder resultado = new StringBuilder();
        int j = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isLetter(c)) {
                char k = claveLetras.charAt(j % claveLetras.length());
                int shift = Character.toUpperCase(k) - 'A';

                if (Character.isUpperCase(c)) {
                    char nuevo = (char) ('A' + (c - 'A' + shift) % 26);
                    resultado.append(nuevo);
                } else {
                    char nuevo = (char) ('a' + (c - 'a' + shift) % 26);
                    resultado.append(nuevo);
                }

                j++;
            } else {
                resultado.append(c);
            }
        }

        return resultado.toString();
    }

    /**
     * Guarda el texto en un archivo usando BufferedWriter.
     */
    public static void guardarEnFichero(String nombreArchivo, String contenido) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            bw.write(contenido);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}
