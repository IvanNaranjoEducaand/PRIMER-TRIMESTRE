package ejercicio1;

import java.util.Scanner;

public class Actividad_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int mayor;
		
		System.out.println("Escriba el primer número que quiera introducir:");
		num1 = sc.nextInt();
		
		System.out.println("Escriba el segundo número que quiera introducir:");
		num2 = sc.nextInt();
		
		mayorDe2Numeros(num1, num2);
	}
	
	public static void mayorDe2Numeros(int a, int b) {
		int mayor;
		if(a > b) {
			mayor = a;
		} else {
			mayor = b;
		}
		System.out.println(mayor);
	}
}
