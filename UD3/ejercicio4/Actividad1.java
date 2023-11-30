package ejercicio4;

import java.util.Scanner;

public class Actividad1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arrayAleatorio = new int[100];
		int opcion;
		boolean eleccionCorrecta = false;
		int mayor = 0;
		int menor = 500;
		
		for(int i = 0; i < arrayAleatorio.length; i++ ) {
			arrayAleatorio[i] = (int) (Math.random() * 500) + 1;
			System.out.print(arrayAleatorio[i]+" ");
		}
		
		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("1-Destacar Máximo");
			System.out.println("2-Destacar Máximo");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				for(int i = 0; i < arrayAleatorio.length; i++ ) {
					
					if (arrayAleatorio[i] > mayor) {
		                mayor = arrayAleatorio[i];
					}

				}
				
				for(int i = 0; i < arrayAleatorio.length; i++ ) {
					
					if(arrayAleatorio[i] == mayor) {
						System.out.print("**"+arrayAleatorio[i]+"** ");
					}else {
						System.out.print(arrayAleatorio[i]+" ");
					}
				}
				
				eleccionCorrecta = true;
				break;
				
			case 2:
				for(int i = 0; i < arrayAleatorio.length; i++ ) {
					
					if (arrayAleatorio[i] < menor) {
		                menor = arrayAleatorio[i];
					}

				}
				
				for(int i = 0; i < arrayAleatorio.length; i++ ) {
					
					if(arrayAleatorio[i] == menor) {
						System.out.print("**"+arrayAleatorio[i]+"** ");
					}else {
						System.out.print(arrayAleatorio[i]+" ");
					}
				}
				
				eleccionCorrecta = true;
				break;
				
			default:
				System.out.println("Elección Incorrecta. Intenteló de nuevo.");
				eleccionCorrecta = false;
				break;
			}
		}while(eleccionCorrecta != true);
	}
}
