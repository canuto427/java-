package examples;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Ejercicio09

		float pi = 3.1419f;
		float a, r;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Radio");
		r = teclado.nextFloat();

		a = (float) (pi * (Math.pow((double) r, 2.0)));

		System.out.println(" ");
		System.out.println("Area: " + a);
	}

}
