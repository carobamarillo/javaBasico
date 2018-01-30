package com.ejercicio6;

import java.util.ArrayList;

public class Club {
	private ArrayList<Jugador> listaJugadores;
	private String nombre;
	
	
	
	public Club(String nombre){
		
		this.nombre = nombre;
		this.listaJugadores = new ArrayList<>();
		
	}

	public ArrayList<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void mostrarListaJugadores()
	{
		for (Jugador jugador : listaJugadores) {
			System.out.println("Nombre: " + jugador.getNombre() + "\nSalario: " + jugador.getSalario());
		}
	}
}
