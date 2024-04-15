package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String  nombre;
	private Integer codigo;
	private Integer precio;
	private Integer descuento;
	
	public Producto () {}
	
	public Producto(String nombre, Integer codigo, Integer precio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}
	
	public void mostrarDatos () {
		System.out.println("Producto: " + this.getNombre() + " | " + "Codigo: " + this.getCodigo()
		+ " | " + "Precio: $" + this.getPrecio() + " | " + "Descuento del Producto: $" + calcularDescuento());
	}
	
	public double calcularDescuento () {
		double descuentoDecimal = this.descuento / 100.0;
		double precioConDescuento = this.precio * (1 - descuentoDecimal);
        return precioConDescuento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getDescuento() {
		return descuento;
	}

	public void setDescuento(Integer descuento) {
		if (descuento >= 0 && descuento <= 50) {
            this.descuento = descuento;
        } else {
            System.out.println("El descuento debe ser entre 0 y 50 %.");
        }
	}
}
