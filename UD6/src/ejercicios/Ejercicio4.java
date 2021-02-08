package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 0;
		factorial(r);
	}

	public static int factorial(int n) {

		// demanem una cadena per pantalla
		String n1 = JOptionPane.showInputDialog("Inserta un numero: ");
		int control = 1;
		// convertim la cadena a enter
		int num = Integer.parseInt(n1);
		for (int i = 1; i <= num; i++) {
			control = control * i;
		}
		System.out.println("El factorial de " + (num) + " es: " + control);
		return control;
	}
}
