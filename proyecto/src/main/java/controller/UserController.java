package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dao.repository;
import entities.Login;
import service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/credencialesLogin")
	public List<Login> getAllCredencialesLogins() {
		return (List<Login>) repositorio.findAll();
	}

	@GetMapping("/credencialesLogin/{id}")
	public Login getOne(@PathVariable(value = "id") long id) {
		return repositorio.findById(id).get();
	}

	@PostMapping("/credencialesLogin")
	public void add(@RequestBody Login usuario) {
		repositorio.save(usuario);
	}

	@PutMapping("/credencialesLogin/{id}")
	public void update(Login credencialesLogin, @PathVariable(value = "id") long id) {
		credencialesLogin.getId();
		repositorio.save(credencialesLogin);
	}

	@DeleteMapping("/credencialesLogin/{id}")
	public void update(@PathVariable(value = "id") long id) {
		repositorio.deleteById(id);
	}

}
