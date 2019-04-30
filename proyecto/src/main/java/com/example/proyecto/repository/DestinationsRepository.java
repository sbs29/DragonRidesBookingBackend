package com.example.proyecto.repository;

import java.util.List;

import javax.print.attribute.standard.Destination;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.Destination;
import com.example.entities.Flight;

@Repository
public interface DestinationsRepository extends CrudRepository<com.example.drakkar.model.Destination, Long> {

	@Query("select f from Flight as f where f.origin.id = :originId AND  f.destination.id = :destinationId or :destinationId is not null") // f inner join f.destination dest
	List<Flight> getFlightsByOriginOrderByPriceAsc(@Param("originId") Long originId , @Param("destinationId") Long destinationId);
	


}
