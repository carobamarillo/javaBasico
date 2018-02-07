package com.example.demoManyToMany.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ingredientes")
public class Ingrediente {

	@Id
	@GeneratedValue
	private long id;
	
	private String nombreIng;
	private String marca;
	private String urlImage;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "ingrediente")
	private List<Receingre> receingre;
	
	
	public Ingrediente() {
		// TODO Auto-generated constructor stub
		receingre = new ArrayList<Receingre>();
	}
	
	


	public Ingrediente(String nombreIng, String marca) {
		super();
		this.nombreIng = nombreIng;
		this.marca = marca;
		receingre = new ArrayList<Receingre>();
	}




	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombreIng() {
		return nombreIng;
	}


	public void setNombreIng(String nombreIng) {
		this.nombreIng = nombreIng;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public List<Receingre> getReceingre() {
		return receingre;
	}


	public void setReceingre(List<Receingre> receingre) {
		this.receingre = receingre;
	}




	public String getUrlImage() {
		return urlImage;
	}




	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	
	
	
	

}
