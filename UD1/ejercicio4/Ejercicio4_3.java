package ejercicio4;

import java.util.Scanner;

public class Ejercicio4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float nota1;
		float nota2;
		float nota3;
		
		System.out.println("Añada la primera nota (Decimal)");
		nota1 = sc.nextFloat();
		
		System.out.println("Añada la segunda nota (Decimal)");
		nota2 = sc.nextFloat();
		
		System.out.println("Añada la tercera nota (Decimal)");
		nota3 = sc.nextFloat();
		
		
		int media =  (int) ((nota1+nota2+nota3)/3);
		
		System.out.println("La media total es de: "+media);
		
		}
}
