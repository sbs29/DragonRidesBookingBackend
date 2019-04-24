package com.example.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Flight;

@Repository
public interface FlightsRepository extends CrudRepository<Flight, Long>{

}
