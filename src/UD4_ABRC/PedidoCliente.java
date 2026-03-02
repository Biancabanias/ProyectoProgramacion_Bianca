package UD4_ABRC;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Representa un pedido realizado por un cliente.
 * <p>
 * Un pedido contiene varias líneas de productos,
 * una dirección de entrega, un estado y un método de pago.
 * </p>
 */
public class PedidoCliente {

    /** Identificador del pedido */
    private int idPedido;

    /** Fecha en la que se realizó el pedido */
    private Date fechaPedido;

    /** Importe total del pedido */
    private double total;

    /** Estado del pedido (CREADO, PAGADO, ENVIADO, etc.) */
    private String estado;

    /** Método de pago del pedido */
    private String metodoPago;

    /** Lista de líneas del pedido */
    private List<LineaPedido> lineas;

    /** Dirección de entrega del pedido */
    private DireccionEntrega direccionEntrega;

    /**
     * Constructor del pedido del cliente.
     *
     * @param idPedido identificador del pedido
     * @param fechaPedido fecha del pedido
     * @param estado estado inicial del pedido
     * @param metodoPago método de pago
     * @param direccionEntrega dirección de entrega
     */
    public PedidoCliente(int idPedido, Date fechaPedido,
                          String estado, String metodoPago,
                          DireccionEntrega direccionEntrega) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.estado = estado;
        this.metodoPago = metodoPago;
        this.direccionEntrega = direccionEntrega;
        this.lineas = new ArrayList<>();
        this.total = 0.0;
    }

    /**
     * Añade una línea al pedido.
     * <p>
     * Al añadirla, se recalcula automáticamente el total.
     * </p>
     *
     * @param linea línea de pedido a añadir
     */
    public void agregarLinea(LineaPedido linea) {
        lineas.add(linea);
        calcularTotal();
    }

    /**
     * Calcula el total del pedido.
     *
     * @return total del pedido
     */
    public double calcularTotal() {
        double suma = 0.0;
        for (LineaPedido lp : lineas) {
            suma += lp.calcularSubtotal();
        }
        total = suma;
        return total;
    }

    /**
     * Cambia el estado del pedido.
     *
     * @param nuevoEstado nuevo estado del pedido
     */
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado.toUpperCase();
    }

    /**
     * Procesa el pago del pedido.
     * <p>
     * Solo se puede pagar si el pedido tiene líneas.
     * </p>
     *
     * @return true si el pago se realiza correctamente, false si no
     */
    public boolean procesarPago() {
        if (lineas.isEmpty()) {
			return false;
		}
        cambiarEstado("PAGADO");
        return true;
    }

    /**
     * Devuelve la lista de líneas del pedido.
     *
     * @return copia de la lista de líneas
     */
    public List<LineaPedido> getLineas() {
        return new ArrayList<>(lineas);
    }

    /**
     * Devuelve el estado actual del pedido.
     *
     * @return estado del pedido
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Devuelve toda la información del pedido en formato texto.
     *
     * @return descripción completa del pedido
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido #").append(idPedido)
          .append(" | Fecha: ").append(fechaPedido)
          .append(" | Estado: ").append(estado)
          .append(" | Pago: ").append(metodoPago).append("\n");
        sb.append("Direccion: ").append(direccionEntrega).append("\n");
        sb.append("Lineas:\n");
        for (LineaPedido lp : lineas) {
            sb.append(" - ").append(lp).append("\n");
        }
        sb.append("TOTAL: ").append(calcularTotal());
        return sb.toString();
    }
}


