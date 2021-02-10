package ejercicios;
import javax.swing.JOptionPane;
public class Ejercicio8 {

	public static void main(String[] args) {
		//array de 10 posicions
		int numeros[] = new int[10];
		rellenar(numeros);
		mostrar(numeros);
	}

	public static void rellenar(int lista[]) {
			for(int i=0;i<lista.length;i++) {
				lista[i] = Integer.parseInt(JOptionPane.showInputDialog("Introducir valores de relleno: "));//lista
		}
	}
	public static void mostrar (int posiciones[]){
		for(int i=0;i<posiciones.length;i++) {
			System.out.println("En la posición : ["+i+"] el array guarda el numero: "+posiciones[i]);
		}
	}
}
