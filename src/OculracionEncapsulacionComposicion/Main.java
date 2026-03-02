package OculracionEncapsulacionComposicion;

public class Main {

	public static void main(String[] args) {
		 Coche cochecillo = new Coche("Seat", " Leon", 2014, "Gasolina", 1400, 116);
		 System.out.println(cochecillo);
		 
		 //Obtengo la referencia del año de matriculacion
		 int AnyoMatriculacion = cochecillo.getAnyoMatriculacion();
		 Motor motorcillo = cochecillo.getMotor();
		 
		 //Haciendo purebas voz a modificar datos
		 AnyoMatriculacion = 2020; 
			motorcillo.setTipo("Electrico");
		 
		 //Vuelvo a imprimir los valores "originales" del coche
		 System.out.print(cochecillo);
		 
		 /*
		 Motor motor = coche.getMotor();
		 System.out.println(motor);
		 motor.setTipo("Diesel");
		 System.out.println(coche);
		 */
		 }
}