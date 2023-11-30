package ejercicio3;

import java.util.Scanner;

public class Actividad_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int longitud;
		boolean claveCorrecta = false;
		int numIntroducido;
		int intentoCorrecto;
		
		
		System.out.println("Escriba cuantos digitos quiere que tenga su clave secreta:");
		longitud = sc.nextInt();
		
		int[] clave = new int[longitud];
		
		for(int i = 0; i < longitud;i++) { //bucle para obtener la clave aleatoria
			int numAleatorio = (int) (Math.random() * 5 + 1);
			clave[i] = numAleatorio;
		}
		
		
		int[] intento = new int[longitud];
		
		do {
				intentoCorrecto = 0;
				System.out.println("Introduce la combinación (Dar a intro despues de dar cada número)");
				
			for(int i = 0; i < longitud;i++) { //Bucle que pide escriir los numeros
				intento[i] = sc.nextInt();
			}
			
			for(int i = 0; i < longitud;i++) { //Bucle que realiza las comparaciones
				if(intento[i] > clave[i]) {
					System.out.println("El número "+intento[i]+" es mayor.");
				} else if(intento[i] < clave[i]) {
					System.out.println("El número "+intento[i]+" es menor.");
				} else if(intento[i] == clave[i]) {
					System.out.println("El número "+intento[i]+" es igual.");
					intentoCorrecto++;
			}
				
				
				if(intentoCorrecto == longitud) {
					System.out.println("¡Correcto!");
					claveCorrecta = true;
				}
			}
			
		} while(claveCorrecta == false);
	}
}
