package ar.edu.unju.escmi.poo.tp8.model;

import org.springframework.stereotype.Component;

@Component
public class Empresa {
	
	private int id;
	private String nombre;
	private int cantidadDeEmpleados;
	private String telefono;
	private String direccion;
	
	public Empresa() {
		
	}

	public Empresa(int id, String nombre, int cantidadDeEmpleados, String telefono, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidadDeEmpleados = cantidadDeEmpleados;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadDeEmpleados() {
		return cantidadDeEmpleados;
	}

	public void setCantidadDeEmpleados(int cantidadDeEmpleados) {
		this.cantidadDeEmpleados = cantidadDeEmpleados;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
