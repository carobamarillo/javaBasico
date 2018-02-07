package com.example.demoManyToMany.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoIngrediente extends CrudRepository<Ingrediente, Long> {

}
