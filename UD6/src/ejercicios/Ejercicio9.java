package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Introducimos el tama�o del array
		String pedir = JOptionPane.showInputDialog("Introduce tama�o del array: ");
		int numeros[] = new int[Integer.parseInt(pedir)];
		// Funciones
		// Funci�n que rellena el array con n�meros alatorios
		rellenarArrayNumerosAleatorios(numeros, 0, 9);
		// Funci�n que muestra el array
		muestraArray(numeros);
		//Funci�n que suma los valores del array
		sumaValores(numeros);
		
	}

	public static void rellenarArrayNumerosAleatorios(int numeracion[], int a, int b) {
		for (int i = 0; i < numeracion.length; i++) {
			// numeros entre los par�metros pasados
			numeracion[i] = ((int) Math.floor(Math.random() * (a - b) + b));
		}
	}

	public static void muestraArray(int numeracion[]) {
		for (int i = 0; i < numeracion.length; i++) {
			// mostramos el array llenado de valores aleatorios y con su correcta poici�n
			System.out.println("En el indice " + i + " est� el valor " + numeracion[i]);
		}
	}
	
	public static void sumaValores(int numeracion[]) {
		int suma=0;
		for (int i=0; i<numeracion.length; i++) { //cuando el numero que le metamos, sea mas grande que la posicion, pasara a sumar los valores hasta llegar al 0 que no lo va a detectar y finalizar�. 
			suma+=numeracion[i];
		}System.out.println("La suma es: "+suma);
	}
}
