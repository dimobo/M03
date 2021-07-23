package persona;

public class Persona {

	protected String nom, cognoms, fechaNacimiento;

	// Constructor por defecto.
	public Persona() {
		nom = "";
		cognoms = "";
		fechaNacimiento = "";
	}

	// Constructor con todos los atributos.
	public Persona(String nom, String cognoms, String fechaNacimiento) {
		this.nom = nom;
		this.cognoms = cognoms;
		this.fechaNacimiento = fechaNacimiento;
	}

	// Zona de getters y setters.
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognoms() {
		return cognoms;
	}

	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
