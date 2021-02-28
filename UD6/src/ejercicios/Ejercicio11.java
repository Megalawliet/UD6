package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pedimos por pantalla el valor que har� de tama�o m�ximo del array
		String numero = JOptionPane.showInputDialog("Dame un numero m�ximo para el array");
		int tope = Integer.parseInt(numero);
		
		//Arrays creados
		int array1[]=new int [tope];
		int array2[];
		
		//Rellena con un numero random el primer array
		rellenaRandomArray1(array1, 10, 100);
		
		//asociamos el array 1  y el array 2
		array2=array1;
		
		//creamos otro array 1 con nueva direcci�n de apuntado
		array1=new int[tope];
		
		//Rellenamos con los valores anteriores
		rellenaRandomArray1(array1,10,100);
		
		int resultado[]=total(array1,array2);
		
		//mostramos por pantalla el  primer array, el seguno y el resultado de la multiplicaci�n entre ambos
		
		System.out.println("Array 1: ");
		muestraArray(array1);
				
		System.out.println("Array 2: ");
		muestraArray(array2);
		
		System.out.println("Resultado multiplicaci�n: ");
		muestraArray(resultado);
	}

	//funcion de rellenar con numero aleatorio
	public static void rellenaRandomArray1(int numeracion[], int a, int b) {
		for (int i=0; i<numeracion.length; i++) {
			numeracion[i]=((int)Math.floor(Math.random()*(a-b)+b));
		}
	}
	
	//mostramos el numero random que hemos generado
	public static void muestraArray(int numeracion[]) {
		for(int i=0; i<numeracion.length; i++) {
			System.out.println("En la posici�n: "+i+" el valor es: "+numeracion[i]);
		}
	}
	
	//creamos un total con el array multiplicado, el 1 y el 2 entre si
	public static int[] total(int array1[], int array2[]) {
		int multi[]=new int[array1.length];
		for(int i=0; i<array1.length;i++) {
			multi[i]=array1[i]*array2[i];
		}
		return multi;//devolcemos el resultado de la multiplicaci�n ya que la funci�n tiene que devolver un entero
	}
	
}
