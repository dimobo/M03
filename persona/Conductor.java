package persona;

import java.util.ArrayList;

public class Conductor extends Persona {

	// Atributos de la clase conductor.
	protected ArrayList<Licencia> licencias = new ArrayList<>();

	// Constructor por defecto de Conductor
	public Conductor() {
		super();
		licencias.add(new Licencia());
	}

	// Constructor con todos los objetos de conductor.
	public Conductor(String nom, String cognoms, String fechaNacimiento, ArrayList<Licencia> licencias) {
		super(nom, cognoms, fechaNacimiento);
		this.licencias = licencias;
	}

	// Zona de getters y setters.
	public ArrayList<Licencia> getLicencias() {
		return licencias;
	}

	public void setLicencias(ArrayList<Licencia> licencias) {
		this.licencias = licencias;
	}

}
