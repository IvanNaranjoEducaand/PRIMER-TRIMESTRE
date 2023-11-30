package ejercicio8a;

import java.util.Scanner;

public class Ejercicio8_4 {
	public static void main(String[] args) {
		int num;
		int num2 = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero cualquiera:");
		num = sc.nextInt();
		
		while(num2<=num) {
			System.out.println(num2);
			num2++;
		}
	}
}
