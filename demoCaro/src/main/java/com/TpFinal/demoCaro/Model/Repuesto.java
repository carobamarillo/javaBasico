package com.TpFinal.demoCaro.Model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Repuesto {
	
	@Id
	@GeneratedValue
	private long idRepuesto;
	
	private String descripcion;
	private float  costo;
	
	@OneToMany(mappedBy = "ordenDeTrabajo")
	private List<OrdenRepuesto> listaDeOrdenRepuestoR;
	
	public Repuesto(){
		this.listaDeOrdenRepuestoR = new ArrayList<>();
	}

	public long getIdRepuesto() {
		return idRepuesto;
	}

	public void setIdRepuesto(long idRepuesto) {
		this.idRepuesto = idRepuesto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public List<OrdenRepuesto> getListaDeOrdenRepuestoR() {
		return listaDeOrdenRepuestoR;
	}

	public void setListaDeOrdenRepuestoR(List<OrdenRepuesto> listaDeOrdenRepuestoR) {
		this.listaDeOrdenRepuestoR = listaDeOrdenRepuestoR;
	}
}
