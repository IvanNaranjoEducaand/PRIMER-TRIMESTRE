package ejercicio4;

public class Actividad6 {
	public static void main(String[] args) {
		
		int[][] tabla = new int[6][10];
		int mayor = 0;
		int menor = 1000;
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 10; j++) {
				tabla[i][j] = (int) (Math.random() * 1000) + 0;
				System.out.print(""+tabla[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		//IMPRESIÓN DEL MÁXIMO Y LOCALIZACIÓN DE SU POSICIÓN
				System.out.println("--MÁXIMO--");
				for(int i = 0; i < 6; i++) {
					for(int j = 0; j < 10; j++) {
						if (tabla[i][j] > mayor) {
			                mayor = tabla[i][j];
			                x = i;
			                y = j;
						}
					}
				}
				System.out.println(mayor+" se encuentra en la posicion: "+(x+1)+"|"+(y+1));
				
				//IMPRESIÓN DEL MÍNIMO
				System.out.println("--MÍNIMO--");
				for(int i = 0; i < 6; i++) {
					for(int j = 0; j < 10; j++) {
						if (tabla[i][j] < menor) {
					                menor = tabla[i][j];
					                x = i;
					                y = j;
						}
					}
				}
				System.out.println(menor+" se encuentra en la posicion: "+(x+1)+"|"+(y+1));
	}
}
