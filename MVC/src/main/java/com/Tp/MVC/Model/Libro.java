package com.Tp.MVC.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Libro {
	
	@Id
	@GeneratedValue
	private long idLibro;
	
	private String nombreLibro;
	
	@OneToMany(mappedBy = "libro",
	fetch = FetchType.EAGER)
	private List<LibroAutor> listaLibroAutor;

	public long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(long idLibro) {
		this.idLibro = idLibro;
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public List<LibroAutor> getListaLibroAutor() {
		return listaLibroAutor;
	}

	public void setListaLibroAutor(List<LibroAutor> listaLibroAutor) {
		this.listaLibroAutor = listaLibroAutor;
	}
	
	
	
	
}
