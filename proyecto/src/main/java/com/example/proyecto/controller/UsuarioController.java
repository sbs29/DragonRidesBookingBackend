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

import com.example.proyecto.CredencialesLogin;
import com.example.proyecto.repository.Repositorio;
import com.example.proyecto.service.ControllerService;

@RestController
public class UsuarioController {

	@Autowired
	Repositorio repositorio;
	
	@Autowired
	ControllerService controlerService;

	@GetMapping("/credencialesLogin")
	public List<CredencialesLogin> getAllCredencialesLogins() {
//		CredencialesLogin e = new CredencialesLogin();
//		e.setId(123L);
//		repositorio.save(e);
		return (List<CredencialesLogin>) repositorio.findAll();
	}

	@GetMapping("/credencialesLogin/{id}")
	public CredencialesLogin getOne(@PathVariable(value = "id") long id) {
		return repositorio.findById(id).get();
	}
	
	@PostMapping("/credencialesLogin")
	public void add(@RequestBody CredencialesLogin usuario) {
		repositorio.save(usuario);
	}
	
	@PutMapping("/credencialesLogin/{id}")
	public void update(CredencialesLogin credencialesLogin, @PathVariable(value = "id") long id) {
		credencialesLogin.getId();
		repositorio.save(credencialesLogin);
	}
	
	@DeleteMapping("/credencialesLogin/{id}")
	public void update(@PathVariable(value = "id") long id) {
		repositorio.deleteById(id);
	}

}
