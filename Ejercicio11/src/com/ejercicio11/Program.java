package com.ejercicio11;

public class Program {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa(" ");

		Orden orden = new Orden(123, "23/04", "Asus", "No anda cooler", empresa);
		Repuesto repuesto = new Repuesto("ope", 111, empresa);
		
		empresa.mostrarListaOrdenes();
		empresa.mostrarListaRepuestos();

	}

}
