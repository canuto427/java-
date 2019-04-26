package examples;

import java.util.Scanner;
public class Ejerrcicio10 {

	public static void main(String[] args) {
		// Ejercicio10

		int hora = 3600;
		int minuto = 60;
		
		int t,h,m,s;
		
		Scanner teclado =new Scanner (System.in);
		System.out.println("Tiempo en segundos: ");
		t=teclado.nextInt();
		
		h=t/hora;
		t=t%hora;
		m=t/minuto;
		s=t%minuto;
				
		System.out.println("");
		System.out.println("Horas: "+h);
		System.out.println("Minutos: "+m);
		System.out.println("Segundos: "+s);
	}

}
