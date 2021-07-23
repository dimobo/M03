package persona;

public class MiExcepcion extends Exception {

	// Atributo de la clase MiExcepcion.
	private int codigoException;

	// Constructor con todos los atributos.
	public MiExcepcion(int codigoError) {
		super();
		this.codigoException = codigoError;
	}

	// Constructor por defaut.
	public MiExcepcion() {
		super();
	}

	// Metodo para mostrar el mensaje de la excepcion.
	@Override
	public String getMessage() {
		String mensaje = "";

		switch (codigoException) {
		case 404:
			mensaje = "Exception 404: Licencia valida no encontrada.";
			break;
		case 500:
			mensaje = "Exception 500: Error interno de la app.";
			break;
		}

		return mensaje;

	};
}
