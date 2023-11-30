package ejercicio4;

public class Ejercicio4_1 {

	public static void main(String[] args) {
		short valor1;
		short valor2;
		
		valor1 = -32768;
		valor2 =  32767;
		
		short suma = (short) (valor1 - 1);
		short suma2 = (short) (valor2 + 1);
		
		System.out.println("Tenemos el valor "+valor1+" y el valor "+valor2);
		System.out.println("Al sumar o restar 1 a los valores, obtenemos: "+suma+" y "+suma2);
	}

}
