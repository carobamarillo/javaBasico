package com.ejercicio10;

public class Rectangulo extends Forma{
	
	private int largo;
	
	
	public Rectangulo(int largo, String color) {
		super(color);
		this.setLargo(largo);
	}

	@Override
	public void CalcularArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CalcularPerimetro() {
		// TODO Auto-generated method stub
		
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}
	
	

}
