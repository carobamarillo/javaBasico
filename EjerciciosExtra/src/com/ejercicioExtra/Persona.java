package com.ejercicioExtra;

import java.util.Scanner;

public class Persona {
	public String nombre;
	public int edad;
	
	
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

	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona() {}

	public void datosPersona(){
		System.out.println("Nombre: " + this.nombre + "\nEdad: " + this.edad);
	}
	
	public void esMayorDeEdad(){
		if(this.edad >= 18){
			
			System.out.println("Es mayor de edad :D");
		}
		else{
			
			System.out.println("No es mayor de edad :(");
			
		}
	}
	
	public void imprimirDatosScanner(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese nombre");
		this.nombre = scanner.nextLine();
		System.out.println("Ingrese edad");
		this.edad = Integer.parseInt(scanner.next());
	}
	
	public static void main(String[] ar){
		
		
		Persona persona1 = new Persona("Pepe", 18);
		
		persona1.datosPersona();
		persona1.esMayorDeEdad();
		
		Persona persona2;
		persona2 = new Persona();
		persona2.imprimirDatosScanner();
		persona2.datosPersona();
		persona2.esMayorDeEdad();
		
		
	}

	
	
	
	

}
