package ejercicio1;

import java.util.Scanner;

public class Actividad_1 {
	public static void eco(int n) {
		for(int i = 1; i <= n;i++) {
			System.out.println("Eco...");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numIntroducido;
		
		System.out.println("Escriba un número entero culaquiera:");
		numIntroducido = sc.nextInt();
		
		eco(numIntroducido);
	}
}
