
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
	private int cantidadRepuestos;
	
	@ManyToOne
	@JoinColumn(name = "idOrden")
	private Orden orden;
	
	@ManyToOne
	@JoinColumn(name = "idRepuesto")
	private Repuesto repuesto;
	
	public long getIdOrdenRepuesto() {
		return idOrdenRepuesto;
	}
	public void setIdOrdenRepuesto(long idOrdenRepuesto) {
		this.idOrdenRepuesto = idOrdenRepuesto;
	}
	public Orden getOrden() {
		return orden;
	}
	public void setOrden(Orden orden) {
		this.orden = orden;
	}
	public Repuesto getRepuesto() {
		return repuesto;
	}
	public void setRepuesto(Repuesto repuesto) {
		this.repuesto = repuesto;
	}
	public int getCantidadRepuestos() {
		return cantidadRepuestos;
	}
	public void setCantidadRepuestos(int cantidadRepuestos) {
		this.cantidadRepuestos = cantidadRepuestos;
	}
	
}
