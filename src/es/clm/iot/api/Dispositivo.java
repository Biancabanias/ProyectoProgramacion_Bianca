package es.clm.iot.api;

public class Dispositivo {

    protected String nombre;
    protected boolean encendido;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
        this.encendido = false;
    }

    public void encender() { encendido = true; }
    public void apagar() { encendido = false; }

    public String obtenerEstado() {
        return nombre + " -> " + (encendido ? "ENCENDIDO" : "APAGADO");
    }
}
