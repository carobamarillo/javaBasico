package com.Tp.MVC.Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LibroGenero {
	
	@Id
	@GeneratedValue
	private long idLibroGenero;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idLibro")
	private Libro libro;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn (name = "idGenero")
	private Genero genero;

	public long getIdLibroGenero() {
		return idLibroGenero;
	}

	public void setIdLibroGenero(long idLibroGenero) {
		this.idLibroGenero = idLibroGenero;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	

}
