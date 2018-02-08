package com.Tp.MVC.Model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Autor {
	
	@Id
	@GeneratedValue
	private long idAutor;
	
	private String nombreAutor;
	
	@Transient
	private ArrayList<Long> listaIdsAutores;

	@ManyToOne
	
	
	
	public long getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(long idAutor) {
		this.idAutor = idAutor;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public ArrayList<Long> getListaIdsAutores() {
		return listaIdsAutores;
	}

	public void setListaIdsAutores(ArrayList<Long> listaIdsAutores) {
		this.listaIdsAutores = listaIdsAutores;
	}
	
	
}
