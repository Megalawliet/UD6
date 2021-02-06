package ejercicios;

import java.util.Random;

//import java.util.Random;
//import java.util.stream.IntStream;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random aleatorio = new Random();
		Random aleatorio2 = new Random(); 
		String arreu1 = JOptionPane.showInputDialog("Dime un primer numero aleatorio: ");
		int numrandom = Integer.parseInt(arreu1);
		aleatorio.setSeed(numrandom);
		String arreu2 = JOptionPane.showInputDialog("Dime un segundo numero aleatorio");
		int numrandom2 = Integer.parseInt(arreu2);
		aleatorio2.setSeed(numrandom2);
		int num = (int)(Math. random()*(numrandom2-numrandom))+numrandom;
		JOptionPane.showMessageDialog(null,"Primer número: \n" +numrandom+"\n"+"Segundo número: \n"+numrandom2+"\n Numero aleatorio: \n"+num);
		
		//int calculo = Math.random() * (numrandom+1);
		/*int calculo = (int) (Math.random()*numrandom);*/
		//JOptionPane.showMessageDialog(null, aleatorio);
		/*JOptionPane.showMessageDialog(null, calculo);*/
		//Random random = new Random();
		//IntStream = random.ints(numrandom);
	}

}
