package COMPOSICION;

public class Main {

    public static void main(String[] args) {

        // Crear una banda y agregar músicos directamente
        Banda banda1 = new Banda("The Beatles");
        banda1.agregarMusico("John", 25);
        banda1.agregarMusico("Paul", 28);
        banda1.agregarMusico("George", 27);

        // Imprimir información de la banda y sus músicos
        System.out.println("Banda: " + banda1.getNombre());
        System.out.println("Músicos:");

        for (Musico musico : banda1.getMusicos()) {
            System.out.println("- " + musico.getNombre() + ", " + musico.getEdad() + " años");
        }
    }
}


