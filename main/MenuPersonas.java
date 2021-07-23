package main;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import persona.Persona;
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
				crearTitular();
				break;

			// En este caso mostraremos los titulares que tenemos generados.
			case 2:

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
	
	private static void crearTitular() {
		String nombre, apellidos, fechaNacimiento, tipo, nombreLicencia, fechaCaducidad;
		int id;
		boolean seguro, garaje;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	// Este método es como el de pedir número, pero le podemos introducir un double.
	private static double pedirDouble(String text) {

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
	private static String pedirTexto(String text) {

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
