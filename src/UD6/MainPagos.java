package UD6;

public class MainPagos {

    public static void main(String[] args) {

        //Crear procesador
        ProcesadorPagos procesador = new ProcesadorPagos();

        //Transacción nacional
        Transaccion t1 = new Transaccion("T001", 100);

        //Transacción internacional en USD (5%)
        Transaccion t2 = new TransaccionInternacional("T002", 100, "USD");

        //Transacción internacional otra divisa (10%)
        Transaccion t3 = new TransaccionInternacional("T003", 100, "EUR");

        //Polimorfismo → mismo método, distinto comportamiento
        procesador.finalizar(t1);
        procesador.finalizar(t2);
        procesador.finalizar(t3);
    }
}