package com.example.demoManyToMany.services;

import com.example.demoManyToMany.model.Ingrediente;

public class Pasos {
	
	private Ingrediente ingrediente;
	private int qty;
	private String um;
	

	public Pasos() {
		// TODO Auto-generated constructor stub
	}


	public Pasos(Ingrediente ingrediente, int qty, String um) {
		super();
		this.ingrediente = ingrediente;
		this.qty = qty;
		this.um = um;
	}


	public Ingrediente getIngrediente() {
		return ingrediente;
	}


	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
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
	
	
	
	

}
