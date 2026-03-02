package SobreescrituraHerencia;

public class Animal {

		//declaramos atributos
		protected String nombre;
		protected int edad;
		protected double peso;
		
		//declaramos el constructor
		public Animal (String nombre, int edad, double peso) {
			this.nombre = nombre;
			this.edad = edad;
			this.peso = peso;
		}
		//declaramos los comportamientos (metodos)
		public void hacerRuido () {
			System.out.println("El animal hace ruido");

	}

}