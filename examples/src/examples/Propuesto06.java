package examples;

import java.util.Scanner;

public class Propuesto06 {

	public static void main(String[] args) {
		// Propuesto04

		int l, p;
		double a;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite el lado del cuadrado");
		l = teclado.nextInt();
		p = l * 4;
		a = Math.pow(l, 2);
		System.out.println("El perimetro del cuadrado es: " + p + " y su area es:" + a);
	}
}
