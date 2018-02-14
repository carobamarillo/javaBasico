package com.TpFinal.demoCaro.Model;

import org.springframework.data.repository.CrudRepository;

public interface DaoUsuario extends CrudRepository<Usuario, Long> {
	
	Usuario findByUsuarioAndContrasenia(String usuario, String contrasenia);
	
}