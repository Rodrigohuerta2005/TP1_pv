package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		      
		Scanner scanner = new Scanner(System.in);

		        System.out.print("Ingresa un Número Entero: ");
		       		int numero = scanner.nextInt();
		        	if (numero % 2 == 0) {
		            int triple = numero * 3;
		        System.out.print("El numero es Par \n");
		        
		            
		        System.out.println("El Triple del Número es: " + triple);
		        							} 	
		        	else {
		           
		            int doble = numero * 2;
		        System.out.print("El Numero es Impar\n");
		        System.out.println("El Doble del Número es: " + doble);
		        }

		scanner.close();
		  
	
	}
		
	
	}
