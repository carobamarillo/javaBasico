package com.TpFinal.demoCaro.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class OrdenDeTrabajo implements Comparable<OrdenDeTrabajo> {
	
	private final int precioPorHora = 350;
	
	@Id
	@GeneratedValue
	private long idOrdenDeTrabajo;
	
	private int nroDePatente, horasDeManoDeObra;
	private String marca,detalle, fecha, estado;
	private boolean cerrada;
	private float costoFinal;
	
	@OneToMany(mappedBy = "ordenDeTrabajo")
	private List<OrdenRepuesto> listaDeOrdenRepuestoO;
	
	@ManyToOne
	@JoinColumn(name = "idPropietario")
	private Propietario propietario;
	
	@ManyToOne
	@JoinColumn(name= "idEmpleado")
	private Empleado empleado;
	
	
	public OrdenDeTrabajo(){
		this.listaDeOrdenRepuestoO = new ArrayList<>();
		this.estado = "Pendiente";
		this.cerrada = false;
	}
	
	public long getIdOrdenDeTrabajo() {
		return idOrdenDeTrabajo;
	}

	public void setIdOrdenDeTrabajo(long idOrdenDeTrabajo) {
		this.idOrdenDeTrabajo = idOrdenDeTrabajo;
	}

	public int getNroDePatente() {
		return nroDePatente;
	}

	public void setNroDePatente(int nroDePatente) {
		this.nroDePatente = nroDePatente;
	}

	public int getHorasDeManoDeObra() {
		return horasDeManoDeObra;
	}

	public void setHorasDeManoDeObra(int horasDeManoDeObra) {
		this.horasDeManoDeObra = horasDeManoDeObra;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public List<OrdenRepuesto> getListaDeOrdenRepuestoO() {
		return listaDeOrdenRepuestoO;
	}

	public void setListaDeOrdenRepuestoO(List<OrdenRepuesto> listaDeOrdenRepuestoO) {
		this.listaDeOrdenRepuestoO = listaDeOrdenRepuestoO;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public boolean isCerrada() {
		return cerrada;
	}

	public void cerrar() {
		this.cerrada = true;
		this.estado = "Cerrada";
		this.calcularCostoFinal();
	}

	public float getCostoFinal() {
		return costoFinal;
	}

	public void setCostoFinal(float costoFinal) {
		this.costoFinal = costoFinal;
	}
	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getPrecioPorHora() {
		return precioPorHora;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	private void calcularCostoFinal(){
		float valor = this.horasDeManoDeObra * precioPorHora;
		for(OrdenRepuesto o : this.listaDeOrdenRepuestoO){
			valor += o.getCantidad() * o.getRepuesto().getCosto();
		}
		this.costoFinal = valor;
	}

	@Override
	public int compareTo(OrdenDeTrabajo o) {
		return Boolean.compare(this.cerrada, o.isCerrada());
	}

}
