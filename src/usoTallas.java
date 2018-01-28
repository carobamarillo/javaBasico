//Tipos enumerados --->

import java.util.*;

public class usoTallas {
	
	//enum Talla {MINI, MEDIANO, GRANDE, MUY GRANDE};
	
	enum Talla{
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUYGRANDE("XL");
		
		private Talla(String abreviatura) {
			
			this.abreviatura = abreviatura;
		}
		
		//Getter:
		public String dameAbreviatura() {
			
			return abreviatura;
		}
		
		private String abreviatura;
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Selecciona una talla: Mini, Mediano, Grande o Muy Grande");
		
		String entradaDatos = entrada.next().toUpperCase();
		
		Talla tallaSeleccionada = Enum.valueOf(Talla.class, entradaDatos);
		
		System.out.println("Talla seleccionada: " + tallaSeleccionada);
		System.out.println("Abreviatura: " + tallaSeleccionada.dameAbreviatura());
	}

}
