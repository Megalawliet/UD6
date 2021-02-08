package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String datos = JOptionPane.showInputDialog("Pon un numero: ");
		int a=0;
		primacidad(a);
		
		//System.out.println();
		
	}
	public static int primacidad(int n) {
		//boolean comprova;
		boolean primo=true;
		String datos = JOptionPane.showInputDialog("Pon un numero: ");
		int numeracion = Integer.parseInt(datos);
		
		//int calculo=numeracion/numeracion;
		//int num= numeracion%2;
		
		for (int i=2;i<=numeracion/2;i++) {
			
			int bandera=numeracion%i;
            if (bandera==0)
            {
                primo=false;
                break;
            }
			
		}
		System.out.println(primo);
				
		return numeracion;
	}

}
