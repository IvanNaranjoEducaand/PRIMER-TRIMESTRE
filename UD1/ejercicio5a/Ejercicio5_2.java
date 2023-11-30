package ejercicio5a;

import java.util.Scanner;

public class Ejercicio5_2 {
	 public static void main(String[] args) {
		 int numero;
		 do {
			 Scanner sc = new Scanner(System.in);
				System.out.println("Introduzca el número 12:");
				numero = sc.nextInt();
				if(numero== 12) {
					System.out.println("Número correcto :)");
				} else {
					System.out.println("Número Incorrecto:");
				}
		 } while(numero != 12);
	 }
}
