package ejercicio8a;

import java.util.Scanner;

public class Ejercicio8_5 {
	//Desarrollar un programa que solicite los valores mínimo y máximo de un rango. 
	//A continuación, solicitará por teclado un valor que debe estar dentro del rango. 
	//Si no es asi, volverá a solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango.
	
	public static void main(String[] args) {
		int valorMin;
		int valorMax;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el valor mínimo de su rango:");
		valorMin = sc.nextInt();
		
		System.out.println("Introduzca el valor máximo de su rango:");
		valorMax = sc.nextInt();
		
		System.out.println("Introduzca un valor dentro de su rango:");
		int num = sc.nextInt();
		
		while (num < valorMin || num > valorMax) {
	                System.out.println("El valor no está dentro del rango especificado. Inténtalo de nuevo.");
	                System.out.println("");
	                System.out.println("Introduzca un valor dentro de su rango:");
	        		 num = sc.nextInt();
	            
	        } 
		 System.out.println("El valor " + num + " está dentro del rango.");
	    }
	}

