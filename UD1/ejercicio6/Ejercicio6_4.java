package ejercicio6;

import java.util.Scanner;

public class Ejercicio6_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte byte1;
		byte byte2;
		byte menor;
		int comparacion;

        System.out.print("Introduce un número tipo byte: ");
        byte1 = sc.nextByte();
        
        System.out.print("Introduce un 2º número tipo byte: ");
        byte2 = sc.nextByte();
        
        if(byte1 > byte2) {
        	comparacion = 1;
        } else {
        	comparacion = 2;
        }
        
        switch (comparacion) {
        case 1:
        	menor = byte1;
        	System.out.println("El número menor es "+menor);
        	break;
        case 2:
        	menor = byte2;
        	System.out.println("El número menor es "+menor);
        	break;
        default:
            System.out.println("Algo salió mal.");
        }
	}
}
