package ejercicio1;

import java.util.Scanner;

public class Actividad_7 {
	public static void primos(int num) {
		int es_primo = 0;
		int divisibles = 0;

		      for (int j = 1; j <=num; j++) {
		        if ((num % j) == 0) {
		          divisibles++;
		        }
		      }
		      if (divisibles == 2) {
		        System.out.println(num + "-> primo");
		      } else {
		        System.out.println(num + "-> no primo");
		      }
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Escriba un número; ");
		num = sc.nextInt();
		
		primos(num);
	}
}
