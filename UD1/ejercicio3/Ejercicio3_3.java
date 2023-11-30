package ejercicio3;

import java.util.Scanner;

public class Ejercicio3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numero1;
		double numero2;
		
		System.out.println("Escriba el número que quiera dividir: ");
		numero1 = sc.nextDouble();
		
		System.out.println("Escriba el número por el que será dividido: ");
		numero2 = sc.nextDouble();
		
		double numero3 = numero1 / numero2;
		double numero4 = numero1 % numero2;
		System.out.println("La division da como resultado cociente: "+numero3+" y resto " +numero4);
	}

}
