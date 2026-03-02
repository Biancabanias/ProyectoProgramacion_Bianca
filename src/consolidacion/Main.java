package consolidacion;

public class Main {

	public static void main(String[] args) {
		Coche coche1 = new Coche("Toyota", "Corolla", 5);
		coche1.conducir();
		System.out.println("Marca: " + coche1.getMarca());
		System.out.println("Modelo: " + coche1.getModelo());
		System.out.println("Número de puertas: " + coche1.getNumeroPuertas());
		coche1.abrirMaletero();
	}

}
