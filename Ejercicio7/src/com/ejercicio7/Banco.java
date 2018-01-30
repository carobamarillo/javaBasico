package com.ejercicio7;

import java.util.ArrayList;


public class Banco {
	private ArrayList<Cliente> listadeClientes;
	private String nombre;
	
	public Banco(String nombre){
		this.nombre = nombre;
		this.listadeClientes = new ArrayList<>();
		
	}

	public ArrayList<Cliente> getListadeClientes() {
		return listadeClientes;
	}

	public void setListadeClientes(ArrayList<Cliente> listadeClientes) {
		this.listadeClientes = listadeClientes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void mostrarListaDeClientes()
	{
		for (Cliente cliente : listadeClientes) {
			System.out.println("Nombre: " + cliente.getNombre() + "\nBanco : " + cliente.getBanco().getNombre());
		}
	}

	
	
}
