package UD5_AI1;

/**
 * Enseña una tabla de productos con formato.
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        String[] productos = {"Pan", "Chocolate", "Almendras"};
        int[] cantidades = {12, 7, 3};
        double[] precios = {1.20, 0.95, 2.50};

        System.out.printf("%-10s %10s %10s%n", "Producto", "Cantidad", "Precio");

        for (int i = 0; i < productos.length; i++) {
            if (cantidades[i] < 5) {
                System.out.print("\u001B[31m"); //Rojo
            } else if (cantidades[i] < 10) {
                System.out.print("\u001B[33m"); //Naranja
            }

            System.out.printf("%-10s %10d %10.2f%n",
                    productos[i], cantidades[i], precios[i]);

            System.out.print("\u001B[0m"); //Reinicia el color
        }
    }
}

