package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número (entre 0 y 10): ");
        int numero = scanner.nextInt();
scanner.close();
        
        if (numero < 0 || numero > 10) {
            System.out.println("Número Inválido. Por favor, ingresa un número entre 0 y 10");
        								}		 	
        else {
            int factorial = 1;
            int i = 1;
            while (i <= numero) {
                factorial *= i;
                i++;
            					}

            System.out.println("El factorial de " + numero + " es " + factorial + ".");
        	}
    									}
		
		
		

				}


