package ejercicio7;

public class Ejercicio7_3 {
	public static void main(String args[]) {
		int numeroAleatorio = (int) (Math.random() * (122 - 97 + 1)) + 97;
		
		char letraAleatoria = (char) numeroAleatorio;
        System.out.println("Letra minúscula generada: " + letraAleatoria);
	}
}
