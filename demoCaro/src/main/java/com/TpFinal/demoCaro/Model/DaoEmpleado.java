package com.TpFinal.demoCaro.Model;

import org.springframework.data.repository.CrudRepository;

public interface DaoEmpleado  extends CrudRepository<Empleado, Long>{
	
	Empleado findByUsuario(Usuario usuario);
}
