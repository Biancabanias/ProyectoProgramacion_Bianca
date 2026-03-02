package UD6;

/**
 * Clase de utilidades fiscales
 * No se puede crear objetos porque solo tiene metodos estaticos.
 */
class FiscalUtils {

    public static final double IVA_GENERAL = 0.21;

    //Constructor privado → evita new FiscalUtils()
    private FiscalUtils() {}

    public static double calcularIVA(double cantidad) {
        return cantidad * IVA_GENERAL;
    }

    public static double calcularRetencion(double cantidad) {
        return cantidad * 0.15;
    }
}
