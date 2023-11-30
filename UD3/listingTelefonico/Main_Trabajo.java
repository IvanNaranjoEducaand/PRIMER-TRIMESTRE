package listingTelefonico;

import java.util.Scanner;

public class Main_Trabajo {
	
	//Función que devuelve la lista completa de contactos
	    public static void listado(String[][] lista) {

	        System.out.println("----------LISTA DE CONTACTO----------");
	        System.out.println("- Número de teléfono ");
	        System.out.println("- Nombre del contacto ");
	        System.out.println("- Primer apellido del contacto ");

	        for (int i = 0 ; i < 5 ; i++) {
	            System.out.println("Contacto" + i);
	            for(int j = 0 ; j < 3 ; j++) {
	                System.out.println( lista[i][j]);
	            }

	    }

	}
	
	// Función para mostrar el nombre asociado a un número de teléfono
		public static void mostrarNombrePorTelefono(Scanner sc, String[][] lista) {
		System.out.println("Ingrese el número de teléfono:");
		String telefono = sc.next();

		    boolean encontrado = false;
		    for (int i = 0; i < lista.length; i++) {
		        if (lista[i][0].equals(telefono)) {
		            System.out.println("Nombre asociado al número " + telefono + ": " + lista[i][1]  );
		            encontrado = true;
		            break;
		        }
		    }

		    if (!encontrado) {
		        System.out.println("Error. Número de teléfono no encontrado.");
		    }
		}

	//Función para mostrar el apellido asociado al teléfono
		public static void mostrarTelefonoPorApellido(Scanner sc, String[][] lista) {
	        System.out.println("Ingrese el apellido:");

	        String apellido = sc.next();
	        boolean encontrado = false;

	        for (int i = 0; i < lista.length; i++) {
	            if (lista[i][2].equals(apellido)) {
	                System.out.println("Número de teléfono asociado al apellido " + apellido + ": " + lista[i][0]);
	                encontrado = true;
	                break;
	            }
	        }

	        if (!encontrado) {
	            System.out.println("Apellido no encontrado en la lista.");
	        }
	    }
	
	// Función para mostrar el número de teléfono asociado a un nombre
	   public static void mostrarTelefonoPorNombre(Scanner sc, String[][] lista) {
	        System.out.println("Ingrese el nombre y Apellido:");

	        String nombre = sc.next();
	        String apellido = sc.next();

	        boolean encontrado = false;
	        for (int i = 0; i < lista.length; i++) {
	            if (lista[i][1].equals(nombre)||lista[i][2].equals(apellido)) {
	                System.out.println("Número de teléfono asociado al nombre " + nombre + ": " + lista[i][0]);
	                encontrado = true;
	                break;
	            }
	        }

	        if (!encontrado) {
	            System.out.println("Nombre no encontrado en la lista.");
	        }
	    }
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[][] lista = new String[5][3];
		int contactoMax = 0;
		boolean finalizar = false;
		
		do {
			System.out.println("Quiere añadir un contacto? [S/N]");
			char eleccion = sc.next().charAt(0);
			
			if(eleccion == 'S') {
				
				System.out.println("Escriba un teléfono de contacto:");
				String numTelefono = sc.next();
				lista[contactoMax][0] = numTelefono;
					
				System.out.println("Añada un nombre al contacto:");
				String nombreContacto = sc.next();
				lista[contactoMax][1] = nombreContacto;
					
				System.out.println("Introduzca el apellido del contacto:");
				String primerApellido = sc.next();
				lista[contactoMax][2] = primerApellido;
					
				contactoMax++;
					
			} else {finalizar = true;}
			
		}while(contactoMax < 5 && finalizar == false);
		
		//El orden de los datos es el siguiente.
		
		//Fila 1 : Télefonos
		//Fila 2 : Nombres
		//Fila 3 : Apellidos
		
		System.out.println("\n"+"Escriba la operación que desea realizar:");
		System.out.println("1-Lista Completa de contactos:"+"\n");
		System.out.println("2-Nombre a través del teléfono:"+"\n");
		System.out.println("3-Apellido a través del teléfono:"+"\n");
		System.out.println("4-Teléfono a través del nombre:"+"\n");
		int opciones = sc.nextInt();
		
		switch(opciones) {
		case 1:
			//TAREA 1
			listado(lista);
			break;
			
		case 2:
			//TAREA 2
			mostrarNombrePorTelefono(sc, lista);
			break;
			
		case 3:
			//TAREA 3
			mostrarTelefonoPorApellido(sc, lista);
			break;
			
		case 4:
			//TAREA 4
			mostrarTelefonoPorNombre(sc, lista);
			break;
		}
		sc.close();
	}
}
