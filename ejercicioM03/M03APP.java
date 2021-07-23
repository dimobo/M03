package ejercicioM03;

import javax.swing.JOptionPane;

public class M03APP {

	public static void main(String[] args) {

		Vehiculo v = new Coche("algo", "si", "no", "potse", 0.6, "pot no", 0.9);

		System.out.println(v.toString());

	}

	// Este m�todo nos pedir� que introduzcamos un texto y si hemos introducido una
	// cadena vac�a saltara un error conforme hemos introducido un valor no v�lido y
	// nos pedir� de nuevo un valor.
	public static String pedirTexto(String text) {

		while (true) {
			String dato = JOptionPane.showInputDialog(text);

			if (!dato.equals(null)) {
				return dato.toLowerCase();
			} else {
				JOptionPane.showMessageDialog(null, "Valor introducido no v�lido.");
			}
		}
	}

}
