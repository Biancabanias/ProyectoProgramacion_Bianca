package UD4_ABRC;

/**
 * Representa una línea de un pedido.
 * <p>
 * Cada línea corresponde a un producto con su cantidad,
 * precio unitario, código SKU y descuento aplicado.
 * </p>
 */
public class LineaPedido {

    /** Nombre del producto */
    private String nombreProducto;

    /** Cantidad comprada */
    private int cantidad;

    /** Precio por unidad */
    private double precioUnitario;

    /** Código identificador del producto */
    private String codigoSKU;

    /** Descuento aplicado en porcentaje */
    private double descuentoAplicado;

    /**
     * Constructor de la línea de pedido.
     *
     * @param nombreProducto nombre del producto
     * @param cantidad cantidad comprada
     * @param precioUnitario precio por unidad
     * @param codigoSKU código identificador del producto
     */
    public LineaPedido(String nombreProducto, int cantidad,
                       double precioUnitario, String codigoSKU) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.codigoSKU = codigoSKU;
        this.descuentoAplicado = 0.0;
    }

    /**
     * Calcula el subtotal de la línea.
     * <p>
     * Se calcula multiplicando cantidad por precio unitario
     * y restando el descuento aplicado.
     * </p>
     *
     * @return subtotal final de la línea
     */
    public double calcularSubtotal() {
        double bruto = cantidad * precioUnitario;
        double descuento = bruto * (descuentoAplicado / 100);
        return bruto - descuento;
    }

    /**
     * Aplica un descuento a la línea.
     *
     * @param porcentaje descuento a aplicar (0 a 100)
     * @throws IllegalArgumentException si el porcentaje no es válido
     */
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            throw new IllegalArgumentException("Descuento invalido");
        }
        this.descuentoAplicado = porcentaje;
    }

    /**
     * Devuelve la información de la línea en formato texto.
     *
     * @return descripción completa de la línea de pedido
     */
    @Override
    public String toString() {
        return nombreProducto + " x" + cantidad +
               " | Precio: " + precioUnitario +
               " | SKU: " + codigoSKU +
               " | Descuento: " + descuentoAplicado + "%" +
               " | Subtotal: " + calcularSubtotal();
    }
}

