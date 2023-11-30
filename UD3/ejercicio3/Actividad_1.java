package ejercicio3;

import java.util.Scanner;

public class Actividad_1 {
	/*Diseñar un programa que solicite al usuario 5 números decimales. 
	*A continuación, debe mostrar los números en el mismo orden en que se han introducido.*/
	public static void main(String[] args) {
		
		float[] decimal = new float[5];
		float numIntroducido;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < decimal.length; i++) { // Bucle que guarda los números
			System.out.println("Escriba un número decimal:");
			numIntroducido = sc.nextFloat();
			decimal[i] = numIntroducido;
		}
		
		for(int i=0; i < decimal.length; i++) { //Bucle que escribe los números
			System.out.println("El dato de la posición "+i+" es igual a: "+decimal[i]);
		}
	}
}
