package com.ModeloEmpresa.Modelo;

public class FacturacionConsumidorFinal implements ITipoFacturacion{

	@Override
	public void facturar(int cantidad, Producto unProducto, Cliente unCliente, double total) {
		System.out.println("El cliente " + unCliente.toString() + " ha comprado "
				+ cantidad + " de " + unProducto.toString() + " al costo de $"
				+ total*(1+this.iva));
	}

}
