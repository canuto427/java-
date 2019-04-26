package examples;

import java.util.Scanner;
public class Propuesto02 {

	public static void main(String[] args) {
		// Propuesto02

		int a,b,ni;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba un numero: ");
		a = teclado.nextInt();

		System.out.println("Escriba un numero: ");
		b = teclado.nextInt();

		ni=a-b;
		
		System.out.println("");
		System.out.println("Numeros incluidos entre los numeros dados: "+ni);
	}

}
