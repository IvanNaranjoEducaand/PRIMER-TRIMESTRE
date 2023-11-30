package ejercicio8a;

public class Ejercicio8_11 {

	public static void main(String[] args) {
		int numero;
		
		for(numero=1;numero<=10;numero++) {
			System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
		}
	}
}
