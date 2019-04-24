package com.example.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.entities.User;
import com.example.proyecto.repository.UserRepository;

@Service
public class UserService extends AbstractService<User> {

	@Autowired
	public void setUserRepository(UserRepository loginRepository) {
		super.setRepository((CrudRepository<User, Long>) loginRepository);

	}

}
