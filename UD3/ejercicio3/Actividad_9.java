package ejercicio3;

import java.util.Arrays;

public class Actividad_9 {
	public static int comparaPrimitiva(int[] apuesta, int[] ganador){
		
		int aciertos = 0;
		
		for(int i = 0; i < apuesta.length; i++) {
			if(apuesta[i] == ganador[i]) {
				aciertos++;
			}
		}
		
		return aciertos;
	}
	
	public static void main(String[] args){
		int[] primitivaGanadora = new int[6];
		int[] primitivaApuesta = new int[6];
		
		for(int i = 0; i < 6;i++) {
			primitivaGanadora[i] = (int) (Math.random() * 49 + 1); //La privitiva va desde 1 a 49
			primitivaApuesta[i] = (int) (Math.random() * 49 + 1);
		}
		
		System.out.println("Su apuesta : "+Arrays.toString(primitivaApuesta)+"\n");
		System.out.println("Primitiva ganadora : "+Arrays.toString(primitivaGanadora)+"\n");
		
		System.out.println("Su número de aciertos ha sido de: "+comparaPrimitiva(primitivaApuesta, primitivaGanadora));
	}
}
