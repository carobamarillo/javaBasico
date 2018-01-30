package com.ejercicio6;

public class Auto {
	String marca, color;
	Jugador jugador;
	
	public Auto(String marca, String color , Jugador jugador){
		this.marca =  marca;
		this.color = color;
		this.jugador = jugador;
		jugador.getListadeAutos().add(this);
		
	}
}
