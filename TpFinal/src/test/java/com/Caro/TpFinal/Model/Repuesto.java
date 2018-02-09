package com.Caro.TpFinal.Model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Repuesto {
	@Id
	@GeneratedValue
	private long idRepuesto;
	private String nombreRepuesto;
	private float costoRepuesto;
	
	@OneToMany(mappedBy = "repuesto")
	private List<OrdenRepuesto> listaOrdenRepuestosR;

	public long getIdRepuesto() {
		return idRepuesto;
	}

	public void setIdRepuesto(long idRepuesto) {
		this.idRepuesto = idRepuesto;
	}

	public String getNombreRepuesto() {
		return nombreRepuesto;
	}

	public void setNombreRepuesto(String nombreRepuesto) {
		this.nombreRepuesto = nombreRepuesto;
	}

	public float getCostoRepuesto() {
		return costoRepuesto;
	}

	public void setCostoRepuesto(float costoRepuesto) {
		this.costoRepuesto = costoRepuesto;
	}

	public List<OrdenRepuesto> getListaOrdenRepuestosR() {
		return listaOrdenRepuestosR;
	}

	public void setListaOrdenRepuestosR(List<OrdenRepuesto> listaOrdenRepuestosR) {
		this.listaOrdenRepuestosR = listaOrdenRepuestosR;
	}
	
	
}
