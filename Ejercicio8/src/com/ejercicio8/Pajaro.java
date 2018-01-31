package com.ejercicio8;

public class Pajaro extends Mascotas {
	private int aumentoDeAlimento;
	
	public Pajaro(String nom, float edad, float peso, int aumentoDeAlimento) {
		super(nom, edad, peso);
		this.aumentoDeAlimento = aumentoDeAlimento;
	}
	
	@Override
	public String accion() {
		return  "Desde Arriba todo es bello!" + "Tu edad se disminuyo un 10%";
	}

	@Override
	public void comer(int alimentoIngerido) {
		
		alimentoIngerido += this.aumentoDeAlimento;
		System.out.println("Se ah aumentado el alimento ingerido a un %30");
		
	}
	
}
