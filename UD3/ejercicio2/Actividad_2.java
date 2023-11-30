package ejercicio2;

import java.util.Scanner;

public class Actividad_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String fin = "fin";
		String palabra;
		StringBuilder fraseCompleta = new StringBuilder();
		boolean condicion = true;
		
		System.out.println("Escriba las palabras para formar una frase. Si coloca 'fin', la frase acabará: ");
		do {
			palabra = sc.next();
			if(palabra.equalsIgnoreCase(fin)) {
				condicion = false;
			}
			
			fraseCompleta.append(palabra).append(" ");
		} while(condicion == true);
		
		String fraseFinal = fraseCompleta.substring(0, fraseCompleta.length()-4);
		System.out.println("La frase completa es: "+fraseFinal);
		
		sc.close();
	}
}
