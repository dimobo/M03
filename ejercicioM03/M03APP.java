package ejercicioM03;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class M03APP {

	public static void main(String[] args) {
		ArrayList<Vehiculo> vList = new ArrayList<>();

		generarVehiculo(vList);
		leerArrayVehiculo(vList);

	}

	// Este metodo es el encarregado de generar los vehiculos que quiera el usuario.
	public static ArrayList<Vehiculo> generarVehiculo(ArrayList<Vehiculo> vList) {
		Vehiculo v = new Bike();

		// Ahora estamos preguntando los atributos genericos de los vehiculos.
		String marca = pedirTexto("Introduzca la marca del vehiculo.");
		String matricula = comprobarMatricula(pedirTexto("Introduzca la matricula."));
		String color = pedirTexto("Introduzca el color del vehiculo.");

		// Preguntaremos al usuario que tipo de vehiculo desea añadir.
		switch ((int) pedirDouble("¿Que vehiculo desea crear?\n 1) Coche  2) Bike")) {
		// Este caso se ejecutara cuando el usuario quiera añadir un coche.
		case 1:
			String marcaRueda1 = pedirTexto("Introduzca la marca para las ruedas del 1r eje.");
			double diametroRueda1 = comprobarDiametro(pedirDouble("Introduzca el diametro de las ruedas del 1r eje."));
			String marcaRueda2 = pedirTexto("Introduzca la marca para las ruedas del 2n eje.");
			double diametroRueda2 = comprobarDiametro(pedirDouble("Introduzca el diametro de las ruedas del 2n eje."));
			v = new Coche(matricula, marca, color, marcaRueda1, diametroRueda1, marcaRueda2, diametroRueda2);
			break;

		// Este caso se ejecutara cuando el usuario quiera añadir una bike.
		case 2:
			System.out.println("TODO");
//			v = new Bike();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Valor introducido no válido.");
			break;
		}

		vList.add(v);
		return vList;
	}

	// Este metodo leera nuestra array de vehiculos.
	public static void leerArrayVehiculo(ArrayList<Vehiculo> vList) {

		for (int i = 0; i < vList.size(); i++) {
			System.out.println("Vehiculo " + (i + 1) + ": " + vList.toString());
		}

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
			if (diametro > 0.4 && diametro < 4.0) {
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
