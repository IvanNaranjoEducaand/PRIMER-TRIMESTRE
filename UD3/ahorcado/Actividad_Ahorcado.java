package ahorcado;

import java.util.Scanner;

public class Actividad_Ahorcado {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int intentos;
		int sumaLetras = 0;
		boolean acierto = false;
		String palabraSecreta = "ahorcado";
		char letra;
		char[][] palabraCompleta = new char[palabraSecreta.length()][2];
		
		for(int i = 0; i < palabraSecreta.length(); i++) {
			palabraCompleta[i][0] = palabraSecreta.charAt(i);
			palabraCompleta[i][1] = '_';
		}
		
		System.out.println("Introduzca cuantos intentos quiere.");
		intentos = sc.nextInt();
		
		
		
		 do{
			
			System.out.println("\n"+"Introduzca la letra.");
			letra = sc.next().charAt(0); 
			 
			for(int j = 0; j < palabraSecreta.length(); j++) {
				
				if(palabraCompleta[j][0]==letra) {
					palabraCompleta[j][1] = letra;
					sumaLetras++;
					
				}
				
				System.out.print(palabraCompleta[j][1]);
			}
			
			System.out.println("\n"+"Le quedadn "+intentos+" intentos.");
			
			if(sumaLetras == palabraSecreta.length()) {
				acierto = true;
			}
			
			
			
		}while(intentos>0 && acierto == false);
		 sc.close();
	}
}
