package com.example.proyecto.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto.CredencialesLogin;
import com.example.proyecto.repository.Repositorio;

@Service
public class ControllerService {

	@Autowired
	Repositorio repositorio;

	public CredencialesLogin get(long id) {
		return repositorio.findById(id).get();
	}

	public List<CredencialesLogin> getAll() {
		return (List<CredencialesLogin>) repositorio.findAll();
	}

	public void post(CredencialesLogin nombre) {
		repositorio.save(nombre);
	}

	public void put(CredencialesLogin credencialesLogin, long id) {
		repositorio.findById(id).ifPresent((x) -> {
			credencialesLogin.setId(id);
			repositorio.save(credencialesLogin);
		});
	}

	public void delete(long id) {
		repositorio.deleteById(id);
	}

}
