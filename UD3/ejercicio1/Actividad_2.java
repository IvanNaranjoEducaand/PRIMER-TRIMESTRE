package ejercicio1;

import java.util.Scanner;

public class Actividad_2 {
	
	public static void serieNumerica(int a, int b) {
		for(int i = a; i <= b;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Escriba el primer número entero:");
		num1 = sc.nextInt();
		
		System.out.println("Escriba el segundo número entero:");
		num2 = sc.nextInt();
		
		serieNumerica(num1, num2);
	}
}
