package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio2_1_aleatorio_correcto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 0;
		int s = 0;
		int t = 0;
		variabilidad(r, s, t);

	}

	public static int variabilidad(int a, int b, int c) {
		// String MAX = JOptionPane.showInputDialog("")
		String REP = JOptionPane.showInputDialog("Pon un nº: ");
		String MAX = JOptionPane.showInputDialog("Pon un nº alto: ");
		String MIN = JOptionPane.showInputDialog("Pon un nº bajo: ");

		int num = Integer.parseInt(MAX);
		int num2 = Integer.parseInt(MIN);
		int re = Integer.parseInt(REP);

		for (int i = 0; i < re; i++) {
			// int resultado = (int)(Math.random(num2-num)*i+1);
			int ran = (int) (Math.random() * ((num2 - num) + 1)) + num;
			// System.out.println(i+1);
			System.out.println(ran);
		}
		return re;
	}
}