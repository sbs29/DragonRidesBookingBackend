package com.example.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.entities.Discount;
import com.example.proyecto.repository.DiscountsRepository;

@Service
public class DiscountService extends AbstractService<Discount> {

	@Autowired
	public void setUserRepository(DiscountsRepository discountsRepository) {
		super.setRepository((CrudRepository<Discount, Long>) discountsRepository);

	}

}