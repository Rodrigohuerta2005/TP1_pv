package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        int size;
		        while (true) {
		            try {
		                System.out.print("Ingrese un número entero en el rango [5,10]: ");
		                size = Integer.parseInt(scanner.nextLine());
		                if (size >= 5 && size <= 10) {
		                    break;
		                } else {
		                    System.out.println("El número debe estar en el rango [5,10]. Intente de nuevo.");
		                }
		            } catch (NumberFormatException e) {
		                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
		            }
		        }

		       
		        String[] names = new String[size];

		        for (int i = 0; i < size; i++) {
		            System.out.print("Ingrese el nombre de la persona para la posición " + i + ": ");
		            names[i] = scanner.nextLine();
		        }

		      
		        System.out.println("\nNombres en el array desde la primera posición:");
		        for (int i = 0; i < size; i++) {
		            System.out.println("Posición " + i + ": " + names[i]);
		        }

		      
		        System.out.println("\nNombres en el array desde la última posición:");
		        for (int i = size - 1; i >= 0; i--) {
		            System.out.println("Posición " + i + ": " + names[i]);
		        }
		    }
		


	}


