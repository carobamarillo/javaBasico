package poo;
import java.util.*;

public class usoEmpleado {

	public static void main(String[] args) {
		
		/*Empleado empleado1 = new Empleado("Hernan Gonzalez", 85000, 1990, 12, 17);
		Empleado empleado2 = new Empleado("Amelie Hernandez", 89000, 1995, 13, 13);
		Empleado empleado3 = new Empleado("Pablo Martinez", 90000, 1993, 2, 12);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: "+ empleado1.dameNombre() + "\nSueldo: " + empleado1.dameSueldo()
		+ "\nFecha de alta: " + empleado1.dameFechaContrato());
		
		System.out.println("Nombre: "+ empleado2.dameNombre() + "\nSueldo: " + empleado2.dameSueldo()
		+ "\nFecha de alta: " + empleado2.dameFechaContrato());
		
		System.out.println("Nombre: "+ empleado3.dameNombre() + "\nSueldo: " + empleado3.dameSueldo()
		+ "\nFecha de alta: " + empleado3.dameFechaContrato());*/
		
		Jefatura jefeRRHH = new Jefatura("Ruben Gomez", 55000, 1980, 12, 12);
		jefeRRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado("Hernan Gonzalez", 85000, 1990, 12,17);
		misEmpleados[1] = new Empleado("Amelie Hernandez", 89000, 1995, 13, 13);
		misEmpleados[2] = new Empleado("Pablo Martinez", 90000, 1993, 2, 12);
		misEmpleados[3] = new Empleado("Antonio Fernandez");
		misEmpleados[4] = jefeRRHH; //Polimorfismo. Principio de sustitucion.
		misEmpleados[5] = new Jefatura("Ana Maria", 95000, 1990, 12,13);
		//Casting de objetos:
		Jefatura jefaFinanzas = (Jefatura)misEmpleados[5];
		jefaFinanzas.estableceIncentivo(55000);
		
		for(Empleado empleado: misEmpleados) {
			
			empleado.subeSueldo(5);
			
			System.out.println("Nombre: " + empleado.dameNombre() + 
					".Sueldo :" + empleado.dameSueldo() +
					".Fecha de alta: " + empleado.dameFechaContrato());
		}
		
	}

}

class Empleado {
	//metodo constructor
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno , mes-1, dia);
		altaContrato = calendario.getTime();
				
	}
	
	public Empleado(String nom) {
		
		this(nom, 30000, 2000, 01, 01);
	}
	
	//Getters
	public String dameNombre() {
		
		return nombre;
	}
	
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
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}

class Jefatura extends Empleado {
		
	public Jefatura (String nom, double sue, int agno, int mes, int dia) {
			super(nom, sue, agno, mes, dia);
				
		}
	//Getters
	// --> Declaramos y reemplazamos un metodo heredado:
	
	public double dameSueldo2() {
		
		double sueldoJefe = super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	//Setters
	public void estableceIncentivo(double b) {
		
		incentivo = b;
	}
	
	private double incentivo;
	
}
