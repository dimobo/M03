package vehiculo;

public class Bike extends Vehiculo {

	// Atributos para las Bikes
	Rueda[] delantera, trasera;

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

	// Sobreescritura del metodo para generar ruedas heredado de vehiculo y
	// preparado para bike
	@Override
	protected Rueda[] generarRuedas(String marca, double diametro) {
		Rueda[] eje = new Rueda[1];
		eje[0] = new Rueda(marca, diametro);
		return eje;
	}

	// Sobreescritura del metodo toString.
	@Override
	public String toString() {

		return "\nMarca de la bike: " + marca + "\nMatricula: " + matricula + "\nColor: " + color
				+ "\nRuedas:\nDelantera: " + delantera[0].toString() + "\nTrasera: " + trasera[0].toString() + "\n\n";
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
