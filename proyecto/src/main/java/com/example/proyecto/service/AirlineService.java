package com.example.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.drakkar.model.Airline;
import com.example.proyecto.repository.AirlineRepository;

@Service
public class AirlineService extends AbstractService<Airline> {

	@Autowired
	public void setAirlineRepository(AirlineRepository airlinesRepository) {
		super.setRepository((CrudRepository<Airline, Long>) airlinesRepository);
	}

}