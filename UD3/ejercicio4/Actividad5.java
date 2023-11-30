package ejercicio4;

public class Actividad5 {
	public static void main(String[] args) {
		int[][] tabla = new int[10][10];
		int mayor = 0;
		int menor = 300;
		int suma = 0;
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				tabla[i][j] = (int) (Math.random() * 100) + 200;
				System.out.print(""+tabla[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		//IMPRESIÓN DE LA DIAGONAL
		System.out.println("--DIAGONAL--");
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(i == j) {
					System.out.print(tabla[i][j]+" "+"\n");
				}
			}
		}
		
		//IMPRESIÓN DEL MÁXIMO
		System.out.println("--MÁXIMO--");
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if (tabla[i][j] > mayor) {
	                mayor = tabla[i][j];
				}
			}
		}
		System.out.println(mayor);
		
		//IMPRESIÓN DEL MÍNIMO
		System.out.println("--MÍNIMO--");
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if (tabla[i][j] < menor) {
			                menor = tabla[i][j];
				}
			}
		}
		System.out.println(menor);
		
		//MEDIA
		System.out.println("--MEDIA--");
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				suma  += tabla[i][j];
			}
		}
		int media = suma/100;
		System.out.println(media);
	}
}
