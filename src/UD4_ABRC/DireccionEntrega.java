package UD4_ABRC;

/**
 * Representa la dirección de entrega de un pedido.
 * <p>
 * Guarda los datos básicos de la dirección y permite
 * validar el código postal y mostrar una ubicación aproximada.
 * </p>
 */
public class DireccionEntrega {

    /** Calle y número de la dirección */
    private String calle;

    /** Ciudad de entrega */
    private String ciudad;

    /** Código postal (5 dígitos) */
    private String codigoPostal;

    /** Nombre de la persona que recibe el pedido */
    private String nombreReceptor;

    /** Información adicional (portal, piso, etc.) */
    private String referenciaAdicional;

    /**
     * Constructor de la dirección de entrega.
     *
     * @param calle calle y número
     * @param ciudad ciudad de entrega
     * @param codigoPostal código postal
     * @param nombreReceptor nombre del receptor
     * @param referenciaAdicional información adicional
     */
    public DireccionEntrega(String calle, String ciudad, String codigoPostal,
                            String nombreReceptor, String referenciaAdicional) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.nombreReceptor = nombreReceptor;
        this.referenciaAdicional = referenciaAdicional;
    }

    /**
     * Valida el código postal.
     *
     * @return true si el código postal tiene 5 números, false si no
     */
    public boolean validarCP() {
        return codigoPostal != null && codigoPostal.matches("\\d{5}");
    }

    /**
     * Devuelve una ubicación aproximada de la dirección.
     *
     * @return texto con ciudad y código postal
     */
    public String geolocalizar() {
        return "Ubicacion aproximada: " + ciudad + " (" + codigoPostal + ")";
    }

    /**
     * Devuelve la dirección en formato texto.
     *
     * @return dirección completa formateada
     */
    @Override
    public String toString() {
        return calle + ", " + ciudad + " " + codigoPostal +
               " | Receptor: " + nombreReceptor +
               (referenciaAdicional != null && !referenciaAdicional.isBlank()
               ? " (" + referenciaAdicional + ")" : "");
    }
}


//Ajustes finales y correcion de detalles
