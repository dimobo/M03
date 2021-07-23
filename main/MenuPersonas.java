package main;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import persona.Licencia;
import persona.Persona;
import persona.TitularVehicle;
import vehiculo.Vehiculo;

public class MenuPersonas {

	// este es el menu para cuando pasamos a gestionar personas.
	public static void menu(ArrayList<Vehiculo> vList, ArrayList<Persona> pList) {

		boolean m = false;

		// Este es el menu de personas.
		while (m == false) {
			switch ((int) pedirDouble(
					"¿Qué acción desea realizar?\n1) Añadir Titular\n2) Mostrar Titulares.\n3) Salir de personas.")) {
			// En este caso generaremos un titular.
			case 1:
				crearTitular(pList);
				
				
				break;

			// En este caso mostraremos los titulares que tenemos generados.
			case 2:
				leerArrayTitular(pList);
				break;

			// Este caso nos permite salir del menu.
			case 3:
				m = true;
				break;

			default:
				JOptionPane.showMessageDialog(null, "Valor introducido no válido.");
				break;
			}
		}
	}

	// Este metodo creara un titular a partir de los datos preguntados al usuario.
	public static ArrayList<Persona> crearTitular(ArrayList<Persona> pList) {
		// Variables necesarias para crear titulares.
		Persona p = new TitularVehicle();
		ArrayList<Licencia> lList = new ArrayList<>();
		String nombre, apellidos, fechaNacimiento, tipo, nombreLicencia, fechaCaducidad;
		int id = 1;
		boolean seguro, garaje, e = false;

		nombre = pedirTexto("Introduzca el nombre del titular.");
		apellidos = pedirTexto("Introduzca los apellidos.");
		fechaNacimiento = pedirTexto("Introduzca fecha nacimiento.");

		// Ya que como bike no necesita licencia para ser conducida introduciremos una
		// primera licencia con el valor por defecto.
		lList.add(new Licencia());

		// esto es una alerta confome estamos entrando al menu de licencias.
		JOptionPane.showMessageDialog(null, "Entrando al menu de licencias.");

		// Ahora entraremos en el menu para gestionar las licencias que tiene el
		// titular.
		while (e == false) {
			switch ((int) pedirDouble("¿Que desea hacer?\n1) Añadir licencia 2) Salir.")) {

			// En este caso estamos añadiendo una licencia a la array de licencias.
			case 1:
				tipo = pedirTexto("Tipo de licencia: ");
				nombreLicencia = pedirTexto("Nombre entero de la licencia: ");
				fechaCaducidad = pedirTexto("Fecha caducidad de la licencia: ");
				lList.add(new Licencia(id, tipo, nombreLicencia, fechaCaducidad));
				id++;
				break;

			// Este caso nos permite salir del menu de crear licencias tambien tenemos una
			// alerta confome salimos del menu de licencias.
			case 2:
				e = true;
				JOptionPane.showMessageDialog(null, "Saliendo del menu de licencias.");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Valor introducido no válido.");
				break;
			}
		}

		// Este switch establecera el boolean de seguro.
		switch ((int) pedirDouble("¿El titular tiene seguro?\n1) Si     2) No")) {
		// En este caso estamos estableciendo seguro a true.
		case 1:
			seguro = true;
			break;

		// En este caso estamos estableciendo seguro a false.
		case 2:
			seguro = false;
			break;

		// En este caso si el usuari añade un valor no valido se establecera seguro como
		// false.
		default:
			JOptionPane.showMessageDialog(null, "Valor introducido no válido, estableciendo seguro como false.");
			seguro = false;
			break;
		}

		// Este switch establecera el boolean de garaje.
		switch ((int) pedirDouble("¿El titular tiene garaje?\n1) Si     2) No")) {
		// En este caso estamos estableciendo garaje a true.
		case 1:
			garaje = true;
			break;

		// En este caso estamos estableciendo garaje a false.
		case 2:
			garaje = false;
			break;

		// En este caso si el usuari añade un valor no valido se establecera seguro como
		// false.
		default:
			JOptionPane.showMessageDialog(null, "Valor introducido no válido, estableciendo garaje como false.");
			garaje = false;
			break;
		}

		// finalmente creamos el objeto titular y lo añadimos a la array de personas.
		p = new TitularVehicle(nombre, apellidos, fechaNacimiento, lList, seguro, garaje);
		pList.add(p);
		return pList;
	}

	// Este metodo leera la array de titulares que tenemos creadas.
	public static void leerArrayTitular(ArrayList<Persona> pList) {
		System.out.println(pList.toString());
	}

	// Este método es como el de pedir número, pero le podemos introducir un double.
	public static double pedirDouble(String text) {

		double num = 0;

		while (true) {
			num = Double.parseDouble(JOptionPane.showInputDialog(text));

			if (num == 0) {
				try {
					if (num > 0.0) {
						return num;
					} else {
						JOptionPane.showMessageDialog(null, "Valor introducido no válido.");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor introducido no válido.");
				}
			} else {
				return num;
			}
		}
	}

	// Este método nos pedirá que introduzcamos un texto y si hemos introducido una
	// cadena vacía saltara un error conforme hemos introducido un valor no válido y
	// nos pedirá de nuevo un valor.
	public static String pedirTexto(String text) {

		while (true) {
			String dato = JOptionPane.showInputDialog(text);

			if (!dato.equals(null)) {
				return dato.toLowerCase();
			} else {
				JOptionPane.showMessageDialog(null, "Valor introducido no válido.");
			}
		}
	}

}
