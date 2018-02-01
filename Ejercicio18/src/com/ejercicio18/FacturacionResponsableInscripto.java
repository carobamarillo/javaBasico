package com.ejercicio18;

public class FacturacionResponsableInscripto implements IFactura{

		@Override
		public void facturar(int cantidad, Producto unProducto, Cliente cli, double total) {
			System.out.println("Cliente " + cli.toString() + " (Cantidad)Producto: "
					+ cantidad + " " + unProducto.toString() + " Total: "
					+ total + "IVA - " +IFactura.iva*total);
			}
	}