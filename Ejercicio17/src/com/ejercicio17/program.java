package com.ejercicio17;

public class program {
	  
	    public static void main(String[] args) {
	  
	  
	    	//Scanner scanner = new Scanner(System.in);
	    	int tamanio = 0;
	    	int longitud = 0;
	        
	        Password listaPassword[]=new Password[tamanio];
	        boolean fortalezaPassword[]=new boolean[tamanio];
	  
	        
	        for(int i=0;i<listaPassword.length;i++){
	            listaPassword[i]=new Password(longitud);
	            fortalezaPassword[i]=listaPassword[i].esFuerte();
	            System.out.println(listaPassword[i].getContraseña()+" "+fortalezaPassword[i]);
	        }
	    }
	  
	}	
	
