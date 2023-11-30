package ejercicio5a;

import java.util.Scanner;

public class Ejercicio5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero:");
		int numero = sc.nextInt();
		
		if(numero>0) {
			System.out.println("El número es positivo");
		} else {
			System.out.println("El número no es positivo");
		}
	}

}
