package ejercicios;

import java.util.Random;

//import java.util.Random;
//import java.util.stream.IntStream;

import javax.swing.JOptionPane;

public class Ejercicio2 {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		murision(n1, n2, n3);
	}

	public static void murision(int a, int b, int c) {
		// TODO Auto-generated method stub
		Random aleatorio = new Random();
		Random aleatorio2 = new Random();
		String arreu1 = JOptionPane.showInputDialog("Dime un primer numero aleatorio: ");
		int numrandom = Integer.parseInt(arreu1);
		aleatorio.setSeed(numrandom);
		String arreu2 = JOptionPane.showInputDialog("Dime un segundo numero aleatorio");
		int numrandom2 = Integer.parseInt(arreu2);
		aleatorio2.setSeed(numrandom2);
		int num = (int) (Math.random() * (numrandom2 - numrandom)) + numrandom;
		JOptionPane.showMessageDialog(null, "Primer número: \n" + numrandom + "\n" + "Segundo número: \n" + numrandom2
				+ "\n Numero aleatorio: \n" + num);
		
	}
}
