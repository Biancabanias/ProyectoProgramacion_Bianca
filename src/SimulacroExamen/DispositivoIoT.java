package SimulacroExamen;

/**
 * Clase abstracta que implementa dispositivo
 */

abstract class DispositivoIoT {
	
	//Atributos
	protected String id;
	protected double consumoBase;
	protected RedIoT red;
	
	//Atributo estático
	private static int contadorTotal = 0;
	
	//Constructor
	public DispositivoIoT(String id, RedIoT red, double consumoBase) {
		this.id = id;
		this.red = red;
		this.consumoBase = consumoBase;
		contadorTotal++;
	}

	public static int getContadorTotal() {
		return contadorTotal;
	}

	public abstract double procesarDatos();

	public void imprimirFicha() {
		System.out.println(
				"Dispositivo: " + id + " | Red: " + red.getNombreRed() + " | Consumo Base: " + consumoBase + "W");
	}
}
