package com.ejercicio18;

public class Servicio extends Producto{

		
		public Servicio(String nombre, double precio) {
			super(nombre, precio);
		}

		@Override
		public int getStock() {return 1;}
		@Override
		public String toString() {return super.nombre;}
		@Override
		public void descontarStock() {}

		
	}