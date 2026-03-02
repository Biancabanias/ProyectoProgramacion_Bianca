package SobreescrituraHerencia;

public class Gato extends Animal {

	private int vidasRestantes = 7;

	public Gato(String nombre, int edad, double peso, int vidasRestantes) {
		super(nombre, vidasRestantes, peso);
		this.vidasRestantes = vidasRestantes;

	}
	@Override
	public void hacerRuido() {
		
		// ejecutamos la funcionalidad
		super.hacerRuido();

		// Extendemos la clase hija
		System.out.println("MIAU");
	}
}
