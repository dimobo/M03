package vehiculo;

public class Rueda {

	// Atributos para el objeto rueda.
	private String marca;
	private double diametro;

	// Constructor por defecto.
	public Rueda() {
		marca = "";
		diametro = 0.0;
	}

	// Metodo toString sobreescrito para ruedas.
	@Override
	public String toString() {
		return "Marca de la rueda: " + this.marca + ", Diametro de la rueda: " + this.diametro;
	}

	// Contructor con los parametros
	public Rueda(String marca, double diametro) {
		this.marca = marca;
		this.diametro = diametro;
	}

	// Zona de getters y setters.
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

}
