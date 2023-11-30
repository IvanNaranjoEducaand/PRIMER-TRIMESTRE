package ejercicio4;

import java.util.Scanner;

public class Actividad2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] original = new String[8];
		String[] coloresConocidos = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
		String[] resultado = new String[8];
		boolean contiene;
		int posColores = 0;
		int posResto = 7;
		
		for(int i = 0; i < original.length; i++) {
			
			System.out.println("Escribe las palabras que quiera almacenar en el array:");
			String palabra = sc.next();
			
			palabra.toLowerCase();
			original[i] = palabra;
			
		}
		
		for(int i = 0; i < original.length; i++) {
			contiene = false;
			for(int j = 0; j < coloresConocidos.length; j++) {
				if(original[i].equals(coloresConocidos[j])){
					contiene = true;
				}
			}
			if(contiene) {
				resultado[posColores] = original[i];
				posColores++;
			} else {
				resultado[posResto] = original[i];
				posResto--;
			}
		}
		
		for(int k = 0; k < resultado.length; k++){
			System.out.print(resultado[k]+" ");
		}
		
	}
}
