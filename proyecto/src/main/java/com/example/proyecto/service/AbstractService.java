package com.example.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto.entity.AbstractEntity;
import com.example.proyecto.repository.Repositorio;

@Service
public abstract class AbstractService <E extends AbstractEntity> {

	
	Repositorio<E> repositorio;

	public E get(long id) {
		return repositorio.findById(id).get();
	}

	public List<E> getAll() {
		return (List<E>) repositorio.findAll();
	}

	public void post(E AbstractEntity) {
		repositorio.save(AbstractEntity);
	}

	public void put(E AbstractEntity, long id) {
		repositorio.findById(id).ifPresent((x) -> {
			AbstractEntity.setId(id);
			repositorio.save(AbstractEntity);
		});
	}

	public void delete(long id) {
		repositorio.deleteById(id);
	}

}
