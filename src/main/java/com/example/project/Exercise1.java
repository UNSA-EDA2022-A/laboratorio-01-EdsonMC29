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

	public String convertirBaseGabriel(int a) {
		
		int numGab = 0;
		int n = a.length();
		int i = 0;
		while(n>0) {
			int x = Integer.parseInt(a.substring(n-1,n));
			numGab += x * (Math.pow(2,i+1)-1);
			n--;
			i++;	
		}
		return "SALIDA:" + numGab;
		
		return "El numero proporcionado no esta en base Gabriel.";
	}
}
