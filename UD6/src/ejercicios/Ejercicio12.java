package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pedimos por teclado y definimos el tama�o del array
		String max = JOptionPane.showInputDialog("Introduce tama�o de n�meros: ");
		int num[] = new int [Integer.parseInt(max)];
		
		int digito;
		
		do {
			//le definimos entre qu� numeros nos har� la magia
			max= JOptionPane.showInputDialog("Pon n�mero entre 0 y 9: ");
			digito=Integer.parseInt(max);
		}while(!(digito>=0 && digito <=9));
		
		
		//rellenamos el array
		rellenaArrayRandom(num, 1, 300);
		
		//le decimos las terminaciones
		int terminaciones[] = terminados (num, digito);
		
		//muestra las susodichas terminaciones
		muestraTerminaciones(terminaciones);
		
	}
	
	
	//rellenamos array aleatorio
	public static void rellenaArrayRandom(int numeros[], int a, int b) {
		for(int i=0; i<numeros.length;i++) {
			numeros[i]=((int)Math.floor(Math.random()*(a-b)+b));
		}
	}
	
	//muestra terminaciones
	public static void muestraTerminaciones(int numeros[]) {
		for(int i=0; i<numeros.length;i++) {
			if(numeros[i]!=0) {
				System.out.println("En la posici�n "+i+" est� el valor: "+numeros[i]);
			}
		}
	}
	
	//especifica la l�gica de ccomo se sabe el digito final de un numero recorriendo su posici�n
	public static int [] terminados(int numeroInicial[], int numeroFinal) {
		
		int terminaciones[]=new int [numeroInicial.length];
		int ultimo =0;
		for (int i=0; i<terminaciones.length; i++) {
			ultimo=numeroInicial[i]-(numeroInicial[i]/10*10);
			
		if(ultimo == numeroFinal) {
				terminaciones[i]=numeroInicial[i];
			}
		}
		return terminaciones;
	}

}
