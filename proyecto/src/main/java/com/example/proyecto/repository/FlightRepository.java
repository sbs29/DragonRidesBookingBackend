package com.example.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.drakkar.model.Flight;

@Repository
public interface FlightRepository extends CrudRepository<Flight, Long>{

}
