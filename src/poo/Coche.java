package poo;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private String color;
	int pesoTotal;
	boolean asientosCuero,climatizador;
	
	public Coche() {
		//Estado inicial
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
	}
	
	//Getter:
	
	public String datos() {
		return "La plataforma del vehiculo tiene "+ruedas+" ruedas"
				+ ",mide " + largo/1000 + " metros,cuenta con un ancho de "+ancho+
				" cm y su plataforma pesa "+ pesoPlataforma+" kg ";
	}
	
	//Setter:
	
	public void  cambiaColor(String colorNuevo) {
		color = colorNuevo;		
	}
	
	public String color() {
		return "El color del coche es " + color;
	}
	
	public void asientos(String asientosCuero) {
		if(asientosCuero.equalsIgnoreCase("Si")) {
			this.asientosCuero=true;
		}else {
			this.asientosCuero=false;
		}
	}
	
	public String dimeAsientos() {
		if(asientosCuero) {
			return "El coche tiene asientos de cuero.";
		}else {
			return "El coche no tiene asientos de cuero";
		}
	}
	
	public void configuraClimatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("Si")) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	
	public String dimeClimatizador() {
		if(climatizador) {
			return "El coche tiene climatizador";
		}else {
			return "El coche tiene aire acondicionado";
		}
	}
	
	public String dimePesoCoche() {
		int pesoCarroceria=500;
		
		pesoTotal= pesoPlataforma + pesoCarroceria;
		
		if(asientosCuero) {
			pesoTotal+=50;
		}
		if(climatizador) {
			pesoTotal+=20;
		}
		return "El peso total del coche es "+ pesoTotal;
	}
	
	public int precioCoche() {
		int precioFinal = 10000;
		
		if(asientosCuero) {
			precioFinal+=2000;
		}
		
		if(climatizador) {
			precioFinal+=1500;
		}
		
		return precioFinal;
	}
}
