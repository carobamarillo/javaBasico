package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class usoPersona {

	public static void main(String[] args) {
		
		Persona[] lasPersonas = new Persona[2];
		
		lasPersonas[0] = new Empleado2("Fabian", 50000, 2009, 5, 9);
		lasPersonas[1] = new Alumno("Ariel", "Fisica");
		
		for(Persona persona: lasPersonas) {
			
			System.out.println(persona.dameNombre() + "\n" + persona.dameDescripcion());
		}

	}

}

//Clase abstracta
abstract class Persona {
	
	public Persona(String nom) {
		nombre = nom;
	}
	
	//Getters:
	public String dameNombre() {
		return nombre;
	}
	
	//Metodo abstracto:
	public abstract String dameDescripcion();
	
	private String nombre;
	
}


class Empleado2 extends Persona{
	//Metodo constructor
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom);
		
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno , mes-1, dia);
		altaContrato = calendario.getTime();
				
	}
	
	public String dameDescripcion() {
		return "Este empleado tiene un sueldo de " + sueldo;
	}
	
	//Getters
	public final double dameSueldo() {
		return sueldo;
	}
	
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	//Setters
	public void subeSueldo(double porcentaje) {
		
		double aumento = sueldo*porcentaje/100;
		
		sueldo+=aumento;
	}
	
	private double sueldo;
	private Date altaContrato;
}

class Alumno extends Persona {
	
	public  Alumno(String nom, String carr) {
		
		super(nom);
		carrera = carr;
	}
	
	public String dameDescripcion() {
		return "Este alumno esta estudiando: " + carrera;
	}
	
	private String carrera;	
}