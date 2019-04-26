package examples;

import java.util.Scanner;

public class Propuesto07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int minuto = 60;
		int segundo = 3600;

		int t, h, m, s;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Tiempo en horas: ");
		t = teclado.nextInt();

		h = t;
		t = t % minuto;
		m = t * minuto;
		s = t * segundo;

		System.out.println("");
		System.out.println("Horas: " + h);
		System.out.println("Minutos: " + m);
		System.out.println("Segundos: " + s);

	}

}
