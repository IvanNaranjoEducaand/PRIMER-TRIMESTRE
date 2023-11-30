package ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_6 {
	
	public static int[] sinRepetidos(int t[]){
		int[] t2 = new int[t.length];
		int repetidos;
		int i = 0;
		int j;
		int k = 0;
		
		while(i < t.length) {
			repetidos=1;
			j = 0;
			
			while(j<t2.length) {
				if(t[i] == t2[j]) {
					repetidos++;
				}
				j++;
			}
			
			if(repetidos <= 1) { // Condicional que, si hay mas repetidos de los dados en el programa, no guarda el valor del array
				t2[k] = t[i];
				i++;
				k++;
			} else {
				i++;
			}
		}
		
		int[] t3 = new int[k]; //Creamos un array con el tamaño adecuado
		for(i = 0; i < t3.length;i++) { // Bucle para colocar los datos del array t2 en el array t3
			t3[i] = t2[i];
		}
		
		return t3;
}
		
	
	public static void main(String[] args) {
		
		int t[] = {2,4,5,4,3,2,1,7,6,5};
		int[] t2;
		
		t2 = sinRepetidos(t);
		
		for(int i = 0;i < t2.length;i++) {
			System.out.print("|"+t2[i]+"|");
		}
		
	}
}
