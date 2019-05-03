package com.example.proyecto.repository;


import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.drakkar.model.Flight;
import com.example.drakkar.vo.FlightSearchResult;

@Repository
public interface FlightRepository extends CrudRepository<Flight, Long>{

	@Query("select f from Flight as f where f.origin.id = :originId and f.destination.id = :destinationId and "
			+ "f.arrivalDate > :fromArrivalDate and f.arrivalDate < :toArrivalDate and "
			+ "f.departureDate > :fromDepartureDate and f.departureDate < :toDepartureDate")
	List<Flight> getFlightOrderByPrice(@Param("originId") Long originId, @Param("destinationId")Long destinationId,
			@Param("fromArrivalDate") Date fromArrivalDate, @Param("toArrivalDate") Date toArrivalDate,
			@Param("fromDepartureDate") Date fromDepartureDate, @Param("toDepartureDate") Date toDepartureDate);


	@Query("select new com.example.drakkar.vo.FlightSearchResult(inbound, outbound) "
			+ " from Flight outbound, Flight inbound "
			+ " where outbound.destination.id = inbound.origin.id "
			+ " and (:originId is null or outbound.origin.id = :originId) "
			+ " and (:destinationId is null or outbound.destination.id = :destinationId) "
			+ " and (:departureDateFrom is null ) " //TODO
			+ " and (:departureDateTo is null ) " //TODO
			+ " and (:arrivalDateFrom is null) " //TODO
			+ " and (:arrivalDateTo is null) " ) //TODO
	List<FlightSearchResult> searchFlights(
			@Param("originId") Long originId,
			@Param("destinationId") Long destinationId,
			@Param("departureDateFrom") java.util.Date departureDateFrom,
			@Param("departureDateTo") java.util.Date departureDateTo,
			@Param("arrivalDateFrom") java.util.Date arrivalDateFrom,
			@Param("arrivalDateTo") java.util.Date arrivalDateTo);

}
