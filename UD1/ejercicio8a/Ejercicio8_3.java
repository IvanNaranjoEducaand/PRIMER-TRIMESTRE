package ejercicio8a;

import java.util.Scanner;

public class Ejercicio8_3 {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 1;
		int num2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entre 100 y 1; Utilize -1 para rendirse:");
		num2 = sc.nextInt();
		
		while(!(num2 == num) && (num2 != -1)) {
			
			if(num2>num) {
				System.out.println("El número aleatorio es menor");
			} else if(num2<num) {
				System.out.println("El número aleatorio es mayor");
			} else {
				System.out.println("Correcto!");
			}
			
			System.out.println("Introduzca un número entre 100 y 1; Utilize -1 para rendirse:");
			num2 = sc.nextInt();
		}
			
	}
}
