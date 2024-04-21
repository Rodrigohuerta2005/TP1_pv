package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	  
	        String[] nombres = new String[5];

	        
	        for (int i = 0; i < nombres.length; i++) {
	            System.out.print("Ingresar el nombre de la persona " + (i + 1) + ": ");
	            nombres[i] = scanner.nextLine();
	        }

	       
	        System.out.println("\nValores guardados en el array:");
	        int indice = 0;
	        while (indice < nombres.length) {
	            System.out.println("Posición " + indice + ": " + nombres[indice]);
	            indice++;
	        }

	        System.out.println("\nTamaño del array: " + nombres.length);

	       
	        byte indiceAEliminar;
	        do {
	            System.out.print("Ingrese el índice (0-" + (nombres.length - 1) + ") del elemento a eliminar: ");
	            indiceAEliminar = Byte.parseByte(scanner.nextLine());
	        } while (indiceAEliminar < 0 || indiceAEliminar >= nombres.length);

	        
	        for (int i = indiceAEliminar; i < nombres.length - 1; i++) {
	            nombres[i] = nombres[i + 1];
	        }
	        nombres[nombres.length - 1] = null; 

	        
	        System.out.println("\nValores después de eliminar el elemento:");
	        for (int i = 0; i < nombres.length; i++) {
	            System.out.println("Posición " + i + ": " + nombres[i]);
	        }
	    }
	}


