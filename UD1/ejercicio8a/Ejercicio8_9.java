package ejercicio8a;

import java.util.Scanner;

public class Ejercicio8_9 {
	public static void main(String[] args) {
		int Actual = 0; 
        int alturaMax = 0; 
        int MasAlto = -1; 
        int altura = 0;
		Scanner sc = new Scanner(System.in);
		
		
		while (altura != -1) {
			System.out.println("Introduzca la altura del siguiente árbol(en cm):");
			 altura = sc.nextInt();

	         if (altura > alturaMax) {
	                alturaMax = altura;
	                MasAlto = Actual;
	         }

	         Actual++;
	    }
		
		if (MasAlto != -1) {
        System.out.println("El árbol más alto es el árbol " + MasAlto + " con una altura de " + alturaMax + " cm.");
		} else {
			System.out.println("Programa finalizado.");
		}		
	}
}
