package com.MagaliCeballos.TPFinal.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Propietario {

	@Id
	@GeneratedValue
	private long idPropietario;
	private int dniPropietario, telefono;
	private String nombrePropietario, apellidoPropietario, direccion;
	
	public long getIdPropietario() {
		return idPropietario;
	}
	public void setIdPropietario(long idPropietario) {
		this.idPropietario = idPropietario;
	}
	public int getDniPropietario() {
		return dniPropietario;
	}
	public void setDniPropietario(int dniPropietario) {
		this.dniPropietario = dniPropietario;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getNombrePropietario() {
		return nombrePropietario;
	}
	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}
	public String getApellidoPropietario() {
		return apellidoPropietario;
	}
	public void setApellidoPropietario(String apellidoPropietario) {
		this.apellidoPropietario = apellidoPropietario;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
