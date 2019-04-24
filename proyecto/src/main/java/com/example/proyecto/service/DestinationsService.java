package com.example.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.entities.Destination;
import com.example.proyecto.repository.DestinationsRepository;

@Service
public class DestinationsService extends AbstractService<Destination> {

	@Autowired
	public void setDestinationRepository(DestinationsRepository destinationRepository) {
		super.setRepository((CrudRepository<Destination, Long>) destinationRepository);

	}

}