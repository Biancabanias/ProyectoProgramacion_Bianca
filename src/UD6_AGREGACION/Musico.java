package UD6_AGREGACION;

import java.util.ArrayList;
import java.util.List;

public class Musico {

    private String nombre;
    private List<Instrumento> instrumentos;

    public Musico(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void agregarInstrumento(Instrumento instrumento) {
        instrumentos.add(instrumento);
    }
}





