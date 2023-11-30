package ejercicio8a;

import java.util.Scanner;

public class Ejercicio8_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad;
		int Sumaedades = 0;
		int Alumnos = 0;
		int mayores = 0;
		
		System.out.println("Escriba una edad:");
		edad = sc.nextInt();
		
		while(edad >= 0) {
			
			Sumaedades += edad;
			System.out.println("Suma de edades: "+Sumaedades);
			
			
			Alumnos++;
			System.out.println("Nº Edades: "+Alumnos);
			
			int mediaAlumnos = Sumaedades/Alumnos;
			System.out.println("Media de edad: "+mediaAlumnos);
			
			if(edad>=18) {
				mayores++;
			}
			System.out.println("Alumnos Mayores de edad: "+mayores);
			
			System.out.println("Escriba una edad:");
			edad = sc.nextInt();
		}
	}
}
