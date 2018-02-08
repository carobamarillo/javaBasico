package com.Tp.MVC.Model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Genero {

	@Id
    @GeneratedValue
    private long idGenero;
	
	private String genero;
	
	@Transient
	private ArrayList<Long> listaIdsGenero;

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

	public ArrayList<Long> getListaIdsGenero() {
		return listaIdsGenero;
	}

	public void setListaIdsGenero(ArrayList<Long> listaIdsGenero) {
		this.listaIdsGenero = listaIdsGenero;
	}
	
	
	
}
