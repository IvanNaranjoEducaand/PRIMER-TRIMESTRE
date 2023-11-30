package ejercicio2;

import java.util.Scanner;

public class Ejercicio2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int millas;
		 
		 System.out.println("Introduzca el número de millas: ");
		 millas = sc.nextInt();
		 
		 int metros = millas * 1069;
		 
		 System.out.println(millas+" Millas equivale a: " +metros+" metros.");
	}

}
