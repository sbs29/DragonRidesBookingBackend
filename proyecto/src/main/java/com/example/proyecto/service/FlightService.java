package com.example.proyecto.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.drakkar.model.Flight;
import com.example.proyecto.repository.FlightRepository;

@Service
public class FlightService extends AbstractService<Flight> {

	@Autowired
	public void setFlightRepository(FlightRepository flightRepository) {
		super.setRepository((CrudRepository<Flight, Long>) flightRepository);
	}

	public List<Flight> getFlightOrderByPrice(Long originId, Long destinationId, Date fromArrivalDate,
			Date toArrivalDate, Date fromDepartureDate, Date toDepartureDate) {
		return ((FlightRepository) getRepository()).getFlightOrderByPrice(originId, destinationId, fromArrivalDate,
				toArrivalDate, fromDepartureDate, toDepartureDate);
	}
}
