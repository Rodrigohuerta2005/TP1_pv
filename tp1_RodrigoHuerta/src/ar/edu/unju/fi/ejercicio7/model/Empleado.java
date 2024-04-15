package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	static final Double SALARIO_MINIMO = 210000.00;
    static final Double AUMENTO_POR_MERITO = 20000.00;
	
	private String nombre ;
	private String legajo;
	private Double salario ;
	
	
	public Empleado () {}; 
	
	public Empleado(String nombre, String legajo, Double salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.salario = salario;
		if (salario >= SALARIO_MINIMO ) {
			this.salario = salario;
		}
		else{
			this.salario = SALARIO_MINIMO;
		}	
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        
        System.out.println("Legajo: " + legajo);
        
        System.out.println("Salario: " + salario);
    }
	
	public void aumentoSalario() {
		this.salario = salario + AUMENTO_POR_MERITO;
			}
//this.salario += AUMENTO_POR_MERITO; 
	



}
	
	
	


