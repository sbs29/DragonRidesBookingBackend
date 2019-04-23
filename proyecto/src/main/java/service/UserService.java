package service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.repository;
import entities.Login;

@Service
public class UserService {

	@Autowired
	repository repositorio;

	public Login get(long id) {
		return repositorio.findById(id).get();
	}

	public List<Login> getAll() {
		return (List<Login>) repositorio.findAll();
	}

	public void post(Login nombre) {
		repositorio.save(nombre);
	}

	public void put(Login credencialesLogin, long id) {
		repositorio.findById(id).ifPresent((x) -> {
			credencialesLogin.setId(id);
			repositorio.save(credencialesLogin);
		});
	}

	public void delete(long id) {
		repositorio.deleteById(id);
	}

}
