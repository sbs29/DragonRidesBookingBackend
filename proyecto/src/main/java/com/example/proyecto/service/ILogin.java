package com.example.proyecto.service;

import java.util.List;

import com.example.proyecto.entity.Login;

public interface ILogin {
	
	public Login get(long id);
	public List<Login> getAll();
	public void post(Login login);
	public void put(Login login,long id);
	public void delete(long id);

}
