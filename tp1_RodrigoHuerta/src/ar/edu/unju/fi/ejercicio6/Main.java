package ar.edu.unju.fi.ejercicio6;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		 System.out.print("Dni: ");
		 String dni = scanner.nextLine();
		 
		 System.out.print("Nombre: ");
		 String nombre = scanner.nextLine(); 
	
		System.out.print("fecha de nacimiento (formato YYYY-MM-DD): ");
		String fechaNacimientostrn = scanner.nextLine();
		LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientostrn);
		
		System.out.print("Provincia: ");
		String provincia = scanner.nextLine(); 
		
		Persona personaConProvincia = new Persona(dni, nombre, fechaNacimiento, provincia);
		  personaConProvincia.mostrarDatos();
		  
		 
		  scanner.close();
	}

	}

