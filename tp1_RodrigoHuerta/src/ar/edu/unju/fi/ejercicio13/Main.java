package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] miArray = new int[8];

	        // Pedir valores por consola y almacenarlos en el array
	        Scanner scanner = new Scanner(System.in);
	        for (int i = 0; i < miArray.length; i++) {
	            System.out.print("Ingresa un número para la posición " + i + ": ");
	            miArray[i] = scanner.nextInt();
	        }

	        // Mostrar el índice y el valor almacenado en cada posición
	        System.out.println("Índice\tValor");
	        for (int i = 0; i < miArray.length; i++) {
	            System.out.println(i + "\t" + miArray[i]);
	        }
	       scanner.close();
	    }
	
	}


