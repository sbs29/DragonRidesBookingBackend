package com.example.proyecto.service;

import java.util.List;

import javax.print.attribute.standard.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.entities.Destination;
import com.example.entities.Flight;
import com.example.proyecto.repository.DestinationsRepository;

@Service
public class DestinationsService extends AbstractService<com.example.drakkar.model.Destination> {

	@Autowired
	public void setDestinationRepository(DestinationsRepository destinationRepository) {
		super.setRepository((CrudRepository<com.example.drakkar.model.Destination, Long>) destinationRepository);

	}

	public List<Flight> getFlightsByOriginOrderByPriceAsc(Long originId) {
		return ((DestinationsRepository) getRepository()).getFlightsByOriginOrderByPriceAsc(originId);
	}


}