package com.ejercicio23;

public class Alumno {
	
	private String nombre;
	private int edad;
	
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void imprimirDatos(){
		System.out.println("Alumno\n\n"
				+ "Nombre: " + this.nombre
				+ "\nEdad:  " + this.edad);
	}
	
	public void comprobarEdad(){
		if (this.edad >= 18) {
			System.out.println("Es mayor de edad :D");	
		}else {
			System.out.println("No es mayor de edad :(");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}