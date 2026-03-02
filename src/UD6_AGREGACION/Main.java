package UD6_AGREGACION;

public class Main {

    public static void main(String[] args) {

        Musico musico1 = new Musico("John");

        Instrumento guitarra = new Instrumento("Guitarra", 3230.14);
        Instrumento piano = new Instrumento("Piano", 32000.00);

        musico1.agregarInstrumento(guitarra);
        musico1.agregarInstrumento(piano);

        musico1 = null;

        System.out.println(piano.toString());
    }
}

