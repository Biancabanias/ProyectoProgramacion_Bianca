package UD6;

class Transaccion {

    protected String idTransaccion;
    protected double importe;

    public Transaccion(String id, double importe) {
        this.idTransaccion = id;
        this.importe = importe;
    }

    public void ejecutarPago() {
        System.out.println("Pago nacional hecho: " + importe);
    }
}

class TransaccionInternacional extends Transaccion {

    private String divisa;

    public TransaccionInternacional(String id, double importe, String divisa) {
        super(id, importe);
        this.divisa = divisa;
    }

    @Override
    public void ejecutarPago() {

        double tasa;

        if ("USD".equals(divisa)) {
            tasa = 0.05;
        } else {
            tasa = 0.10;
        }

        double total = importe + (importe * tasa);

        System.out.println("Pago internacional (" + divisa + ") total: " + total);
    }
}

/**
 * Clase que demuestra polimorfismo
 */
class ProcesadorPagos {

    public void finalizar(Transaccion t) {
        t.ejecutarPago(); // polimorfismo
    }
}
