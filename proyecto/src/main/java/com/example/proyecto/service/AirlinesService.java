package com.example.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.entities.AirlinesEntity;
import com.example.proyecto.repository.AirlinesRepository;

@Service
public abstract class AirlinesService extends AbstractService<AirlinesEntity> {

	@Autowired
	public void setRepositorio(AirlinesRepository airlinesRepository) {
		super.setRepositorio((CrudRepository<AirlinesEntity, Long>) airlinesRepository);

	}

}