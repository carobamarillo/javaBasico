package com.ModeloEmpresa.Modelo;

public class Manufactura extends Producto{

	private int _stock;
	private int _materialNecesario;
	private String _marca, _modelo;
	
	public Manufactura(String nombre, String marca, String modelo, double precio, int materialNecesario){
		super (nombre, precio);
		this._marca = marca;
		this._modelo = modelo;
		this._stock = 0;
		this._materialNecesario = materialNecesario;
	}
	
	@Override
	public int sumarStock(int cantidad, int cantMaterial){
		if(cantMaterial>(this._materialNecesario*cantidad)){
			this._stock += cantidad;
			return cantMaterial - _materialNecesario*cantidad;
		}
		else{
			System.out.println("Requiere mas materia pirma para elaborar " + this.toString());
			return cantMaterial;
		}
		
		
	}

	@Override
	public void descontarStock() {
		this._stock--;
		
	}

	@Override
	public int getStock() {
		return this._stock;
	}

	@Override
	public String toString() {
		return super.nombre + " " +this._marca + " " + this._modelo;
	}

	
}
