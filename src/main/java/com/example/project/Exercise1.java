package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public static String convertirBaseGabriel(int a) {
		
		int numGab = 0;
		int comprobar = 0;
		String number = String.valueOf(a);
		
		//Separamos cada digito como cadena String
       		 String[] digito = number.split("(?<=.)");
        	int p= digito.length;
        	for(int i = 0; i < digito.length; i++) {            
            	int d = Integer.parseInt(digito[i]);
            
            	//expresion numero Gabriel
            	numGab += d * (Math.pow(2,p)-1);
            	p--;
            
            	//separamos para comprobar desde la posicion del 2 
            	if(d == 2 ) {
            	   for(int j = i; j < digito.length; j++) {
            		int adelante = Integer.parseInt(digito[j]);
            		 
            		//comprobamos acumulando suma del 2 en adelante si posee digitos diferentes de 0
            		if(adelante == 2 || Integer.parseInt(digito[digito.length-1]) == 2 || adelante == 1) {
            			comprobar += adelante ;
            	    	}
            	   }
                }
        }
        
        //si posee solo 2 o ninguno es numero Gabriel
        if(comprobar <= 2) {
		return "SALIDA:" + numGab;
        }
        else return "El numero proporcionado no esta en base Gabriel.";
	}
}
