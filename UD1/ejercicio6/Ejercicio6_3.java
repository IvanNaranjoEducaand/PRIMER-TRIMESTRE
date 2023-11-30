package ejercicio6;

import java.util.Scanner;

public class Ejercicio6_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Paridad;

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();
        
        if (numero % 2 == 0) {
            Paridad = 1;
        } else {
            Paridad = 2;
        }
        
        switch (Paridad) {
        case 1:
        	System.out.println("El número es par.");
        	break;
        case 2:
        	System.out.println("El número es impar.");
        	break;
        default:
            System.out.println("Algo salió mal.");
        }
        
	}

}
