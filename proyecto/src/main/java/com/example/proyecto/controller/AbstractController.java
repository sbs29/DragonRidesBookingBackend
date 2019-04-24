package com.example.proyecto.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entities.AbstractEntity;
import com.example.proyecto.service.AbstractService;

public abstract class AbstractController<E extends AbstractEntity> {

	private AbstractService<E> service;

	protected void setService(AbstractService<E> service) {
		this.service = service;
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, path = "")
	public List<E> getAll() {
		return (List<E>) service.getAll();
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, path = "{id}")
	public AbstractEntity getOne(@PathVariable(value = "id") long id) {
		return service.get(id);
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, path = "")
	public void add(@RequestBody E e) {
		service.post(e);
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT, path = "{id}")
	public void update(@RequestBody E e, @PathVariable(value = "id") long id) {
		service.put(e, id);
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.DELETE, path = "{id}")
	public void update(@PathVariable(value = "id") long id) {
		service.delete(id);
	}

	protected AbstractService<E> getService() {
		return service;
	}


}
