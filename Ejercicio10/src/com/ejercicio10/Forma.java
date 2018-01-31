package com.ejercicio10;

public abstract class Forma {
	protected String color;
	
	public Forma(){
		
	}
	
	public Forma(String color){
		this.color = color;
	}
	
	public abstract void CalcularArea();
	public abstract void CalcularPerimetro();
}
