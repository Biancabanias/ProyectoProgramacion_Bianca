package SimulacroExamen;

public final class SensorTemperatura extends DispositivoIoT {
	
	/**
	 * Constructor SensorTemperatura
	 * @param id
	 * @param red
	 * @param consumoBase
	 */
	
	public SensorTemperatura(String id, RedIoT red, double consumoBase) {
		super(id, red, consumoBase);
	}

	@Override
	public double procesarDatos() {
		return consumoBase;
	}
}
