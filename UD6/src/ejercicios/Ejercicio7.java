package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e = 0;
		divisas(e);
	}

	public static void divisas(double a) {
		// por pantalla se pide un valor de moneda:
		String dialogo = JOptionPane.showInputDialog("Quantos euros quieres convertir?\n Pon un nº: \n");
		double li = Double.parseDouble(dialogo);
		double er = 0.87;
		double dollar = 1.28611;
		double Yen = 129.852;
		double libra = li * er;
		double dolar = li * dollar;
		double yen = li * Yen;
		System.out.println("La conversion de " + li + " euro/s es de: " + libra + " libras");
		System.out.println("La conversion de " + li + " euro/s es de: " + dolar + " dólares");
		System.out.println("La conversion de " + li + " euro/s es de: " + yen + " Yenes");

	}

}
