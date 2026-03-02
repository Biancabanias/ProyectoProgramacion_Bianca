package OculracionEncapsulacionComposicion;

public class Motor {
	private String tipo;
	private int cilindraje;
	private int potencia;

	public Motor(String tipo, int cilindraje, int potencia) {
		this.tipo = tipo;
		this.cilindraje = cilindraje;
		this.potencia = potencia;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Motor{" + "tipo='" + tipo + '\'' + ", cilindraje=" + cilindraje + ", potencia=" + potencia + '}';
	}
}

