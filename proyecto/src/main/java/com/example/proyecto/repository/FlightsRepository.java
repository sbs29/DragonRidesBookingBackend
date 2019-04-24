package com.example.proyecto.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Flights;

public interface FlightsRepository extends CrudRepository<Flights, Long>{

}
