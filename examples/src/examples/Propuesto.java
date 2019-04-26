package examples;

import java.util.Scanner;

public class Propuesto {

	public static void main(String[] args) {
		// Propuesto01

		int a, b, s, r;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba un numero: ");
		a = teclado.nextInt();

		System.out.println("Escriba un numero: ");
		b = teclado.nextInt();

		s = a + b;
		r = a - b;
		
		System.out.println(" ");
		System.out.println("Suma: "+s);
		System.out.println(" ");
		System.out.println("Resta: "+r);

	}

}
