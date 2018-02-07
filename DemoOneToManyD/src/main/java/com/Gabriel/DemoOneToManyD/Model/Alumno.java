package com.Gabriel.DemoOneToManyD.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Alumno {

	@Id
	@GeneratedValue
	private long idAlumno;
	
	private String nombreAlumno;
	private String apellido;
	private int dni;
	
	//LA RELACION ES MUCHOS ALUMNOS A UNA SEDE
	@ManyToOne
	//@JOINCOLUMN HACE LA UNION DE EL OBJETO CON EL LA PK DEL OTRO.
	//EL OBJETO SEDE SE REFLEJA EN LA BD COMO UNA FOREIGN KEY Y SE ASIGNA
	//EL VALOR DE LA PK DE LA OTRA TABLA.
	//LE DA EL NOMBRE QUE TENGA EL ID DE LA OTRA TABLA
	@JoinColumn(name = "idSede")
	private Sede sede;

	public long getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(long idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}
	
}
