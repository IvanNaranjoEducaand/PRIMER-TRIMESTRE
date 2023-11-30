package ejercicio3;

import java.util.Scanner;

public class Ejercicio3_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte numero1;
		byte numero2;
		
		System.out.println("Escriba el 1º Byte: ");
		numero1 = sc.nextByte();
		
		
		System.out.println("Escriba el 2º Byte: ");
		numero2 = sc.nextByte();
		
		int numero3 = numero1 + numero2; 
		System.out.println("La suma de los bytes es: " + numero3);

	}

}
