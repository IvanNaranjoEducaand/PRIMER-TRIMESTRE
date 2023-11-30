package ejercicio3;

import java.util.Scanner;

public class Actividad_2 {
	/*Escribir una aplicación que solicite al usuario cuántos números desea introducir. 
	 * A continuación, se introducirá por teclado esa cantidad de números enteros,
	 *  y por último, los mostrará en el orden inverso al introducido.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tam;
		boolean opcionValida = false;
		int numIntroducido;
		
		do { //Bucle para obtener el tamaño del array
			System.out.println("Escriba cuántos números desea Introducir.");
			tam = sc.nextInt();
			if(tam > 0) {
				opcionValida = true;
			} else {
				System.out.println("La opción no es correcta. Intentelo de nuevo.");
			}
		} while(opcionValida == false);
		
		int[] vector = new int[tam]; // array al que le damos el tamaño introducido
		
		for(int i=0; i < vector.length; i++) { // Bucle que guarda los números
			System.out.println("Escriba un número entero:");
			numIntroducido = sc.nextInt();
			vector[i] = numIntroducido;
		}
		
		for(int i=(vector.length)-1; i >= 0; i--) { //Bucle que escribe los números
			System.out.println("El dato de la posición "+i+" es igual a: "+vector[i]);
		}
		
	}
}
