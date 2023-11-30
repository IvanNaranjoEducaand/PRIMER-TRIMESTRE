package ejercicio8a;

import java.util.Scanner;

public class Ejercicio8_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número comprendido entre 1 y 10:");
		int numero = sc.nextInt();
		
		if(numero >= 1 && numero <= 10) {
			System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("Número fuera del rango válido. Debe ser entre 1 y 10.");
        }

	}

}
