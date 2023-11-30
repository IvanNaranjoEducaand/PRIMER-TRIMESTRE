package ejercicio2;

import java.util.Scanner;

public class Actividad_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nombre;
		String vocales = "[aeiouAeiouáéíóúÁÉÍÓÚ]";
		
		System.out.println("Escriba su nombre: ");
		nombre = sc.nextLine();
		
		System.out.println(nombre.replaceAll(vocales, ""));//Método para copiar el nombre sin vocales
		
		sc.close();
	}
}
