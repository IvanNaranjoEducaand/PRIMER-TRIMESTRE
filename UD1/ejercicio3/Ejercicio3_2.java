package ejercicio3;

import java.util.Scanner;

public class Ejercicio3_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		short nacimiento;
		short actual;
		
		System.out.println("Escriba su año de nacimiento ");
		nacimiento = sc.nextShort();
		
		System.out.println("Escriba el año actual: ");
		actual = sc.nextShort();
		
		short edad = (short) (actual - nacimiento);
		
		System.out.println("Su edad es: "+edad);

	}

}
