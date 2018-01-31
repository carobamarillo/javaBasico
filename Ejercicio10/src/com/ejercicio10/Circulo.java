package com.ejercicio10;

public class Circulo extends Forma{
	private int radio;
	
	public Circulo(int radio, String color){
		super(color);
		this.setRadio(radio);
	}

	@Override
	public void CalcularArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CalcularPerimetro() {
		// TODO Auto-generated method stub
		
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

}
