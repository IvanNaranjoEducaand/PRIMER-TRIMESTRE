package ejercicio3;

import java.util.Scanner;

public class Ejercicio3_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float millas;
		
		System.out.println("Escriba el número de millas: ");
		millas = sc.nextFloat();
		
		
		float kilometros = (float) (millas * 1.069);
		System.out.println(millas+" Millas son "+kilometros+" Kilometros");
	}
}
