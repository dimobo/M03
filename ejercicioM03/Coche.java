package ejercicioM03;

public class Coche extends Vehiculo {

	// Atributos de la clase coche
	protected Rueda[] ejeDelantero, ejeTrasero;

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
		return "Marca del coche: " + this.marca + "\nMatricula: " + this.matricula + "\nColor: " + this.color
				+ "\nEje delantero:\n1r Rueda: " + this.ejeDelantero[0].toString() + "\n2n Rueda: "
				+ this.ejeDelantero[1].toString() + "\nEje trasero:\n1r Rueda: " + this.ejeTrasero[0].toString()
				+ "\n2n Rueda: " + this.ejeTrasero[1].toString();
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
