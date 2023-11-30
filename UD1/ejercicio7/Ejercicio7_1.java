package ejercicio7;

import java.util.Scanner;

public class Ejercicio7_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int cambio1;
		int cambio2;
		System.out.println("Introduzca un número entero:");
		a = sc.nextInt();
		System.out.println("Introduzca otro número entero:");
		b = sc.nextInt();
		
		cambio1 = a;
		cambio2 = b;
		
		a = cambio2;
		b = cambio1;
		
		System.out.println("1º Variable: "+a);
		System.out.println("2º Variable: "+b);
		
	}

}
