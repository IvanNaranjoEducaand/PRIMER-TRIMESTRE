package ejercicio1;

import java.util.Scanner;

public class Actividad_6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String caracter;
		
		System.out.println("Escriba el carácter: ");
		caracter = sc.next();
		
		if(descubrirVocales(caracter)) {
			System.out.println("El carácter es una vocal");
		} else {
			System.out.println("El carácter no es una vocal");
		}
	}
	
	public static boolean descubrirVocales(String caracter) {
		boolean tieneVocales = false;
		String vocales = "[aeiouAeiouáéíóúÁÉÍÓÚ]";
		if(caracter.contains(vocales)) {
			tieneVocales = true;
		} else {
			tieneVocales = false;
		}
		return tieneVocales;
	}
}
