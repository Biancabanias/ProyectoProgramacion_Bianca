package UD6;

public class MainProducto {

    public static void main(String[] args) {

        //SKU correcto
        Producto p1 = new Producto("ALM-1234");
        System.out.println("SKU p1: " + p1.getSku());

        //SKU incorrecto
        Producto p2 = new Producto("ABC-12");
        System.out.println("SKU p2: " + p2.getSku());
    }
}
