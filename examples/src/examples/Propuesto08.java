package examples;

import java.util.Scanner;

public class Propuesto08{

	public static void main(String[] args)

	{

		Scanner valor = new Scanner(System.in);

		double f, c, k;

		System.out.print("Ingrese grados fahrenheit: ");

		f = valor.nextDouble();

		c = (f - 32) * 5 / 9;

		k = (f - 32) * 5 / 9 + 273;

		System.out.printf("Los grados cel son: %.3f \n Los grados kel son: %.3f", c, k);

		valor.close();

	}

}
