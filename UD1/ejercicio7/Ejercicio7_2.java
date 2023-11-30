package ejercicio7;

import java.util.Scanner;

public class Ejercicio7_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad;
		int nivel_estudios;
		int ingresos;
		boolean jasp = true;
		
		System.out.println("Introduzca su Edad:");
		edad = sc.nextInt();
		System.out.println("Introduzca su Nivel de estudios:");
		nivel_estudios = sc.nextInt();
		System.out.println("Introduzca sus ingresos:");
		ingresos = sc.nextInt();
		
		if(edad<=28 && nivel_estudios>3 && ingresos>28000){
			jasp = true;
		} else {
			jasp = false;
		}
		System.out.println("Jasp: "+jasp);
	}
}
