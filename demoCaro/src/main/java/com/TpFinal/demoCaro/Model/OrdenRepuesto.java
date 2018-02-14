package com.TpFinal.demoCaro.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrdenRepuesto {
	
	@Id
	@GeneratedValue
	private long idOrdenRepuesto;
	
	@ManyToOne
	@JoinColumn( name = "idOrdenDeTrabajo")
	private OrdenDeTrabajo ordenDeTrabajo;
	
	@ManyToOne
	@JoinColumn( name = "idRepuesto")
	private Repuesto repuesto;
	
	private int cantidad;
	private float total;
	public long getIdOrdenRepuesto() {
		return idOrdenRepuesto;
	}
	public void setIdOrdenRepuesto(long idOrdenRepuesto) {
		this.idOrdenRepuesto = idOrdenRepuesto;
	}
	public OrdenDeTrabajo getOrdenDeTrabajo() {
		return ordenDeTrabajo;
	}
	public void setOrdenDeTrabajo(OrdenDeTrabajo ordenDeTrabajo) {
		this.ordenDeTrabajo = ordenDeTrabajo;
	}
	public Repuesto getRepuesto() {
		return repuesto;
	}
	public void setRepuesto(Repuesto repuesto) {
		this.repuesto = repuesto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public void calcularTotal(){
		this.total = this.repuesto.getCosto() * this.cantidad;
	}
	public void aumentarCantidad(int cantidad){
		this.cantidad += cantidad;
	}
	
}
