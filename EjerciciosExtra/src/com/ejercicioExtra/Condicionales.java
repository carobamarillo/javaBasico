package com.ejercicioExtra;

import java.util.Scanner;

public class Condicionales {
	
	public static int numero1,numero2;	
	
	public static void main(String[] ar){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		numero1 = Integer.parseInt(scanner.next());
		System.out.println("Ingrese otro numero");
		numero2 = Integer.parseInt(scanner.next());
		
		
		if(numero1 > numero2){
			System.out.println("Las suma entre los numeros es: " + (numero1 + numero2) + "\n"
					+ "Y la resta es : " + (numero1 - numero2));
		}else{
			System.out.println("El producto entre los numeros es: " + (numero1*numero2) + "\n"
					+ "Y la division es: " + (numero1/numero2));
		}
	}

}








/*Realizar un programa que lea por teclado dos números, si 
el primero es mayor al segundo informar su suma 
y diferencia, en caso contrario informar el producto y 
la división del primero respecto al segundo.*/