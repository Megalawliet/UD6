package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		cifras(a);

	}

	public static int cifras(int n) {
		// demanes per pantalla valors en forma de cadena
		String dar = JOptionPane.showInputDialog("Pon una serie de numeros");
		// crees una variable que et faigue el conteig per la funcio length a través del
		// numero
		// de caracters que li passes per pantalla
		int contar = dar.length();
		// fas que segons els caracters donats, anira recorrent les posicions i sumant 1
		// fins que s'acabe la cadena
		for (int i = 0; i <= contar; i++) {

		}
		System.out.println("EL numero de cifras es: " + contar);
		return contar;
	}

}