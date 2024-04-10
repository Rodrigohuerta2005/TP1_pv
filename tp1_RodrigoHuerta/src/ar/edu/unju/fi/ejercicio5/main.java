package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	      System.out.print("Ingresa un número entre 1 y 9: ");
	        int numero = scanner.nextInt();
	        		scanner.close();
	   
	        
	        if (numero < 1 || numero > 9) {
	            System.out.println("Número inválido, ingresa un número entre 1 y 9.");
	        } else {
	            System.out.println("Tabla de multiplicar del " + numero + ":");
	            for (int i = 1; i <= 10; i++) {
	                int resultado = numero * i;
	                System.out.println(numero + " x " + i + " = " + resultado);
	            }
	        } 
	}

}
