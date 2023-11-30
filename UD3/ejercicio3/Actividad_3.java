package ejercicio3;

import java.util.Scanner;

public class Actividad_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tam;
		boolean opcionValida = false;
		int numIntroducido;
		//Variables Positivas
		int totalPositivo = 0;
		int numPositivo = 0;
		int mediaPositiva;
		//Variables Negativas
		int totalNegativo = 0;
		int numNegativo = 0;
		int mediaNegativa;
		//Varaibles para 0
		int numCeros = 0;
		
		do { //Bucle para obtener el tamaño del array
			System.out.println("Escriba cuántos números desea Introducir.");
			tam = sc.nextInt();
			if(tam > 0) {
				opcionValida = true;
			} else {
				System.out.println("La opción no es correcta. Intentelo de nuevo.");
			}
		} while(opcionValida == false);
		
		int[] vector = new int[tam];
		
		for(int i=0; i < vector.length; i++) { // Bucle que guarda los números
			System.out.println("Escriba un número entero:");
			numIntroducido = sc.nextInt();
			vector[i] = numIntroducido;
			
			if(numIntroducido > 0) {
				totalPositivo += numIntroducido;
				numPositivo++;
			}
			
			if(numIntroducido < 0) {
				totalNegativo += numIntroducido;
				numNegativo++;
			}
			
			if(numIntroducido == 0) {
				numCeros++;
			}
		}
		// Calculo de las medias
		mediaPositiva = totalPositivo / numPositivo;
		mediaNegativa = totalNegativo / numNegativo;
		
		//Escribir los resultados
		System.out.println("Media de los números positivos: "+mediaPositiva);
		System.out.println("Media de los números negativos: "+mediaNegativa);
		System.out.println("Número de ceros introducidos: "+numCeros);
	}
}
