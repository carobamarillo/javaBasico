package com.Tp.MVC.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genero {

	@Id
    @GeneratedValue
    private long idGenero;
	
	private String genero;
	
	@OneToMany(mappedBy = "genero",
			fetch = FetchType.EAGER)
	private List<LibroGenero> listaLibroGenero;
	
	
	public long getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(long idGenero) {
		this.idGenero = idGenero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
