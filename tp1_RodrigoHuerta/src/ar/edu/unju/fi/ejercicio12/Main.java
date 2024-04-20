package ar.edu.unju.fi.ejercicio12;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendario = Calendar.getInstance();

        // Establecer una fecha específica (por ejemplo, 15 de abril de 2024)
        calendario.set(Calendar.YEAR, 2004);
        calendario.set(Calendar.MONTH, Calendar.APRIL); // El mes es 0-indexado (enero = 0, febrero = 1, ..., diciembre = 11)
        calendario.set(Calendar.DAY_OF_MONTH, 15);

        // Obtener información de la fecha establecida
        int año = calendario.get(Calendar.YEAR);
        int edad = año - calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH) + 1; // Sumamos 1 para mostrar el mes correctamente
        int dia = calendario.get(Calendar.DAY_OF_MONTH);

        System.out.println("Fecha establecida: " + dia + "/" + mes + "/" + año);
        System.out.println("edad: " + edad);

	}

}
