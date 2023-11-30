package ejercicio3;

import java.util.Scanner;

public class Actividad_7 {
	
	public static void mediaAlumno(int[][] a, int y) {
		
		int suma = 0;
		
		for(int x = 0; x < 3; x++) {
			suma += a[x][y];
		}
		
		int media = suma / 3;
		System.out.println("La media del alumno "+(y+1)+" es igual a: "+media);
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] clase = new int[3][5];
		
		//Alumno 1
		
		clase [0][0] = (int) (Math.random() * 10);
		clase [1][0] = (int) (Math.random() * 10);
		clase [2][0] = (int) (Math.random() * 10);
		
		//Alumno 2
		
		clase [0][1] = (int) (Math.random() * 10);
		clase [1][1] = (int) (Math.random() * 10);
		clase [2][1] = (int) (Math.random() * 10);
		
		//Alumno 3
		
		clase [0][2] = (int) (Math.random() * 10);
		clase [1][2] = (int) (Math.random() * 10);
		clase [2][2] = (int) (Math.random() * 10);
		
		//Alumno 4
		
		clase [0][3] = (int) (Math.random() * 10);
		clase [1][3] = (int) (Math.random() * 10);
		clase [2][3] = (int) (Math.random() * 10);
		
		//Alumno 5
		
		clase [0][4] = (int) (Math.random() * 10);
		clase [1][4] = (int) (Math.random() * 10);
		clase [2][4] = (int) (Math.random() * 10);
		
		System.out.println("----MEDIA TOTAL TRIMESTRAL----");
		for(int x = 0; x < 3; x++) { //Medias totales de las clase
			int suma = 0;
			for( int y = 0; y < 5; y++) {
				suma += clase[x][y];
			}
			
			int media = suma/5;
			System.out.println("Media de la clase en el "+(x+1)+"º trimestre: "+media);
			System.out.println(" ");
		}
		
		
		System.out.println("Si quieres ver la media de un alumno, eliga de que alumno quiere ver la media.");
		int posY = sc.nextInt();
		mediaAlumno(clase, posY - 1);
	}
}
