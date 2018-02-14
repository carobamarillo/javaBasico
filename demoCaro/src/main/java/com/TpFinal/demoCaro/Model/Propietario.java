package com.TpFinal.demoCaro.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Propietario {

	@Id
	@GeneratedValue
	private long idPropietario;
	
	private String nombre, apellido, direccion, telefono;
	private int dni;
	
	@OneToMany(mappedBy = "propietario")
	private List<OrdenDeTrabajo> listaDeOrdenDeTrabajo;
	
	public Propietario(){
		this.listaDeOrdenDeTrabajo = new ArrayList<>();
	}

	public long getIdPropietario() {
		return idPropietario;
	}

	public void setIdPropietario(long idPropietario) {
		this.idPropietario = idPropietario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public List<OrdenDeTrabajo> getListaDeOrdenDeTrabajo() {
		return listaDeOrdenDeTrabajo;
	}

	public void setListaDeOrdenDeTrabajo(List<OrdenDeTrabajo> listaDeOrdenDeTrabajo) {
		this.listaDeOrdenDeTrabajo = listaDeOrdenDeTrabajo;
	}
}
