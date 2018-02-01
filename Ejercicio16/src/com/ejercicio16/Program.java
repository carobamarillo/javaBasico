package com.ejercicio16;

public class Program {

	public static void main(String[] args) {
		Libro libro1 = new Libro(1234,555, "Un mundo feliz","Huxley","ljjk");
		Libro libro2 = new Libro(123, 324, "dsf", "sdf", "sfs");
		
		
		
		
		if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
			
			System.out.println(libro1.getTitulo() + " tiene mas paginas que " + libro2.getTitulo());
			
		}else {
			
			System.out.println(libro2.getTitulo() + " tiene mas paginas que " + libro1.getTitulo());
			
		}

	}

}
