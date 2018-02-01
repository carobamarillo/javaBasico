package com.ModeloEmpresa.Main;

import com.ModeloEmpresa.Modelo.*;


public class Main {

	public static void main(String[] args) {
		
		Proveedor prove = new Proveedor("El villano", "Multiplas");
		Empresa carbarino = new Empresa("Carbarino.SA", prove);
		
		prove.generarMateriaPrima(100000);
		carbarino.adquirirMateriales(1000000);	
		System.out.println(carbarino.materialDisponible());
		
				
		Cliente cliente1 = carbarino.nuevoCliente("Michael", "Sandonga", false);
		Cliente cliente2 = carbarino.nuevoCliente("Jorge Julio", "Lopez", true);
		Cliente clienteNoRegistrado = new Cliente("Escon", "Dido", false);
		
		Manufactura heladera = new Manufactura("Heladera", "LG", "Ulta Frost", 10000, 50);
		Manufactura horno = new Manufactura("Horno", "Lonvige", "CociMAX", 9000, 10);
		Manufactura ps4 = new Manufactura("PS4", "Sony", "", 14000, 30);
		Servicio servicePC = new Servicio("Servicio tecnico PC", 1000);
		
		carbarino.agregarProductoNuevo(horno);
		carbarino.agregarProductoNuevo(heladera);
		carbarino.agregarProductoNuevo(servicePC);
		carbarino.agregarStock(servicePC, 5);
		carbarino.agregarStock(horno, 2);
		carbarino.agregarStock(heladera, 2);
		
		
		carbarino.vender(horno, cliente2, 2);
		carbarino.vender(heladera, cliente1, 1);
		carbarino.vender(servicePC, cliente2);
		cliente1.subirCategoria();
		carbarino.vender(heladera, cliente1, 1);
		carbarino.cobrar(cliente1);
		carbarino.cobrar(cliente2);
		carbarino.vender(heladera, cliente1, 1);
		carbarino.vender(servicePC, clienteNoRegistrado);
		carbarino.vender(ps4, cliente2, 2);
		
		
	}

}
