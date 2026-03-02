package UD6;

public class MainS {

	public static void main(String[] args) {

	        //Array polimorfico
	        Suscripcion[] lista = {
	                new Suscripcion("Luisa", "luisa@email.com", 30),
	                new SuscripcionPremium("Pepe", "pepe@email.com", 30),
	                new SuscripcionBusiness("Enrrique", "enrrique@email.com", 30, 4)
	        };

	        //For-each
	        for (Suscripcion s : lista) {
	            System.out.println("Cliente: " + s.getNombreCliente()
	                    + " Precio final: " + s.calcularPrecio());
	        }
	}
}
