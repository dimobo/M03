package vehiculo;

import java.util.ArrayList;
import persona.TitularVehicle;

public abstract class Vehiculo {

	// Atributos del ovjeto vehiculo
	protected String matricula, marca, color;
	protected TitularVehicle titular;
	protected ArrayList<TitularVehicle> conductores;

	// Constructor por defecto del objeto vehiculo.
	public Vehiculo() {
		matricula = "";
		marca = "";
		color = "";
		titular = null;
		conductores = null;
	}

	// Constructor con todos los atributos para los objetos vehiculo.
	public Vehiculo(String matricula, String marca, String color) {
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
		titular = null;
		conductores = null;

	}

	// Metodo encargado de a?adirle los ejes a los vehiculos.
	protected abstract Rueda[] generarRuedas(String marca, double diametro);

	// Zona de getters y setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
