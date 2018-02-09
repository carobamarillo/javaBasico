package com.MagaliCeballos.TPFinal.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoOrdenRepuesto extends CrudRepository<OrdenRepuesto, Long> {

}
