package ejercicio3;

public class Actividad_8 {
	public static void main(String[] args) {
		
		int[][] tabla = new int[5][5];
		for(int i = 0; i < 5; i++) { //Bucle que crea las filas
			for(int j = 0; j < 5; j++) { //Bucle que crea las columnas
				tabla[i][j]= i + j; //Operación que calcula la suma dependiendo de la posición de i y j
				System.out.print(""+tabla[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
