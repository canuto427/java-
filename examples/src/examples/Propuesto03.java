package examples;
import java.util.Scanner;
public class Propuesto03 {

	public static void main(String[] args) {
		// Propuesto03

		int metro=1000;
		int decimetro=100;
		int centimetro=10;
		
		int x,ml,c,d,mt;
		
		Scanner teclado =new Scanner (System.in);
		System.out.println("Distancia en milimetos: ");
		x=teclado.nextInt();
		
		mt=x/metro;
		x=x%metro;
		d=x/decimetro;
		x=x%decimetro;
		c=x/centimetro;
		x=x%centimetro;
		
		System.out.println("");
		System.out.println("Metros: "+mt);
		System.out.println("Decimetros: "+d);
		System.out.println("Centimetros: "+c);
		System.out.println("Milimetros: "+x);
	}

}
