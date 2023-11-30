package ejercicio2;

import java.util.Scanner;

public class Actividad_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String frase;
		
		System.out.println("Escriba una frase:");
		frase = sc.nextLine();
		
		int posCentral = (frase.length() / 2);
		
		if(frase.charAt(posCentral) == ' ') {
			System.out.println("El carácter es un espacio.");
		} else {
			System.out.println("El carácter no es un espacio.");
		}

		sc.close();
	}
}
