package com.example.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entities.User;
import com.example.proyecto.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController extends AbstractController<User> {

	@Autowired
	protected void setUserService(UserService service) {
		super.setService(service);
	}

}
