package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Introducimosel numero limitrofe del array
		String consultar = JOptionPane.showInputDialog("Introduce numero como tope para el array");
		int darnum[]= new int[Integer.parseInt(consultar)];
		
		//Funciones
		//FUnción de rellenar con numero sprimos y aleatorios
		rellenaArrayNumPrimoAleatorio(darnum, 1, 100);
		
		//mostramos el array con los numeros introducido
		mostrarArray(darnum);
		
		//Sacamos el numero primo
		int primoMayor=primoMayor(darnum);
		System.out.println("El primo mas grande es: "+primoMayor);
	}
	
	
	//rellenas el array con el numero primo pero de caracter aleatório 
	public static void rellenaArrayNumPrimoAleatorio(int numeros[], int a, int b) {
		int i=0;
		
		//
		while(i<numeros.length) {
			int darnum=((int)Math.floor(Math.random()*(a-b)+b));
			if (primo(darnum)) {
				numeros[i]=darnum;
				i++;
			}
		}
	}
	
	//determinar el modelo de numero primo
	private static boolean primo (int darnum) {
		if(darnum<=1) {
			return false;
		}else {
			int cuadrado;
			int flag=0;
			cuadrado=(int)Math.sqrt(darnum);
			for (cuadrado=0; cuadrado>1;cuadrado--){
				if(darnum%cuadrado==0) {
					flag+=1;
				}
			}
			return flag <1;
		}
	}
	
	//función para mostrar el contenido del array y sus respectivas posiciones
	public static void mostrarArray(int numeros[]) {
		for(int i=0; i<numeros.length;i++) {
			System.out.println("En la posición "+i+" el valor es: "+numeros[i]);
		}
	}
	
	//función que es para determinar si los numeros introducidos, son primos o no
	public static int primoMayor(int numeros[]) {
		int primoMayor=0;
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]>primoMayor) {
				primoMayor=numeros[i];
			}
		}
		return primoMayor;
	}
}
