package com.TpFinal.demoCaro.Model;

import org.springframework.data.repository.CrudRepository;

public interface DaoOrdenRepuesto extends CrudRepository<OrdenRepuesto, Long> {
	
	OrdenRepuesto findByOrdenDeTrabajoAndRepuesto(OrdenDeTrabajo o, Repuesto r);

}
