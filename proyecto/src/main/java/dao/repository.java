package dao;

import org.springframework.data.repository.CrudRepository;

import entities.Login;

public interface repository extends CrudRepository<Login, Long>{

}
