

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Empleado {
	
	@Id
	@GeneratedValue
	private long idEmpleado;
	private String nombreEmpleado, apellidoEmpleado;
	private int dniEmpleado;
	
	@OneToMany(mappedBy = "empleado")
	private List<Orden> listaOrdenEmpleado;
	
	public long getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public String getApellidoEmpleado() {
		return apellidoEmpleado;
	}
	public void setApellidoEmpleado(String apellidoEmpleado) {
		this.apellidoEmpleado = apellidoEmpleado;
	}
	public int getDniEmpleado() {
		return dniEmpleado;
	}
	public void setDniEmpleado(int dniEmpleado) {
		this.dniEmpleado = dniEmpleado;
	}
	public List<Orden> getListaOrdenEmpleado() {
		return listaOrdenEmpleado;
	}
	public void setListaOrdenEmpleado(List<Orden> listaOrdenEmpleado) {
		this.listaOrdenEmpleado = listaOrdenEmpleado;
	}

		
}
