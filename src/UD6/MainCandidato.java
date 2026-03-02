package UD6;

import java.util.ArrayList;

public class MainCandidato {

	public static void main(String[] args) {

		ArrayList<Candidato> lista = new ArrayList<>();

		lista.add(new CandidatoJunior());
		lista.add(new CandidatoSenior("IA Bancaria"));

		for (Candidato c : lista) {
			if (c instanceof CandidatoSenior) {
				CandidatoSenior s = (CandidatoSenior) c; //Casting
				s.mostrarProyectoEstrella();
			}
		}
	}
}
