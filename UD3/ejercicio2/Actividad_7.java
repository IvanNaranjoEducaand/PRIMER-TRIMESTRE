package ejercicio2;

import java.util.Scanner;

public class Actividad_7 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String intento;
		boolean acierto = false;
		int pistas = 0;
		
		System.out.println("Jugador 1 - Introduzca la contraseña secreta");
		String secreta = sc.next();
		
		do {
			System.out.println("Jugador 2 - Introduzca su intento para adivinar la contraseña.");
			intento = sc.next();
			
			if(intento.equalsIgnoreCase(secreta)) {
				System.out.println("Acertaste!");
				acierto = true;
			} else {
				pistas++;
				
				if(pistas == 1) {
					System.out.println("Fallaste:");
					System.out.println("La contraseña tiene "+secreta.length()+" carácteres");
				}
				
				if(pistas == 2) {
					System.out.println("Fallaste:");
					System.out.println("La contraseña empieza por: "+secreta.charAt(0));
				}
				
				if(pistas == 3) {
					System.out.println("Fallaste.");
					System.out.println("La contraseña acaba por: "+secreta.charAt(secreta.length()-1));
				}
			}
		} while(acierto == false);
		
		sc.close();
	}
}
