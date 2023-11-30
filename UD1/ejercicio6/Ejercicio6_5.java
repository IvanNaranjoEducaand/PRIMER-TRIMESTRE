package ejercicio6;

import java.util.Scanner;

public class Ejercicio6_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el radio de una circunferencia: ");
        float radio = sc.nextFloat();
        
        System.out.println("¿Que desea hacer?");
		System.out.println("1. Diámetro");
		System.out.println("2. Perímetro");
		System.out.println("2. Área");
		int numero = sc.nextInt();
		
		switch (numero) {
		case 1:
			float diametro = radio * 2;
			System.out.print("El diámetro de la circunferencia es de: "+diametro);
			break;
		case 2:
			float perimetro = (float) (2 * 3.1416 * radio);
			System.out.print("El perímetro de la circunferencia es de: "+perimetro);
			break;
		case 3:
			 float area = (float) (3.1416 * radio * radio);
			 System.out.print("El área de la circunferencia es de: "+area);
			 break;
		}

	}

}
