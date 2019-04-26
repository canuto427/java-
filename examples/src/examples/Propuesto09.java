package examples;

import java.util.Scanner;

public class Propuesto09 {
	public static void main(String[] args) {
		// Propuesto09

		double l, a, p;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa largo: ");
		l = teclado.nextDouble();

		System.out.println("Ingresa ancho: ");
		a = teclado.nextDouble();

		p = 2 * (a + l);
		System.out.println("El perimetro del rectangulo es: " + p);
	}
}
