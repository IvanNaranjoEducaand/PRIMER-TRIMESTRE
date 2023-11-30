package ejercicio2;

import java.util.Scanner;

public class Actividad_8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inicioFrase = "Javalín, javalón";
		String finalFrase = "javalén, len, len";
		String fraseIntroducida;
		String fraseTraducida;
		
		System.out.println("Escriba una frase que traducir:");
		fraseIntroducida = sc.nextLine();
		
		if(fraseIntroducida.contains(inicioFrase)) {
			
			fraseTraducida = fraseIntroducida.replace(inicioFrase, "");
			System.out.println("\n"+"Frase en dialecto 1: "+fraseTraducida);
			
		} else if(fraseIntroducida.contains(finalFrase)) {
			
			fraseTraducida = fraseIntroducida.replace(finalFrase, "");
			System.out.println("\n"+"Frase en dialecto 2:  	"+fraseTraducida);
		
		} else {
			System.out.println("\n"+"La frase no esta en el idioma de Javalandia ni nunguno de sus dialectos");
		}
		sc.close();
		
	}
}
