package ejercicio4;

import java.util.Scanner;

public class Ejercicio4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1;
		
		System.out.println("Añada un número (Decimal)");
		num1 = sc.nextDouble();
		
		long entero = Math.round(num1);
		System.out.println("Su número se aproxima a: "+entero);
	}

}
