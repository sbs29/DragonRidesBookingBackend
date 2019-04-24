package com.example.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Airline;

@Repository
public interface AirlinesRepository extends CrudRepository<Airline, Long>{

}
