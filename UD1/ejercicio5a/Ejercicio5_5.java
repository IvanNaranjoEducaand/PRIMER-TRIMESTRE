package ejercicio5a;

import java.util.Scanner;

public class Ejercicio5_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num1;
		long num2;
		long num3;
		
		System.out.println("Introduzca un número entero:");
		num1 = sc.nextLong();
		System.out.println("Introduzca otro entero:");
		num2 = sc.nextLong();
		System.out.println("Introduzca otro número entero más:");
		num3 = sc.nextLong();
		
		if(num1>num2 && num1>num3) {
			System.out.println("El mayor es "+num1); // número 1
		} else if (num2>num1 && num2>num3) {
			System.out.println("El mayor es "+num2); // número 2
		} else if(num3>num2 && num3>num1) {
			System.out.println("El mayor es "+num3); // número 3
		} else if(num1==num3 && num1> num2) {
			System.out.println("El mayor es "+num1); // números 1 y 3 iguales
		} else if(num1==num2 && num1> num3) {
			System.out.println("El mayor es "+num1);// números 1 y 2 iguales
		} else if(num3==num2 && num3> num1) {
			System.out.println("El mayor es "+num3); // números 2 y 3 iguales
		} else {
			System.out.println("Todos los numeros son iguales.");
		}
	}
}
