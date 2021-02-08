package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pedir = JOptionPane.showInputDialog("Qué área quieres saber?\n 1.Circulo\n 2.Triangulo\n 3.Cuadrado\n 4.Salir\n");
		@SuppressWarnings("unused")
		boolean salir = false;
		switch (pedir) {
		case "1":
			double cansina1 = 0;
			Circulo(cansina1);
			break;
			
		case "2":
			double cansina2 = 0;
			double cansina3 = 0;
			Triangulo(cansina2, cansina3);
			break;
		
		case "3":
			double cansina4 = 0;
			Cuadrado(cansina4);
			break;
		case "4":
			salir = true;
			break;
		default:
			JOptionPane.showMessageDialog(null, "ERROR!! SOLO HAY 4 OPCIONES.");
		}		
	}
	
	public static double Circulo(double n) {
		String radio = JOptionPane.showInputDialog("Dime un radio: ");
		double r = Double.parseDouble(radio);
		double a= Math.PI*Math.pow(r, 2);
		JOptionPane.showMessageDialog(null, "El area es: " + a);
		return a;
	}
	
	public static double Triangulo(double nn, double nm) {
		String base = JOptionPane.showInputDialog("Dime una base: ");
		double b2 = Double.parseDouble(base);
		String altura = JOptionPane.showInputDialog("Dime una altura: ");
		double alt2 = Double.parseDouble(altura); 
		double triangulo = b2*alt2/2;
		JOptionPane.showMessageDialog(null, "El area es: " +triangulo);
		return triangulo;
	}
	
	public static double Cuadrado(double lateral) {
		String cuad = JOptionPane.showInputDialog("Dime un lado");
		double lado = Double.parseDouble(cuad);
		double area = (lado*lado);
		JOptionPane.showMessageDialog(null, "El area es: " +area);
		return area;
	}
}
