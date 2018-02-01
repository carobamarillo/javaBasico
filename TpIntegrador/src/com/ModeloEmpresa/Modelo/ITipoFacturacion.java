package com.ModeloEmpresa.Modelo;

public interface ITipoFacturacion {

	static double iva = 0.21;
	public void facturar(int cantidad, Producto unProducto, Cliente cli, double total);
}
