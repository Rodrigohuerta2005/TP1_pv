package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNacimiento;
	
	public Persona() {}

	public void calcularEdad() {
		
	}
	
	public Persona(String nombre, Calendar fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	};
	
	
}
