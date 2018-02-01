package com.ModeloEmpresa.Modelo;

public class MateriaPrima {

	private int cantidad;
	private String nombre;
	
	public MateriaPrima(String nombre) {
		this.nombre = nombre;
	}
		
	public int getCantidad() {
		return cantidad;
	}
	public void agregarMateria(int cantidad) {
		this.cantidad += cantidad;
	}
	public void venderMateria(int cantidad) {
		this.cantidad -= cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
