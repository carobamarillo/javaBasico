package com.ManyToMany.Receta.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Receta {
	
	@Id
	@GeneratedValue
	private long idReceta;
	
	private String nombreReceta;
	
	@Transient //Para no guardar datos en la ddbb
	private ArrayList<Long> listaIdsIngredientes;
	
	@OneToMany(mappedBy = "receta",
			fetch = FetchType.EAGER)
	private List<RecetaIng> listaRecetaIngA;

	public long getIdReceta() {
		return idReceta;
	}

	public void setIdReceta(long idReceta) {
		this.idReceta = idReceta;
	}

	public String getNombreReceta() {
		return nombreReceta;
	}

	public void setNombreReceta(String nombreReceta) {
		this.nombreReceta = nombreReceta;
	}

	public List<RecetaIng> getListaRecetaIngA() {
		return listaRecetaIngA;
	}

	public void setListaRecetaIng(List<RecetaIng> listaRecetaIng) {
		this.listaRecetaIngA = listaRecetaIng;
	}

	public ArrayList<Long> getListaIdsIngredientes() {
		return listaIdsIngredientes;
	}

	public void setListaIdsIngredientes(ArrayList<Long> listaIdsIngredientes) {
		this.listaIdsIngredientes = listaIdsIngredientes;
	}
	
	
}
