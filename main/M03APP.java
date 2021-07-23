package main;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import vehiculo.Bike;
import vehiculo.Camion;
import vehiculo.Coche;
import vehiculo.Vehiculo;

public class M03APP {

	public static void main(String[] args) {
		ArrayList<Vehiculo> vList = new ArrayList<>();
		boolean m = false;

		// Este es el menu principal.
		while (m == false) {
			switch ((int) pedirDouble(
					"¿Qué acción desea realizar?\n1) Añadir vehiculo\n2) Mostrar vehiculos.\n3) Salir.")) {
			// En este caso generaremos un vehiculo.
			case 1:
				generarVehiculo(vList);
				break;

			// En este caso mostraremos los vehiculos que tenemos generados.
			case 2:
				leerArrayVehiculo(vList);
				break;

			// Este caso nos permite salir del programa.
			case 3:
				m = true;
				break;

			default:
				JOptionPane.showMessageDialog(null, "Valor introducido no válido.");
				break;
			}

		}

	}

	// Este metodo es el encarregado de generar los vehiculos que quiera el usuario.
	public static ArrayList<Vehiculo> generarVehiculo(ArrayList<Vehiculo> vList) {
		Vehiculo v = new Bike();
		String marca, matricula, color, marcaRueda1, marcaRueda2, marcaRueda3;
		double diametroRueda1, diametroRueda2, diametroRueda3;

		// Preguntaremos al usuario que tipo de vehiculo desea añadir.
		switch ((int) pedirDouble("¿Que vehiculo desea crear?\n 1) Coche  2) Bike 3) Camion")) {
		// Este caso se ejecutara cuando el usuario quiera añadir un coche.
		case 1:
			marca = pedirTexto("Introduzca la marca del coche.");
			matricula = comprobarMatricula(pedirTexto("Introduzca la matricula."));
			color = pedirTexto("Introduzca el color del coche.");
			marcaRueda1 = pedirTexto("Introduzca la marca para las ruedas del 1r eje.");
			diametroRueda1 = comprobarDiametro(pedirDouble("Introduzca el diametro de las ruedas del 1r eje."));
			marcaRueda2 = pedirTexto("Introduzca la marca para las ruedas del 2n eje.");
			diametroRueda2 = comprobarDiametro(pedirDouble("Introduzca el diametro de las ruedas del 2n eje."));
			v = new Coche(matricula, marca, color, marcaRueda1, diametroRueda1, marcaRueda2, diametroRueda2);
			vList.add(v);
			break;

		// Este caso se ejecutara cuando el usuario quiera añadir una bike.
		case 2:
			marca = pedirTexto("Introduzca la marca de la bike.");
			matricula = comprobarMatricula(pedirTexto("Introduzca la matricula."));
			color = pedirTexto("Introduzca el color de la bike.");
			marcaRueda1 = pedirTexto("Introduzca la marca para la rueda del 1r eje.");
			diametroRueda1 = comprobarDiametro(pedirDouble("Introduzca el diametro de la rueda del 1r eje."));
			marcaRueda2 = pedirTexto("Introduzca la marca para la rueda del 2n eje.");
			diametroRueda2 = comprobarDiametro(pedirDouble("Introduzca el diametro de la rueda del 2n eje."));
			v = new Bike(matricula, marca, color, marcaRueda1, diametroRueda1, marcaRueda2, diametroRueda2);
			vList.add(v);
			break;
			
		// Este caso se ejecutara al añadir un camion.
		case 3:
			marca = pedirTexto("Introduzca la marca del camion.");
			matricula = comprobarMatricula(pedirTexto("Introduzca la matricula."));
			color = pedirTexto("Introduzca el color del camion.");
			marcaRueda1 = pedirTexto("Introduzca la marca para las ruedas del 1r eje.");
			diametroRueda1 = comprobarDiametro(pedirDouble("Introduzca el diametro de las ruedas del 1r eje."));
			marcaRueda2 = pedirTexto("Introduzca la marca para las ruedas del 2n eje.");
			diametroRueda2 = comprobarDiametro(pedirDouble("Introduzca el diametro de las ruedas del 2n eje."));
			marcaRueda3 = pedirTexto("Introduzca la marca para las ruedas del 3r eje.");
			diametroRueda3 = comprobarDiametro(pedirDouble("Introduzca el diametro de las ruedas del 3r eje."));
			v = new Camion(matricula, marca, color, marcaRueda1, diametroRueda1, marcaRueda2, diametroRueda2,
					marcaRueda3, diametroRueda3);
			vList.add(v);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Valor introducido no válido.");
			break;
		}

		return vList;
	}

	// Este metodo leera nuestra array de vehiculos.
	public static void leerArrayVehiculo(ArrayList<Vehiculo> vList) {

			System.out.println(vList.toString());

	}

	// Este metodo comprobara que se introduzca una matricula posible.
	public static String comprobarMatricula(String matricula) {

		while (true) {
			if (matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{2}$")
					|| matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
				return matricula;
			} else {
				matricula = pedirTexto("Introduzca la matricula.");
			}
		}
	}

	// Este metodo comprobara que hemos introducido un diametro dentro del rango
	// aceptado.
	public static double comprobarDiametro(double diametro) {

		while (true) {
			if (diametro >= 0.4 && diametro <= 4.0) {
				break;
			} else {
				diametro = pedirDouble("Introduzca el diametro de las ruedas.\nValores válidos de 0.4 a 4");
			}
		}

		return diametro;

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
