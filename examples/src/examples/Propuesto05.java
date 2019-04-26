package examples;

import java.util.Scanner;

public class Propuesto05 {

	public static void main(String[] args) {
		// Propuesto05

		int a, b, c, d, s;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Numero1:  ");
		a = teclado.nextInt();

		Scanner teclado1 = new Scanner(System.in);
		System.out.print("Numero2:  ");
		b = teclado.nextInt();

		Scanner teclad2 = new Scanner(System.in);
		System.out.print("Numero3:  ");
		c = teclado.nextInt();

		Scanner teclado3 = new Scanner(System.in);
		System.out.print("Numero4:  ");
		d = teclado.nextInt();

		s = a + b + c + d;

		double pa = (double) (a * 100) / (double) s;
		pa = Math.rint(pa * 1000) / 1000;

		System.out.println("Procentaje de numero 1: " + pa);

		double pb = (double) (b * 100) / (double) s;
		pb = Math.rint(pb * 1000) / 1000;

		System.out.println("Procentaje de numero 2: " + pb);

		double pc = (double) (c * 100) / (double) s;
		pc = Math.rint(pc * 1000) / 1000;

		System.out.println("Procentaje de numero 3: " + pc);

		double pd = (double) (d * 100) / (double) s;
		pd = Math.rint(pd * 1000) / 1000;

		System.out.println("Procentaje de numero 4: " + pd);

	}

}
