package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		primacidad(a);

	}

	public static int primacidad(int n) {
		boolean primo = true;
		String datos = JOptionPane.showInputDialog("Pon un numero: ");
		int numeracion = Integer.parseInt(datos);

		for (int i = 2; i <= numeracion / 2; i++) {

			int bandera = numeracion % i;
			if (bandera == 0) {
				primo = false;
				break;
			}

		}
		System.out.println(primo);

		return numeracion;
	}

}
