package ejercicio2;

import java.util.Scanner;

public class Ejercicio2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int numero1;
		 int numero2;
		 
		 System.out.println("Introduzca el primer número entero: ");
		 numero1 = sc.nextInt();
		 
		 System.out.println("Introduzca el segundo número entero: ");
		 numero2 = sc.nextInt();
		 
		 int cociente = numero1 / numero2;
		 int resto = numero1 % numero2;
		 
		 System.out.println("Cociente: "+cociente);
		 System.out.println("Resto: "+resto);
	}

}
