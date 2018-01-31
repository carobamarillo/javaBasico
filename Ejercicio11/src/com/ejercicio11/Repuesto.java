package com.ejercicio11;

public class Repuesto {
	private String nombre;
	private int codigo;
	Empresa empresa;
	
	
	public Repuesto(String nombre, int codigo, Empresa empresa) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.empresa = empresa;
		
		empresa.getRepuestos().add(this);
		
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
