package com.example.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.drakkar.model.Discount;

@Repository
public interface DiscountsRepository extends CrudRepository<Discount, Long>{

}
