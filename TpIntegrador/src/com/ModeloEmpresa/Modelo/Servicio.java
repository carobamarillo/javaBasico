package com.ModeloEmpresa.Modelo;

public class Servicio extends Producto{

	
	public Servicio(String nombre, double precio) {
		super(nombre, precio);
	}

	@Override
	public void descontarStock() {
		//no hace nada xq no tiene stock los servicios rulo		
	}

	@Override
	public int getStock() {
		//si existe siempre hay stock 
		return 1;
	}
//
//	@Override
//	public int sumarStock(int cantidad, int cantMaterial) {
//		System.out.println("Esto es un servicio no se puede agregar Stock");
//		return cantMaterial;
//		
//	}

	@Override
	public String toString() {
		return super.nombre;
	}

	
}
