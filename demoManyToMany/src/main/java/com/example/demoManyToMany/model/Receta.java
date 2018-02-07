package com.example.demoManyToMany.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="receta")
public class Receta {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String nombreReceta;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "receta")
	private List<Receingre> listareceingre;
	

	public Receta() {
		// TODO Auto-generated constructor stub
		this.listareceingre = new ArrayList<Receingre>();
	}


	public Receta(String nombreReceta) {
		super();
		this.nombreReceta = nombreReceta;
		this.listareceingre = new ArrayList<Receingre>();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombreReceta() {
		return nombreReceta;
	}


	public void setNombreReceta(String nombreReceta) {
		this.nombreReceta = nombreReceta;
	}


	public List<Receingre> getListareceingre() {
		return listareceingre;
	}


	public void setListareceingre(List<Receingre> listareceingre) {
		this.listareceingre = listareceingre;
	}
	
	public void agregoingrediente(Receingre receingre)
	{
		this.listareceingre.add(receingre);
	}
	

}
