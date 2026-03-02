package UD6;

class Espacio {

    protected double precioHora;

    public Espacio(double precioHora) {
        this.precioHora = precioHora;
    }
}

class SalaReuniones extends Espacio {

    private int capacidad;

    public SalaReuniones(double precioHora, int capacidad) {
        super(precioHora);
        this.capacidad = capacidad;
    }

    public double calcularCoste(int horas) {

        double coste = precioHora * horas;

        //Acceso directo porque es protected
        if (capacidad > 10) {
            coste *= 1.15; //Recargo limpieza
        }

        return coste;
    }
}
