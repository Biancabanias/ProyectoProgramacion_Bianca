package UD4_ABRC;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * Aplicación principal de BookHeaven.
 * <p>
 * Esta clase muestra un menú por consola para:
 * añadir libros al pedido, aplicar descuentos, ver el pedido,
 * procesar el pago y cambiar el estado.
 * </p>
 */
public class BookHeaven {

    /**
     * Método principal del programa.
     * <p>
     * Crea una dirección de entrega y un pedido inicial.
     * Después entra en un bucle con un menú hasta que el usuario elige salir.
     * </p>
     *
     * @param args argumentos de entrada (no se usan en este programa)
     */
    public static void main(String[] args) {

        // Scanner: leer datos por consola
        Scanner sc = new Scanner(System.in);
        // Random: generar SKU y número de pedido
        Random rnd = new Random();

        // Dirección de entrega del pedido
        DireccionEntrega direccion = new DireccionEntrega(
                "Calle Mayor 10",
                "Madrid",
                "28013",
                "Laura Olah",
                "3A"
        );

        // Pedido inicial con ID aleatorio, fecha actual, estado y método de pago
        PedidoCliente pedido = new PedidoCliente(
                1000 + rnd.nextInt(9000),
                new Date(),
                "CREADO",
                "TARJETA",
                direccion
        );

        // Control del menú
        boolean salir = false;

        // Bucle principal del menú
        while (!salir) {
            System.out.println("\n=== BOOKHEAVEN ===");
            System.out.println("1. Anadir libro");
            System.out.println("2. Aplicar descuento");
            System.out.println("3. Ver pedido");
            System.out.println("4. Procesar pago");
            System.out.println("5. Cambiar estado");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // limpiar salto de línea

            switch (opcion) {

                case 1:
                    // Añadir un libro (línea de pedido)
                    System.out.print("Titulo del libro: ");
                    String titulo = sc.nextLine();

                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();

                    System.out.print("Precio unitario: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    String sku = "SKU-" + (10000 + rnd.nextInt(90000));
                    LineaPedido lp = new LineaPedido(titulo, cantidad, precio, sku);
                    pedido.agregarLinea(lp);

                    System.out.println("Libro anadido.");
                    break;

                case 2:
                    // Aplicar descuento a una línea concreta
                    if (pedido.getLineas().isEmpty()) {
                        System.out.println("No hay lineas.");
                        break;
                    }

                    System.out.print("Linea (1-" + pedido.getLineas().size() + "): ");
                    int idx = sc.nextInt() - 1;

                    System.out.print("Descuento (%): ");
                    double desc = sc.nextDouble();
                    sc.nextLine();

                    pedido.getLineas().get(idx).aplicarDescuento(desc);
                    pedido.calcularTotal();

                    System.out.println("Descuento aplicado.");
                    break;

                case 3:
                    // Mostrar el pedido completo
                    System.out.println(pedido);
                    break;

                case 4:
                    // Procesar el pago del pedido
                    System.out.println(
                            pedido.procesarPago()
                            ? "Pago realizado. Estado: " + pedido.getEstado()
                            : "No se pudo procesar el pago."
                    );
                    break;

                case 5:
                    // Cambiar estado del pedido (por ejemplo: ENVIADO, CANCELADO...)
                    System.out.print("Nuevo estado: ");
                    String estado = sc.nextLine();
                    pedido.cambiarEstado(estado);
                    System.out.println("Estado actualizado.");
                    break;

                case 6:
                    // Salir del programa
                    salir = true;
                    break;

                default:
                    // Opción incorrecta
                    System.out.println("Opcion no valida.");
            }
        }

        sc.close();
        System.out.println("Fin de BookHeaven.");
    }
}

