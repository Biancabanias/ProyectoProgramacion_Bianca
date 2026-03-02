package es.clm.iot.app;

import es.clm.iot.devices.Termostato;

public class MainIoT {

    public static void main(String[] args) {

        Termostato t = new Termostato("Termostato salon", 22.5);
        t.encender();
        t.setTemperatura(24);

        System.out.println(t.obtenerEstado());
    }
}
