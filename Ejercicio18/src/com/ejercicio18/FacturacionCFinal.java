package com.ejercicio18;

public class FacturacionCFinal implements IFactura{

	@Override
	public void facturar(int cantidad, Producto unProducto, Cliente unCliente, double total) {
		System.out.println("El cliente " + unCliente.toString() + " ha comprado "
				+ cantidad + " de " + unProducto.toString() + " al costo de $"
				+ total*(1+IFactura.iva));
	}

}
