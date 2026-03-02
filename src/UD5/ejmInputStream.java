package UD5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ejmInputStream {

    public static void main(String[] args) {

        try (InputStream in = new FileInputStream("imagen.jpg");
             OutputStream out = new FileOutputStream("copia_imagen.jpg")) {

            byte[] buffer = new byte[1024];
            int bytesLeidos;

            while ((bytesLeidos = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesLeidos);
            }

            System.out.println("Imagen copiada correctamente");

        } catch (IOException e) {
            System.out.println("Error al copiar la imagen");
            e.printStackTrace();
        }
    }
}

