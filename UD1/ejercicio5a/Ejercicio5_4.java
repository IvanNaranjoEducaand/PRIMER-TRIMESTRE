package ejercicio5a;

import java.util.Scanner;

public class Ejercicio5_4 {
	public static void main(String[] args) {
		int numero;
		int numero2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero:");
		numero = sc.nextInt();
		
		System.out.println("Introduzca otro número entero:");
		numero2 = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("El primer número es par");
		} else {
			System.out.println("El primer número es impar");
		}
		if(numero2 % 2 == 0) {
			System.out.println("El segundo número es par");
		} else {
			System.out.println("El segundo número es impar");
		}
	}
}

