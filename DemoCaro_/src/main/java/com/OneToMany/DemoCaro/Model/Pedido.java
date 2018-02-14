package com.OneToMany.DemoCaro.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Pedido {

	@Id
	@GeneratedValue
	private long idPedido;
	
	private String nombrePedido;
	
	@OneToMany(mappedBy = "pedido")
	private List<Cliente> listaClientes;

	public long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}

	public String getNombrePedido() {
		return nombrePedido;
	}

	public void setNombrePedido(String nombrePedido) {
		this.nombrePedido = nombrePedido;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
}
	
