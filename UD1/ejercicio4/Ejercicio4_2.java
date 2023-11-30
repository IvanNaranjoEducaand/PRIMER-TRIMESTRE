package ejercicio4;

import java.util.Scanner;

public class Ejercicio4_2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int nota1;
	int nota2;
	
	System.out.println("Añada la primera nota (Entero)");
	nota1 = sc.nextInt();
	
	System.out.println("Añada la segunda nota (Entero)");
	nota2 = sc.nextInt();
	
	float media = (float) (nota1+nota2)/2;
	
	System.out.println("La media total es de: "+media);
	
	}
}
