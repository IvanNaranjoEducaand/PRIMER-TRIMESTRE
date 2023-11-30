package ejercicio8a;

public class Ejercicio8_7 {
	public static void main(String[] args) {
		int num = 1;
		int num2 = 1;
		System.out.println("Producto de los 10 primeros números impares:");
		
		for(int i = 1; i<=10;) {
			if(num % 2 != 0) {
				num2 = num * num2;
				i++;
			}
			num++;
			
		}
		System.out.println(num2);
	}
}
