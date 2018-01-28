package poo;
import javax.swing.*;

public class usoVehiculo {

	public static void main(String[] args) {
		/*
		//Instanciamos/Ejemplarizamos una clase
		
		Coche Renault = new Coche();
		
		Renault.cambiaColor(JOptionPane.showInputDialog("Introduce color:"));
		
		System.out.println(Renault.color());
		System.out.println(Renault.datos());
		
		Renault.asientos(JOptionPane.showInputDialog("Tiene asientos de Cuero?"));
		
		System.out.println(Renault.dimeAsientos());
		
		Renault.configuraClimatizador(JOptionPane.showInputDialog("Tiene Climatizador?"));
		
		System.out.println(Renault.dimeClimatizador());
		
		System.out.println(Renault.dimePesoCoche());
		
		System.out.print("El precio final es de $" + Renault.precioCoche());*/
		
		Coche miCoche1 = new Coche();
		
		miCoche1.cambiaColor("Naranja");
		
		Furgoneta miFurgoneta1 = new Furgoneta(7, 580);
		
		//Metodos heredados
		miFurgoneta1.cambiaColor("Verde");
		miFurgoneta1.asientos("Si");
		miFurgoneta1.configuraClimatizador("No");
		
		System.out.println(miCoche1.datos() + "\n" + miCoche1.color());
		System.out.println(miFurgoneta1.datos() + "\n" + miFurgoneta1.color() + "\n" + miFurgoneta1.dimeDatosFurgoneta());
		
		
	}

}
