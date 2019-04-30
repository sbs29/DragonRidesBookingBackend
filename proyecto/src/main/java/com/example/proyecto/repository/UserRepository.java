package com.example.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.drakkar.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
