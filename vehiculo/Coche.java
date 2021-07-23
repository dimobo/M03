package vehiculo;

import java.util.ArrayList;

import persona.TitularVehicle;

public class Coche extends Vehiculo {

	// Atributos de la clase coche
	private Rueda[] ejeDelantero, ejeTrasero;

	// Constructor por defecto del objeto coche.
	public Coche() {
		super();
		ejeDelantero = generarRuedas("", 0.0);
		ejeTrasero = generarRuedas("", 0.0);
	}

	// Constructor con todos los atributos para un coche.
	public Coche(String matricula, String marca, String color, String marcaRueda1, double diametroRueda1,
			String marcaRueda2, double diametroRueda2) {

		super(matricula, marca, color);
		this.ejeDelantero = generarRuedas(marcaRueda1, diametroRueda1);
		this.ejeTrasero = generarRuedas(marcaRueda2, diametroRueda2);
	}
	
	// Constructor con todos los atributos para un coche y titulares.
		public Coche(String matricula, String marca, String color, String marcaRueda1, double diametroRueda1,
				String marcaRueda2, double diametroRueda2, TitularVehicle titular) {
			super(matricula, marca, color);
			this.ejeDelantero = generarRuedas(marcaRueda1, diametroRueda1);
			this.ejeTrasero = generarRuedas(marcaRueda2, diametroRueda2);
			this.titular = titular;
			this.conductores = null;
		}

	// Constructor con todos los atributos para un coche, titulares y array de titulares.
	public Coche(String matricula, String marca, String color, String marcaRueda1, double diametroRueda1,
			String marcaRueda2, double diametroRueda2, TitularVehicle titular, ArrayList<TitularVehicle> conductores) {
		super(matricula, marca, color);
		this.ejeDelantero = generarRuedas(marcaRueda1, diametroRueda1);
		this.ejeTrasero = generarRuedas(marcaRueda2, diametroRueda2);
		this.titular = titular;
		this.conductores = conductores;
	}

	// Metodo generarRuedas sobreescrito para el objeto coche.
	@Override
	protected Rueda[] generarRuedas(String marca, double diametro) {
		Rueda[] eje = new Rueda[2];
		eje[0] = new Rueda(marca, diametro);
		eje[1] = new Rueda(marca, diametro);
		return eje;
	}

	// Metodo toString sobreescrito para vehiculos.
	@Override
	public String toString() {
		return "\nMarca del coche: " + marca + "\nMatricula: " + matricula + "\nColor: " + color
				+ "\nEje delantero:\n1r Rueda: " + ejeDelantero[0].toString() + "\n2n Rueda: "
				+ ejeDelantero[1].toString() + "\nEje trasero:\n1r Rueda: " + ejeTrasero[0].toString() + "\n2n Rueda: "
				+ ejeTrasero[1].toString() + "\nTitular del vehiculo: " + titular + "\nConductores del vehiculo"
				+ conductores.toString() + "\n\n";
	}

	// Listado de las licencias validas para conducir un coche.
	public static ArrayList<String> licenciaVehiculo() {

		ArrayList<String> licencia = new ArrayList<>();
		licencia.add("B");
		licencia.add("B + E");

		return licencia;
	}

	// Zona de getters y setters.
	public Rueda[] getEjeDelantero() {
		return ejeDelantero;
	}

	public void setEjeDelantero(Rueda[] ejeDelantero) {
		this.ejeDelantero = ejeDelantero;
	}

	public Rueda[] getEjeTrasero() {
		return ejeTrasero;
	}

	public void setEjeTrasero(Rueda[] ejeTrasero) {
		this.ejeTrasero = ejeTrasero;
	}

}
