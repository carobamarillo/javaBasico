package com.Caro.TpFinal.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.websocket.OnOpen;


@Entity
public class OrdenRepuesto {
	
	@Id
	@GeneratedValue
	private long idOrdenRepuesto;
	private int cantidadRepuestos;
	
	@ManyToOne
	@JoinColumn(name = "idOrden")
	private OnOpen ordenDeTrabajo;
	
	@ManyToOne
	@JoinColumn(name = "idRepuesto")
	private Repuesto repuesto;

	public long getIdOrdenRepuesto() {
		return idOrdenRepuesto;
	}

	public void setIdOrdenRepuesto(long idOrdenRepuesto) {
		this.idOrdenRepuesto = idOrdenRepuesto;
	}

	public int getCantidadRepuestos() {
		return cantidadRepuestos;
	}

	public void setCantidadRepuestos(int cantidadRepuestos) {
		this.cantidadRepuestos = cantidadRepuestos;
	}

	public OnOpen getOrden() {
		return ordenDeTrabajo;
	}

	public void setOrden(OnOpen orden) {
		this.ordenDeTrabajo = orden;
	}

	public Repuesto getRepuesto() {
		return repuesto;
	}

	public void setRepuesto(Repuesto repuesto) {
		this.repuesto = repuesto;
	}
	
	
}
