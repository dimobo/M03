package vehiculo;

import java.util.ArrayList;
import persona.TitularVehicle;

public class Bike extends Vehiculo {

	// Atributos para las Bikes
	private Rueda[] delantera, trasera;

	// Constructor por defecto.
	public Bike() {
		super();
		delantera = generarRuedas("", 0.0);
		trasera = generarRuedas("", 0.0);
	}

	// Constructor con todos los atributos de Bike.
	public Bike(String matricula, String marca, String color, String marcaRueda1, double diametroRueda1,
			String marcaRueda2, double diametroRueda2) {
		super(matricula, marca, color);
		this.delantera = generarRuedas(marcaRueda1, diametroRueda1);
		this.trasera = generarRuedas(marcaRueda2, diametroRueda2);
	}

	// Constructor con todos los atributos de Bike y titulares

	public Bike(String matricula, String marca, String color, String marcaRueda1, double diametroRueda1,
			String marcaRueda2, double diametroRueda2, TitularVehicle titular) {
		super(matricula, marca, color);
		this.delantera = generarRuedas(marcaRueda1, diametroRueda1);
		this.trasera = generarRuedas(marcaRueda2, diametroRueda2);
		this.titular = titular;
		this.conductores = null;
	}

	// Constructor con todos los atributos de Bike , titulares y array de
	// conductores.
	public Bike(String matricula, String marca, String color, String marcaRueda1, double diametroRueda1,
			String marcaRueda2, double diametroRueda2, TitularVehicle titular, ArrayList<TitularVehicle> conductores) {
		super(matricula, marca, color);
		this.delantera = generarRuedas(marcaRueda1, diametroRueda1);
		this.trasera = generarRuedas(marcaRueda2, diametroRueda2);
		this.titular = titular;
		this.conductores = conductores;

	}

	// Sobreescritura del metodo para generar ruedas heredado de vehiculo y
	// preparado para bike
	@Override
	protected Rueda[] generarRuedas(String marca, double diametro) {
		Rueda[] eje = new Rueda[1];
		eje[0] = new Rueda(marca, diametro);
		return eje;
	}

	// Listado de las licencias validas para conducir una bike.
	public static ArrayList<String> licenciaVehiculo() {

		ArrayList<String> licencia = new ArrayList<>();
		licencia.add("");

		return licencia;
	}

	// Sobreescritura del metodo toString.
	@Override
	public String toString() {

		return "\nMarca de la bike: " + marca + "\nMatricula: " + matricula + "\nColor: " + color
				+ "\nRuedas:\nDelantera: " + delantera[0].toString() + "\nTrasera: " + trasera[0].toString()
				+ "\nTitular del vehiculo: " + titular + "\nConductores del vehiculo" + conductores.toString() + "\n\n";
	}

	// Getters y setters.
	public Rueda[] getDelantera() {
		return delantera;
	}

	public void setDelantera(Rueda[] delantera) {
		this.delantera = delantera;
	}

	public Rueda[] getTrasera() {
		return trasera;
	}

	public void setTrasera(Rueda[] trasera) {
		this.trasera = trasera;
	}

}
