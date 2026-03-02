package UD5_AI1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Gestión de inventario en JSON.
 */
public class Ejercicio4 {

    public static void main(String[] args) throws IOException {

        ArrayList<Producto> lista = new ArrayList<>();
        lista.add(new Producto("Piña", 10));
        lista.add(new Producto("Melon", 5));

        Gson gson = new Gson();

        // Guardar
        try (FileWriter fw = new FileWriter("inventario.json")) {
            gson.toJson(lista, fw);
        }

        // Leer
        try (FileReader fr = new FileReader("inventario.json")) {
            ArrayList<Producto> leidos = gson.fromJson(
                    fr, new TypeToken<ArrayList<Producto>>(){}.getType());

            for (Producto p : leidos) {
                System.out.println(p.nombre + " - " + p.stock);
            }
        }
    }
}

