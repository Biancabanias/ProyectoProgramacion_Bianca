package UD6;

/**
 * Clase abstracta Vehiculo
 * No puede instanciarse porque es un concepto general.
 */
abstract class Vehiculo {

    //Metodo obligatorio para hijos
    abstract double calcularAutonomia();
}

class FurgonetaElectrica extends Vehiculo {

    private double capacidadBateria;

    public FurgonetaElectrica(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    @Override
    double calcularAutonomia() {
        return capacidadBateria * 0.8;
    }
}

class BicicletaCargo extends Vehiculo {

    @Override
    double calcularAutonomia() {
        return 40;
    }
}
