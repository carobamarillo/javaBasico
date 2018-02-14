package com.TpFinal.demoCaro.Model;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

public interface DaoPropietario extends CrudRepository<Propietario, Long>{
	
	ArrayList<Propietario> findByApellido(String apellido);
	Propietario findByDni(int dni);
	
}
