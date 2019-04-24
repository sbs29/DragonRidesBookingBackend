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

import com.example.proyecto.entity.Login;
import com.example.proyecto.service.UsuarioService;

@RestController
public class UsuarioController <E extends Login> {

//	@Autowired
//	Repositorio repositorio;
	
	@Autowired
	UsuarioService usuarioService;

//	@GetMapping("/login")
//	public List<Login> getAllLogin() {
////		CredencialesLogin e = new CredencialesLogin();
////		e.setId(123L);
////		repositorio.save(e);
//		return usuarioService.getAll();
//	}
//
//	@GetMapping("/login/{id}")
//	public Login getOne(@PathVariable(value = "id") long id) {
//		return usuarioService.get(id);
//	}
//	
//	@PostMapping("/login")
//	public void add(@RequestBody Login login) {
//		usuarioService.post(login);
//	}
//	
//	@PutMapping("/login/{id}")
//	public void update(@RequestBody Login login, @PathVariable(value = "id") long id) {
//		usuarioService.put(login, id);
//	}
//	
//	@DeleteMapping("/login/{id}")
//	public void update(@PathVariable(value = "id") long id) {
//		usuarioService.delete(id);
//	}

}
