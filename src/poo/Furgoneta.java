package poo;

public class Furgoneta extends Coche{
	private int capacidadCarga;
	private int plazasExtra;
	
	public Furgoneta(int plazasExtra, int capacidadCarga) {
		
		super(); //Llamamos al constructor de la clasePadre
		
		this.capacidadCarga = capacidadCarga;
		this.plazasExtra = plazasExtra;
		
		
		
	}
	
	public String dimeDatosFurgoneta() {
		return "Capacidad de carga: " + capacidadCarga +
				"\nY las pazas son : " + plazasExtra;
	}
}
