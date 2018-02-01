package com.ModeloEmpresa.Modelo;

public abstract class Producto {

	protected String nombre;
	//los precios son sin iva, se agrega al momento de facturar
	protected double precio;
	
	public Producto(String nombre, double precio){
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public abstract String toString();
	
	public abstract void descontarStock();
	
	public int sumarStock(int cantidad, int cantMaterial){
		return cantMaterial;
	}
	
	public abstract int getStock();
}
