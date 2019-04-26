package examples;

import java.util.Scanner;

public class Propuesto04 {

	public static void main(String[] args) {
		// Propuesto04

		int a = 6, b = 8;
		double c, d, factor1;

		c = (4 * Math.pow(a, 4) + 1 * a * b + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2));
		factor1 = 3 * (Math.pow(c, 2)) + a + b;
		d = factor1 / 4;
		System.out.println("El valor de c es: " + c + " y el valor de d es; " + d);
	}

}
