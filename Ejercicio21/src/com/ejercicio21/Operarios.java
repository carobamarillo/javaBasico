package com.ejercicio21;

import java.util.Scanner;

public class Operarios {

	private int[] sueldos;
	
	public Operarios()
    {
        Scanner scanner =new Scanner(System.in);
        
        sueldos=new int[5];
        for(int f=0;f<5;f++) {
            System.out.println("Ingrese sueldo operario: ");
            sueldos[f]=scanner.nextInt();
        }	
    }
	
    public void listaSueldoOperarios() {
    	System.out.println("Lista de sueldos\n");
        for(int f=0;f<5;f++) {
        	System.out.print("Sueldo operario : $");
            System.out.println(sueldos[f]);
        }
    }

}