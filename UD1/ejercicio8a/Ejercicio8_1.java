package ejercicio8a;

import java.util.Scanner;

public class Ejercicio8_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		System.out.println("Escriba un número entero:");
		numero = sc.nextInt();
		
		while(numero != 0) {
			
			String Par = (numero % 2 == 0) ? "El número es par" : "El número es impar";
			System.out.println(""+Par);
			
			String Positivo = (numero > 0) ? "El número es positivo" : "El número es negativo";
			System.out.println(""+Positivo);
			
			int Cuadrado = numero * numero;
			System.out.println("Cuadrado: "+Cuadrado);
			
			System.out.println("Escriba un número entero:");
			numero = sc.nextInt();
		}
	}
}

