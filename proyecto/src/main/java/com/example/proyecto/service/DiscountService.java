package com.example.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.drakkar.model.Discount;
import com.example.drakkar.model.Flight;
import com.example.proyecto.repository.DiscountsRepository;

@Service
public class DiscountService extends AbstractService<Discount> {

	@Autowired
	public void setUserRepository(DiscountsRepository discountsRepository) {
		super.setRepository((CrudRepository<Discount, Long>) discountsRepository);

	}

	public Discount getMaxDiscount(Flight outbound, Flight inbound) {
		//TODO
		return null;
	}

}
