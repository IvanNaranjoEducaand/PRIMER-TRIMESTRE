package ejercicio2;

import java.util.Scanner;

public class Ejercicio2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 double C;
		 
		 System.out.println("Introduzca el número de Grados(Celsius): ");
		 C = sc.nextInt();
		 
		 double F = 9*C/5+32;
		 
		 System.out.println(C+" Grados celsius equivale a: "+F+" Grados Fahrenheit.");
	}
}
