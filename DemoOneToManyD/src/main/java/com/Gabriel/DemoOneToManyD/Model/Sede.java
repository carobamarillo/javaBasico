package com.Gabriel.DemoOneToManyD.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Sede {
	
	@Id
	@GeneratedValue
	private long idSede;
	
	private String nombreSede;
	
	//LA RELACION ES UNA SEDE TIENE MUCHOS ALUMNOS
	//EN EL MAPPEDBY VA EL NOMBRE DE LA PROPIEDAD DE LA CLASE CON LA QUE
	//SE RELACIONA
	@OneToMany(mappedBy = "sede")
	private List<Alumno> listaAlumnos;

	public long getIdSede() {
		return idSede;
	}

	public void setIdSede(long idSede) {
		this.idSede = idSede;
	}

	public String getNombreSede() {
		return nombreSede;
	}

	public void setNombreSede(String nombreSede) {
		this.nombreSede = nombreSede;
	}

	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	
}
