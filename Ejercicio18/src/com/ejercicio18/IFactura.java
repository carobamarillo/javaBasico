package com.ejercicio18;

public interface IFactura {

		static double iva = 0.21;
		public void facturar(int cantidad, Producto unProducto, Cliente cli, double total);
	}

