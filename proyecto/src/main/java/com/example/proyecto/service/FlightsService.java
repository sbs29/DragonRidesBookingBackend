package com.example.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.drakkar.model.Flight;
import com.example.proyecto.repository.FlightRepository;

@Service
public class FlightsService extends AbstractService<Flight>{
	
	@Autowired
	public void setFlightsRepository(FlightRepository flightsRepository) {
		super.setRepository((CrudRepository<Flight, Long>) flightsRepository);

	}
}
