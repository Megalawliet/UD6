package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Introducimos el tamaño del array
		String pedir = JOptionPane.showInputDialog("Introduce tamaño del array: ");
		int numeros[] = new int[Integer.parseInt(pedir)];
		// Funciones
		// Función que rellena el array con números alatorios
		rellenarArrayNumerosAleatorios(numeros, 0, 9);
		// Función que muestra el array
		muestraArray(numeros);
		//Función que suma los valores del array
		sumaValores(numeros);
		
	}

	public static void rellenarArrayNumerosAleatorios(int numeracion[], int a, int b) {
		for (int i = 0; i < numeracion.length; i++) {
			// numeros entre los parámetros pasados
			numeracion[i] = ((int) Math.floor(Math.random() * (a - b) + b));
		}
	}

	public static void muestraArray(int numeracion[]) {
		for (int i = 0; i < numeracion.length; i++) {
			// mostramos el array llenado de valores aleatorios y con su correcta poición
			System.out.println("En el indice " + i + " está el valor " + numeracion[i]);
		}
	}
	
	public static void sumaValores(int numeracion[]) {
		int suma=0;
		for (int i=0; i<numeracion.length; i++) { //cuando el numero que le metamos, sea mas grande que la posicion, pasara a sumar los valores hasta llegar al 0 que no lo va a detectar y finalizará. 
			suma+=numeracion[i];
		}System.out.println("La suma es: "+suma);
	}
}
