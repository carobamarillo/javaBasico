package com.ModeloEmpresa.Modelo;

public class Cliente {

	private String _nombre, _apellido;
	private double _deuda;
	// salvo que aclare el cliente arranca como Consumidor final
	private ITipoFacturacion _categoria;

	public Cliente(String nombre, String apellido, Boolean responsable) {
		this._nombre = nombre;
		this._apellido = apellido;
		this._deuda = 0;
		if (responsable) {
			this._categoria = new FacturacionResponsableInscripto();
		} else {
			this._categoria = new FacturacionConsumidorFinal();
		}

	}

	public void subirCategoria() {
		this._categoria = new FacturacionResponsableInscripto();
	}

	public void bajarCategoria() {
		this._categoria = new FacturacionConsumidorFinal();
	}

	@Override
	public String toString() {
		return this._nombre + " " + this._apellido;
	}

	public ITipoFacturacion getCategoria() {
		return this._categoria;
	}

	public double getDeuda() {
		return this._deuda;
	}

	public void comprar(double gasto) {
		this._deuda += gasto;
	}

	public void pagarDeuda() {
		System.out.println("El cliente " + this.toString() + "ha cancelado su deuda de $" + this._deuda);
		this._deuda = 0;
	}
}
