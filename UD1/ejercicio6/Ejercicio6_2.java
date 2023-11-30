package ejercicio6;

import java.util.Scanner;

public class Ejercicio6_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un número del 1 al 10:");
		int numero = sc.nextInt();
		String numeroL = "Número incorrecto.";
		switch (numero) {
		case 1:
			numeroL ="Uno";
			break;
		case 2:
			numeroL ="Dos";
			break;
		case 3:
			numeroL ="Tres";
			break;
		case 4:
			numeroL ="Cuatro";
			break;
		case 5:
			numeroL ="Cinco";
			break;
		case 6:
			numeroL ="Seis";
			break;
		case 7:
			numeroL ="Siete";
			break;
		case 8:
			numeroL ="Ocho";
			break;
		case 9:
			numeroL ="Nueve";
			break;
		case 10:
			numeroL ="Diez";
			break;
		default:
			numeroL ="Número incorrecto.";
		}
		System.out.println("El número seleccionado es: "+numeroL);
	}
}
