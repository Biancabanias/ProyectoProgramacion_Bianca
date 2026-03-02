package consolidacion;

public class Vehiculo {
	private String marca;
	private String modelo;

	public Vehiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public void conducir() {
		System.out.println("Conduciendo el vehículo: " + this.toString());
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	@Override
	public String toString() {
		return "Vehiculo{" + "marca='" + marca + '\'' + ", modelo='" + modelo + '\'' + '}';
	}
}

