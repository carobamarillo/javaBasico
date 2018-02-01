package com.ejercicio14;

public class Program {
	public static void main(String[] args) {			 
		   
		        //Creamos un array de Electrodomesticos
		        Electrodomestico listaElectrodomesticos[]=new Electrodomestico[3];
		   
		        //Asignamos cada una de las posiciones como queramos
		        listaElectrodomesticos[0]=new Electrodomestico(300, "Naranja", 'A', 50);
		        listaElectrodomesticos[1]=new Lavadora(200, 30);
		        listaElectrodomesticos[2]=new Television(500, 80, 'C', "Negro", 30, false);
		        double sumaElectrodomesticos=0;
		        double sumaTelevisiones=0;
		        double sumaLavadoras=0;
		   
		        for(int i=0;i<listaElectrodomesticos.length;i++){
		   
		            if(listaElectrodomesticos[i] instanceof Electrodomestico){
		                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
		            }
		            if(listaElectrodomesticos[i] instanceof Lavadora){
		                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
		            }
		            if(listaElectrodomesticos[i] instanceof Television){
		                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
		            }
		        }
		  
		        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
		        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
		        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
		   
		    }
		   
	}
