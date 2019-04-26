package examples;

import java.util.Scanner;

public class Propuesto10 {

	public static void main(String[] args) {
		// Propuesto10

		double c,s;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese los grados sexagesimales que desea convertir: : ");
		s = teclado.nextDouble();
		
		c=(200*s)/180;
		
		System.out.println("");
		System.out.println(c);
	}

}
