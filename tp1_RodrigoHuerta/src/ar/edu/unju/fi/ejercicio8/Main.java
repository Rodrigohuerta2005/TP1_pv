package ar.edu.unju.fi.ejercicio8;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Ingresar El Numero Deseado,De Preferencia Entero: ");
		int n = scanner.nextInt();
		scanner.close();
		CalculadoraEspecial calcu = new CalculadoraEspecial(n);
		System.out.println(calcu.calcularSumatoria());
        System.out.println(calcu.calcularProductoria(n));
	}

}
