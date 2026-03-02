package UD6;

import java.util.ArrayList;

class Candidato { }

class CandidatoJunior extends Candidato { }

class CandidatoSenior extends Candidato {

    private String proyectoEstrella;

    public CandidatoSenior(String proyecto) {
        this.proyectoEstrella = proyecto;
    }

    public void mostrarProyectoEstrella() {
        System.out.println("Proyecto: " + proyectoEstrella);
    }
}

