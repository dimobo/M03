package vehiculo;

import java.util.ArrayList;

import persona.TitularVehicle;

public class Camion extends Vehiculo {
	// Atributos de la clase camion
	private Rueda[] ejeDelantero, ejeMedio, ejeTrasero;

	// Constructor por defecto del objeto camion.
	public Camion() {
		super();
		ejeDelantero = generarRuedas("", 0.0);
		ejeMedio = generarRuedas("", 0.0);
		ejeTrasero = generarRuedas("", 0.0);
	}

	// Constructor con todos los atributos para un camion.
	public Camion(String matricula, String marca, String color, String marcaRueda1, double diametroRueda1,
			String marcaRueda2, double diametroRueda2, String marcaRueda3, double diametroRueda3) {

		super(matricula, marca, color);
		this.ejeDelantero = generarRuedas(marcaRueda1, diametroRueda1);
		this.ejeMedio = generarRuedas(marcaRueda2, diametroRueda2);
		this.ejeTrasero = generarRuedas(marcaRueda3, diametroRueda3);
	}

	// Constructor con todos los atributos para un camion y titulares.
	public Camion(String matricula, String marca, String color, String marcaRueda1, double diametroRueda1,
			String marcaRueda2, double diametroRueda2, String marcaRueda3, double diametroRueda3, String titular,
			ArrayList<TitularVehicle> conductores) {
		super(matricula, marca, color);
		this.ejeDelantero = generarRuedas(marcaRueda1, diametroRueda1);
		this.ejeMedio = generarRuedas(marcaRueda2, diametroRueda2);
		this.ejeTrasero = generarRuedas(marcaRueda3, diametroRueda3);
		this.titular = titular;
		this.conductores = conductores;
	}

	// Constructor con todos los atributos para un camion, titulares y array de
	// conductores.
	public Camion(String matricula, String marca, String color, String marcaRueda1, double diametroRueda1,
			String marcaRueda2, double diametroRueda2, String marcaRueda3, double diametroRueda3, String titular) {
		super(matricula, marca, color);
		this.ejeDelantero = generarRuedas(marcaRueda1, diametroRueda1);
		this.ejeMedio = generarRuedas(marcaRueda2, diametroRueda2);
		this.ejeTrasero = generarRuedas(marcaRueda3, diametroRueda3);
		this.titular = titular;
		this.conductores = null;
	}

	// Metodo generarRuedas sobreescrito para el objeto camion.
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
		return "\nMarca del camion: " + marca + "\nMatricula: " + matricula + "\nColor: " + color
				+ "\nEje delantero:\n1r Rueda: " + ejeDelantero[0].toString() + "\n2n Rueda: "
				+ ejeDelantero[1].toString() + "\nEje medio:\n1r Rueda: " + ejeMedio[0].toString() + "\n2n Rueda: "
				+ ejeMedio[1].toString() + "\nEje trasero:\n1r Rueda: " + ejeTrasero[0].toString() + "\n2n Rueda: "
				+ ejeTrasero[1].toString() + "\nTitular del vehiculo: " + titular + "\nConductores del vehiculo"
				+ conductores.toString() + "\n\n";
	}

	// Listado de las licencias validas para conducir un camion.
	public static ArrayList<String> licenciaVehiculo() {

		ArrayList<String> licencia = new ArrayList<>();
		licencia.add("C1");
		licencia.add("C");
		licencia.add("C1+E");
		licencia.add("C+E");

		return licencia;
	}

	// Zona de getters y setters.
	public Rueda[] getEjeDelantero() {
		return ejeDelantero;
	}

	public void setEjeDelantero(Rueda[] ejeDelantero) {
		this.ejeDelantero = ejeDelantero;
	}

	public Rueda[] getEjeMedio() {
		return ejeMedio;
	}

	public void setEjeMedio(Rueda[] ejeMedio) {
		this.ejeMedio = ejeMedio;
	}

	public Rueda[] getEjeTrasero() {
		return ejeTrasero;
	}

	public void setEjeTrasero(Rueda[] ejeTrasero) {
		this.ejeTrasero = ejeTrasero;
	}

}
