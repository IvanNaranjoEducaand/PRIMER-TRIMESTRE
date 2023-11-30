package ejercicio2;

import java.util.Scanner;

public class Actividad_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String palabra1;
		String palabra2;
		
		System.out.println("Escriba la 1º palabra:");
		palabra1 = sc.next();
		
		System.out.println("Escriba la 2º palabra:");
		palabra2 = sc.next();
		
		if(palabra1.length() > palabra2.length()) {
			System.out.println("La palabra "+palabra1+" es más larga que "+palabra2);
		} else if (palabra1.length() < palabra2.length()) {
			System.out.println("La palabra "+palabra2+" es más larga que "+palabra1);
		} else if (palabra1.length() == palabra2.length()) {
			System.out.println("Las palabras son de la misma longitud.");
		}
		
		sc.close();
	}
}
