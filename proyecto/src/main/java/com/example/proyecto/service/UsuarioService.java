package com.example.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.proyecto.entity.Login;
import com.example.proyecto.repository.LoginRepository;

@Service
public class UsuarioService extends AbstractService<Login> {

	@Autowired
	public void setRepositorio(LoginRepository loginRepository) {
		this.repositorio = (CrudRepository<Login, Long>) loginRepository;

	}

//	@Autowired
//	private Repositorio repositorio;
//
//	public Login get(long id) {
//		return repositorio.findById(id).get();
//	}
//
//	public List<Login> getAll() {
//		return (List<Login>) repositorio.findAll();
//	}
//
//	public void post(Login login) {
//		repositorio.save(login);
//	}
//
//	public void put(Login login, long id) {
//		repositorio.findById(id).ifPresent((x) -> {
//			login.setId(id);
//			repositorio.save(login);
//		});
//	}
//
//	public void delete(long id) {
//		repositorio.deleteById(id);
//	}

//
//	public CredencialesLogin get(long id) {
//		return repositorio.findById(id).get();
//	}
//
//	public List<CredencialesLogin> getAll() {
//		return (List<CredencialesLogin>) repositorio.findAll();
//	}
//
//	public void post(CredencialesLogin nombre) {
//		repositorio.save(nombre);
//	}
//
////	public void put(CredencialesLogin credencialesLogin, long id) {
////		repositorio.findById(id).ifPresent((x) -> {
////			credencialesLogin.setId(id);
////			repositorio.save(credencialesLogin);
////		});
////	}
//
//	public void delete(long id) {
//		repositorio.deleteById(id);
//	}

}
