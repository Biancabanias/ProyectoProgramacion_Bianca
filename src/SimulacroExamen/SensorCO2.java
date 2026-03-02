package SimulacroExamen;


final class SensorCO2 extends DispositivoIoT implements Conectable {
	private double plusCalibracion = 5.0;

	public SensorCO2(String id, RedIoT red, double consumoBase) {
		super(id, red, consumoBase);
	}

	@Override
	public double procesarDatos() {
		return consumoBase + plusCalibracion;
	}

	@Override
	public double conectarCloud(double latencia) {
		return consumoBase * latencia;
	}
}

