package com.example.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.proyecto.entity.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, Long> {

}
