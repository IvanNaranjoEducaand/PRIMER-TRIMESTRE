package ejercicio5a;

import java.util.Scanner;

public class Ejercicio5_3 {
	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero:");
		numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
	}
}
