package com.example.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Destination;

@Repository
public interface DestinationsRepository extends CrudRepository<Destination, Long>{

}
