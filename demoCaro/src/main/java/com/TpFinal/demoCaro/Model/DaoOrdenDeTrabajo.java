package com.TpFinal.demoCaro.Model;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

public interface DaoOrdenDeTrabajo extends CrudRepository<OrdenDeTrabajo, Long>{
	
	ArrayList<OrdenDeTrabajo> findByPropietario(Propietario propietario);
	ArrayList<OrdenDeTrabajo> findByCerrada(Boolean cerrada);

}
