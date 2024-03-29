package com.OneToMany.DemoCaro.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Direccion {
	@Id
	@GeneratedValue
	private long idDireccion;
	
	private String direccion,nroDireccion,localidad;
	
	//Una direccion tiene muchos pedidos 
	@OneToMany
	private List<Pedido> listaDePedidos;

	public long getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(long idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNroDireccion() {
		return nroDireccion;
	}

	public void setNroDireccion(String nroDireccion) {
		this.nroDireccion = nroDireccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public List<Pedido> getListaDePedidos() {
		return listaDePedidos;
	}

	public void setListaDePedidos(List<Pedido> listaDePedidos) {
		this.listaDePedidos = listaDePedidos;
	}
	
	
	
}
