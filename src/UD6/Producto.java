package UD6;

class Producto {

    private final String sku; //No puede cambiar

    public Producto(String codigo) {

        //Llamamos al metodo estatico
        if (validarFormato(codigo)) {
            this.sku = codigo;
        } else {
            System.out.println("SKU incorrecto. Asignando valor por defecto.");
            this.sku = "ALM-0000";
        }
    }

    /**
     * Metodo estatico para validar el SKU
     */
    public static boolean validarFormato(String codigo) {

        //Debe empezar por ALM- y tener 8 caracteres
        return codigo != null &&
               codigo.length() == 8 &&
               codigo.startsWith("ALM-");
    }

    public String getSku() {
        return sku;
    }
}
