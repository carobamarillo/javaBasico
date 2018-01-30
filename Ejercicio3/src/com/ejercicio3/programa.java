package com.ejercicio3;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		
			Ejercicio3 datos = new Ejercicio3(); 
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Ingrese su nombre: ");
			String nombre  = scanner.nextLine();
			datos.setNombre(nombre);
			System.out.println(datos.getNombre());
			
		}

	}

