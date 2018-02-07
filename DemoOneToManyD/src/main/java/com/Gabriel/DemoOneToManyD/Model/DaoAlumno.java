package com.Gabriel.DemoOneToManyD.Model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoAlumno extends CrudRepository<Alumno, Long> {

}
