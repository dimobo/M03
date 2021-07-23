package persona;

public class Licencia {

	private int id;
	private String tipo, nombreCompleto, fechaCaducidad;

	// Constructor por defecto licencia.
	public Licencia() {
		id = 0;
		tipo = "";
		nombreCompleto = "";
		fechaCaducidad = "";
	}

	// Constructor con todos los atributos para licencia.
	public Licencia(int id, String licencia, String nombreCompleto, String fechaCaducidad) {
		this.id = id;
		this.tipo = licencia;
		this.nombreCompleto = nombreCompleto;
		this.fechaCaducidad = fechaCaducidad;
	}

	// Zona de getters y setters.
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLicencia() {
		return tipo;
	}

	public void setLicencia(String licencia) {
		this.tipo = licencia;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

}
