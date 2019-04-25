package com.example.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.entities.Flight;
import com.example.proyecto.repository.FlightsRepository;

@Service
public class FlightsService extends AbstractService<Flight>{
	
	@Autowired
	public void setFlightsRepository(FlightsRepository flightsRepository) {
		super.setRepository((CrudRepository<Flight, Long>) flightsRepository);

	}
}
