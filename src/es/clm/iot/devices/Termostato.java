package es.clm.iot.devices;

import es.clm.iot.api.Dispositivo;

public class Termostato extends Dispositivo {

    private double temperatura;

    public Termostato(String nombre, double temperaturaInicial) {
        super(nombre);
        this.temperatura = temperaturaInicial;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String obtenerEstado() {
        return nombre + " -> " + (encendido ? "ENCENDIDO" : "APAGADO")
                + " | Temp: " + temperatura + "ºC";
    }
}
