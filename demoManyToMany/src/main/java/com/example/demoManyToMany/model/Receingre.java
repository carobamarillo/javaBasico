package com.example.demoManyToMany.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="receingre")
public class Receingre {
	
	@Id
	@GeneratedValue
	private long id;
	
	private int qty;
	private String um;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="receta_id")
	private Receta receta;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="ingrediente_id")
	private Ingrediente ingrediente;

	public Receingre() {
		// TODO Auto-generated constructor stub
	}

	
	public Receingre(Receta receta, Ingrediente ingrediente, int qty, String um) {
		super();
		this.qty = qty;
		this.um = um;
		this.receta = receta;
		this.ingrediente = ingrediente;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getUm() {
		return um;
	}

	public void setUm(String um) {
		this.um = um;
	}

	public Receta getReceta() {
		return receta;
	}

	public void setReceta(Receta receta) {
		this.receta = receta;
	}

	public Ingrediente getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}
	
	

}
