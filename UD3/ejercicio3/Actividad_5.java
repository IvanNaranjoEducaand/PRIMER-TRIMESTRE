package ejercicio3;

import java.util.Scanner;

public class Actividad_5 {
	public static void burbujaAsc( int [ ] num ) {
		int temp;
		
		for (int i = 0; i < num.length; i++) {

	        for (int j = 0; j < num.length - 1; j++) {
	            if (num[j] > num[j+1]) {
	            	temp = num[ j ];
                    num[ j ] = num[ j+1 ];
                    num[ j+1 ] = temp;
	            }
	        }
	    }
	}

		
	    
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		
	    final int TAM = 6;
		
	    int[] alfa = {2,6,7,9,3,1};
	    int[] beta = {3,5,2,6,2,1};
	    int[] gamma = new int[TAM*2];
  
	    
	    burbujaAsc(alfa); //{1,2,3,6,7,9};
	    burbujaAsc(beta); //{1,2,2,3,5,6}
	    
	    int i=0;
	    int j=0;
	    int k=0;
	    
	    while (i<alfa.length && j<beta.length ) {
	    	if (alfa[i]<beta[j]) {
	    		gamma[k]=alfa[i];
	    		i++;
	    		k++;
	    	    
	    	} else if (alfa[i]>beta[j]) {
	    			gamma[k]=beta[j];
	    			j++;
	    			k++;
	    	    
	    	} else {
	    		gamma[k]=alfa[i];
	    		i++; //no incrementamos j para que los repetidos se vuelquen 2 veces
    			k++;    		
	    	}		    
	    	
	    	
	    }   
	    
	    System.out.println("i:"+i+" j:"+j+" k:"+k);
	    //Llegado a este punto, alfa o beta han sido volcados por completo en gamma
	    
	    while (i<alfa.length) { //volcamos en gamma el resto de alfa
    		gamma[k]=alfa[i];    		
    		i++;	
    		k++;  
	    }
	    
	    while (j<beta.length) {//volcamos en gamma el resto de beta
    		gamma[k]=beta[j];
    		j++;	
    		k++;  
	    }
	    
	    
	    for (k=0; k<TAM*2; k++) {
	    	System.out.print(gamma[k]);
	    }
	 
	}	
}

