package ejercicio1;

import java.util.Scanner;

public class Actividad_11 {
	
	public static float potenciaIterativa(float base, int exponente) {
		float potencia = 1;
		for(int i = 1; i <= exponente; i++) {
			
			potencia *= base;
		}
		return potencia;
	}
	
	public static float potenciaRecursiva(float base, int exponente) {
		if(exponente == 0) {
			return 1;
		} else {
			return base * potenciaRecursiva(base, exponente - 1);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float a;
		int n;
		
		System.out.println("Introduzca la base de la potencia:");
		a = sc.nextFloat();
		System.out.println("Introduzca el exponente de la potencia:");
		n = sc.nextInt();
		
		if(n < 0) {
			n = n * -1;
		}
		
		System.out.println("Resultado: "+potenciaIterativa(a, n));
		
		System.out.println("Resultado: "+potenciaRecursiva(a, n));
		
		sc.close();
	}
}
