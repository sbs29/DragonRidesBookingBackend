package com.example.proyecto.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.AbstractEntity;

public abstract class AbstractService <E extends AbstractEntity> {

	private CrudRepository<E, Long> repository;

	protected void setRepository(CrudRepository<E, Long> repo) {
		this.repository = repo;
	}

	public E get(long id) {
		return repository.findById(id).get();
	}

	public List<E> getAll() {
		return (List<E>) repository.findAll();
	}

	public void post(E AbstractEntity) {
		repository.save(AbstractEntity);
	}

	public void put(E AbstractEntity, long id) {
		repository.findById(id).ifPresent((x) -> {
			AbstractEntity.setId(id);
			repository.save(AbstractEntity);
		});
	}

	public void delete(long id) {
		repository.deleteById(id);
	}

}
