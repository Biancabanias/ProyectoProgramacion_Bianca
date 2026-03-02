package SimulacroExamen;

/**
 * Clase encargada de implementar el sensor de humedad.
 * @author bianca
 */

final class SensorHumedad extends DispositivoIoT {
	private double ajustePrecision;

	public SensorHumedad(String id, RedIoT red, double consumoBase, double ajuste) {
		super(id, red, consumoBase);
		this.ajustePrecision = ajuste;
	}

	@Override
	public double procesarDatos() {
		return consumoBase + ajustePrecision;
	}
}
