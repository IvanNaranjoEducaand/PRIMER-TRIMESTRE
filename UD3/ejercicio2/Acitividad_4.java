package ejercicio2;

import java.util.Scanner;

public class Acitividad_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		int espacios = 0;
		
		System.out.println("Escriba una frase:");
		frase = sc.nextLine();
		
		for(int i = 0; i < frase.length(); i++) {
			
			if(frase.charAt(i) == ' ') {
				espacios++;
			}
		}
		System.out.println("En la frase hay un total de "+espacios+" espacios.");
		sc.close();
	}
}
