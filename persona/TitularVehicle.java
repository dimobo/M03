package persona;

import java.util.ArrayList;

public class TitularVehicle extends Conductor {

	// Atributos del titular.
	private boolean seguro, garaje;

	// Constructor de Titular por defecto.
	public TitularVehicle() {
		super();
		seguro = false;
		garaje = false;

	}

	// Constructor de titular con todos los atributos.
	public TitularVehicle(String nom, String cognoms, String fechaNacimiento, ArrayList<Licencia> licencias,
			boolean seguro, boolean garaje) {
		super(nom, cognoms, fechaNacimiento, licencias);
		this.seguro=seguro;
		this.garaje=garaje;
	}

	// Zona de getters y setters.
	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}

	public boolean isGaraje() {
		return garaje;
	}

	public void setGaraje(boolean garaje) {
		this.garaje = garaje;
	}

}
