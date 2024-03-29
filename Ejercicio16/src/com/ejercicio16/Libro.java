package com.ejercicio16;

public class Libro {
     

	    private int ISBN, numeroDePaginas;
	    private String titulo, autor, genero;
	 
	    public Libro(int iSBN, int numeroDePaginas, String titulo, String autor, String genero) {
			this.ISBN = iSBN;
			this.numeroDePaginas = numeroDePaginas;
			this.titulo = titulo;
			this.autor = autor;
			this.genero = genero;
		}

		public int getISBN() {
	        return ISBN;
	    }
	 
	    public void setISBN(int ISBN) {
	        this.ISBN = ISBN;
	    }
	 
	    public String getTitulo() {
	        return titulo;
	    }
	 
	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }
	 
	    public String getAutor() {
	        return autor;
	    }
	 
	    public void setAutor(String autor) {
	        this.autor = autor;
	    }
	 
	    public int getNumPaginas() {
	        return numeroDePaginas;
	    }
	 
	    public void setNumPaginas(int numPaginas) {
	        this.numeroDePaginas = numPaginas;
	    }
	     
		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}
	   @Override
	    public String toString(){
	        return "El libro "+titulo+" con ISBN "+ISBN+""
	                + " creado por el autor "+autor
	                + " tiene "+numeroDePaginas+" páginas";
	   }

	     
	}

