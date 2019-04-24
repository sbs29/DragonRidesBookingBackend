package com.example.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.proyecto.entity.AbstractEntity;


public interface Repositorio<E extends AbstractEntity> extends CrudRepository<E, Long>{

}
