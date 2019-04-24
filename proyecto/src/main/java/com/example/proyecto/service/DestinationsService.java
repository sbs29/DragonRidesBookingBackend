package com.example.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.entities.DestinationsEntity;
import com.example.proyecto.repository.DestinationsRepository;

@Service
public abstract class DestinationsService extends AbstractService<DestinationsEntity> {

	@Autowired
	public void setRepositorio(DestinationsRepository DestinationRepository) {
		super.setRepositorio((CrudRepository<DestinationsEntity, Long>) DestinationRepository);

	}

}