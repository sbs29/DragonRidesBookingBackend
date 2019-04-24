package com.example.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Discount;

@Repository
public interface DiscountsRepository extends CrudRepository<Discount, Long>{

}
