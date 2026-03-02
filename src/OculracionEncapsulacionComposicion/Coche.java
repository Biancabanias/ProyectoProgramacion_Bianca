package OculracionEncapsulacionComposicion;

public class Coche {
	 private String marca;
	 private String modelo;
	 private int anio;
	 private Motor motor;
	 
	 
	 public Coche(String marca, String modelo, int anio, String tipoMotor,
			 int cilindrada, int cv) {
	 this.marca = marca;
	 this.modelo = modelo;
	 this.anio = anio;
	 motor = new Motor("Gasolina", 2000, 200);
	 }
	 public Motor getMotor() { 
		 return motor; }
	 public int getAnyoMatriculacion() {
		 return anio;
	 }
	 
	 @Override
	 public String toString() {
	 return "Coche{" +  "marca='" + marca + '\'' + ", modelo='" + modelo + '\'' + ", anio=" + anio + ", motor=" + motor + '}';
	 }
	}

