package com.example.proyecto.repository;


import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.drakkar.model.Flight;

@Repository
public interface FlightRepository extends CrudRepository<Flight, Long>{

	@Query("select f from Flight as f where f.origin.id = :originId and f.destination.id = :destinationId and "
			+ "f.arrivalDate > :fromArrivalDate and f.arrivalDate < :toArrivalDate and "
			+ "f.departureDate > :fromDepartureDate and f.departureDate < :toDepartureDate")
	List<Flight> getFlightOrderByPrice(@Param("originId") Long originId, @Param("destinationId")Long destinationId,
			@Param("fromArrivalDate") Date fromArrivalDate, @Param("toArrivalDate") Date toArrivalDate,
			@Param("fromDepartureDate") Date fromDepartureDate, @Param("toDepartureDate") Date toDepartureDate);
}
