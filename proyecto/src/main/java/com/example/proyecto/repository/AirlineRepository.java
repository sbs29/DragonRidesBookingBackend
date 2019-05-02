package com.example.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.drakkar.model.Airline;

@Repository
public interface AirlineRepository extends CrudRepository<Airline, Long> {

}
