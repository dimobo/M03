package ejercicioM03;

import javax.swing.JOptionPane;

public class M03APP {

	public static void main(String[] args) {

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
