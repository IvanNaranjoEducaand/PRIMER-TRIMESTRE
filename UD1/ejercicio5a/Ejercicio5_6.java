package ejercicio5a;

import java.util.Scanner;

public class Ejercicio5_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final float gravedad = 9.8f;
		int tiempo;
		
		System.out.println("Introduzca el tiempo deseado(en segundos):");
		tiempo = sc.nextInt();
		
		 float velocidad = gravedad * tiempo;
		 
		 System.out.println("La velocidad total es de: "+velocidad+" m/s");
	}
}
