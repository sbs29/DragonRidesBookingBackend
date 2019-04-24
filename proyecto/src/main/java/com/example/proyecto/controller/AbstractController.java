package com.example.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.AbstractEntity;
import com.example.proyecto.service.AbstractService;

@RestController
public abstract class AbstractController<E extends AbstractEntity> {

	@Autowired
	AbstractService<E> abstractService;

	@GetMapping("/abstractEntity")
	public List<E> getAllAbstractEntity() {
		return (List<E>) abstractService.getAll();
	}

	@GetMapping("/abstractEntity/{id}")
	public AbstractEntity getOne(@PathVariable(value = "id") long id) {
		return abstractService.get(id);
	}

	@PostMapping("/abstractEntity")
	public void add(@RequestBody E e) {
		abstractService.post(e);
	}

	@PutMapping("/abstractEntity/{id}")
	public void update(@RequestBody E e, @PathVariable(value = "id") long id) {
		abstractService.put(e, id);
	}

	@DeleteMapping("/login/{id}")
	public void update(@PathVariable(value = "id") long id) {
		abstractService.delete(id);
	}

}
