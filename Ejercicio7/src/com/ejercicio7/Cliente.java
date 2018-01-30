package com.ejercicio7;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private Banco banco;
	private ArrayList<CuentaBancaria> listadeCuentasBancarias;
	private ArrayList<TarjetaDeDebito> listaDeTarjetasDebito;
	
	public Cliente(String nombre, Banco banco){
		this.nombre = nombre;
		this.banco = banco;
		
		banco.getListadeClientes().add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<CuentaBancaria> getListadeCuentasBancarias() {
		return listadeCuentasBancarias;
	}

	public void setListadeCuentasBancarias(ArrayList<CuentaBancaria> listadeCuentasBancarias) {
		this.listadeCuentasBancarias = listadeCuentasBancarias;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public ArrayList<TarjetaDeDebito> getListaDeTarjetasDebito() {
		return listaDeTarjetasDebito;
	}

	public void setListaDeTarjetasDebito(ArrayList<TarjetaDeDebito> listaDeTarjetasDebito) {
		this.listaDeTarjetasDebito = listaDeTarjetasDebito;
	}

}
