package com.ejercicio23;

import java.util.Scanner;

public class programAlumno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Alumno alumno1 = new Alumno("pepe", 5);
		alumno1.imprimirDatos();
		alumno1.comprobarEdad();
		
	}

}
