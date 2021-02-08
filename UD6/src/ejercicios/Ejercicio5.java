package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// metemos por pantalla un numero decimal
		// String Pantalla = JOptionPane.showInputDialog("Pon un numero decimal: ");
		// int convierte = Integer.parseInt(Pantalla);
		int r = 0;
		conversion(r);

	}

	public static int conversion(int n) {
		String Pantalla = JOptionPane.showInputDialog("Pon un numero decimal: ");
		int convierte = Integer.parseInt(Pantalla);
		String binario = "";
		int num;

		do {

			num = convierte % 2;
			binario += num;
			convierte = convierte / 2;

		} while (convierte != 0);
		// reversion de la cadena de binario a traves de la funcionalidad java de
		// reverse
		binario = new StringBuilder(binario).reverse().toString();
		System.out.println("Numero Binario de " + Pantalla + " es: " + binario);
		return convierte;
	}
}