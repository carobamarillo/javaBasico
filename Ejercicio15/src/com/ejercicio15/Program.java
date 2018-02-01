package com.ejercicio15;

public class Program {
	  
    public static void main(String[] args) {
  
        
        Serie listaSeries[]=new Serie[2];
        Videojuego listaVideojuegos[]=new Videojuego[2];
  
        
        listaSeries[0]=new Serie();
        listaSeries[1]=new Serie("GOT", "George R. R. Martin ");
        
  
        listaVideojuegos[0]=new Videojuego();
        listaVideojuegos[1]=new Videojuego("Assasin creed 2",4);
  
    
        listaSeries[1].entregar();
        listaVideojuegos[1].entregar();
   
  
        
  
        int entregados=0;
  
        for(int i=0;i<listaSeries.length;i++){
            if(listaSeries[i].isEntregado()){
                entregados+=1;
                listaSeries[i].devolver();
  
            }
            if(listaVideojuegos[i].isEntregado()){
                entregados+=1;
                listaVideojuegos[i].devolver();
            }
        }
  
        System.out.println("Hay "+entregados+" articulos entregados");
  
      

    	}
    }