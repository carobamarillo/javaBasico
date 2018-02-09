package com.MagaliCeballos.TPFinal.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Orden {
	
	@Id
	@GeneratedValue
	private long idOrden;
	private String patente, detalle, marca, fecha;
	private int cantHorasManoDeObra, total;
	
	@ManyToOne
	@JoinColumn(name = "idEmpleado")
	private Empleado empleado;
	
	@ManyToOne
	@JoinColumn(name = "idPropieatrio")
	private Propietario propietario;
	
	@OneToMany(mappedBy = "orden")
	private List<OrdenRepuesto> ordenRepuestosO;
	
	public long getIdOrden() {
		return idOrden;
	}
	public void setIdOrden(long idOrden) {
		this.idOrden = idOrden;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getCantHorasManoDeObra() {
		return cantHorasManoDeObra;
	}
	public void setCantHorasManoDeObra(int cantHorasManoDeObra) {
		this.cantHorasManoDeObra = cantHorasManoDeObra;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public List<OrdenRepuesto> getOrdenRepuestosO() {
		return ordenRepuestosO;
	}
	public void setOrdenRepuestosO(List<OrdenRepuesto> ordenRepuestosO) {
		this.ordenRepuestosO = ordenRepuestosO;
	}
	
	
	
}