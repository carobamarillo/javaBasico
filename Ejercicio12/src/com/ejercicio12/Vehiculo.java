package com.ejercicio12;

import java.util.ArrayList;

public class Vehiculo {
	
	private ArrayList<Vehiculo> listaVehiculos;
	private String tipo;
		
	
	public Vehiculo(String tipo) {
		this.tipo = tipo;
		this.listaVehiculos = new ArrayList<>();
	}
	public ArrayList<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}
	public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
