package main;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import persona.Persona;
import vehiculo.Vehiculo;

public class M03APP {

	public static void main(String[] args) {
		ArrayList<Vehiculo> vList = new ArrayList<>();
		ArrayList<Persona> pList = new ArrayList<>();

		boolean m = false;

		// Este es el menu de personas.
		while (m == false) {
			switch ((int) pedirDouble(
					"¿Qué acción desea realizar?\n1) Menu Titulares.\n2) Menu vehiculos.\n3) Salir del programa.")) {
			// En este caso entramos al menu de personas.
			case 1:
				MenuPersonas.menu(vList, pList);
				break;

			// En este caso entramos al menu de vehiculos.
			case 2:
				MenuVehiculos.menu(vList, pList);
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
}
