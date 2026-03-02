package consolidacion;

public class Coche extends Vehiculo {
	private int numeroPuertas;

	public Coche(String marca, String modelo, int numeroPuertas) {
		super(marca, modelo);
		this.numeroPuertas = getNumeroPuertas();
	}

	public void abrirMaletero() {
		System.out.println("Abriendo el maletero del coche");
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	@Override
	public String toString() {
		return "Coche{" + "numeroPuertas=" + this.getNumeroPuertas() + '}';
	}
}
