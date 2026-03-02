package UD6;

/**
 * Clase padre Suscripcion
 * Se supone que es una suscripcion basica de un cliente
 */
class Suscripcion {

    private String nombreCliente;
    private String email;
    private double precioBase;

    //Constructor
    public Suscripcion(String nombreCliente, String email, double precioBase) {
        this.nombreCliente = nombreCliente;
        this.email = email;
        this.precioBase = precioBase;
    }

    //Metodo que calcula el precio final (sobrescribira)
    public double calcularPrecio() {
        return precioBase;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }
}

/**
 * Suscripción Premium → añade 20€
 */
class SuscripcionPremium extends Suscripcion {

    public SuscripcionPremium(String nombreCliente, String email, double precioBase) {
        super(nombreCliente, email, precioBase); //llamamos al constructor padre
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio() + 20;
    }
}

/**
 * Suscripción Business → suma 5€ por usuario
 */
class SuscripcionBusiness extends Suscripcion {

    private int numeroUsuarios;

    public SuscripcionBusiness(String nombreCliente, String email,
                               double precioBase, int numeroUsuarios) {
        super(nombreCliente, email, precioBase);
        this.numeroUsuarios = numeroUsuarios;
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio() + (numeroUsuarios * 5);
    }
}
