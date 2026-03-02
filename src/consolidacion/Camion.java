package consolidacion;

public class Camion {

		private int numeroPuertas;

		public Camion(String marca, String modelo, int numeroPuertas) {
			super();
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
