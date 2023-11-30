package ejercicio8a;

import java.util.Scanner;

public class Ejercicio8_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int factorial = 1;
		
		System.out.println("Introduzca un número entero cualquiera:");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
        }
		
		System.out.println(factorial);
	}
}
