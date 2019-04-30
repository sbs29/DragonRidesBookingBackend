package com.example.proyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.Booking;
import com.example.entities.Flight;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Long>{

	@Query("select b.flight from Booking as b  where b.flight.id = :flightId")
	List<Flight> getBookingByFlight(@Param("flightId") Long flightId);
	
}
