package ar.edu.unju.fi.ejercicio7;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos: ");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Legajo: ");
        String legajo = scanner.nextLine();
        System.out.println("Salario: ");
        Double salario = scanner.nextDouble();

        
        Empleado empleado = new Empleado(nombre, legajo, salario);
        empleado.mostrarDatos();
        empleado.aumentoSalario();
        System.out.println("----------");
        empleado.mostrarDatos();
        scanner.close();

	}

}
