package ejercicio1;

import java.util.Scanner;

public class Actividad_3 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			float radio;
			float altura;
			int opciones;
			boolean opcionValida = false;
			
			System.out.println("Escriba el radio de la base del cilindro:");
			radio =sc.nextFloat();
			
			System.out.println("Escriba la altura del cilindro:");
			altura =sc.nextFloat();
			
			do {
				System.out.println("Escriba que operación desea realizar:");
				System.out.println("1-Área Total.");
				System.out.println("2-Volumen del cilindro.");
				opciones = sc.nextInt();
				
				switch(opciones) {
					case 1:
						areaTotal(radio, altura);
						opcionValida = true;
						break;
					case 2:
						volumenCilindro(radio, altura);
						opcionValida = true;
						break;
						
					default:
						System.out.println("Formato Incorrecto, intente de nuevo.");
						opcionValida = false;
						break;
				}
			}while(opcionValida == false);

	}

	public static void areaTotal(float radio, float altura) {
		float resultado = (float) (2 * 3.14 * radio * (altura + radio));
		System.out.println("La área total es de: "+resultado);
	}
	
	public static void volumenCilindro(float radio, float altura) {
		float resultado = (float) (3.14 * (radio * radio) * altura);
		System.out.println("El volumen del cilindro es de: "+resultado);
	}

	
}