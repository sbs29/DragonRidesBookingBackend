package com.example.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.drakkar.model.Discount;
import com.example.proyecto.service.DiscountService;


@Controller
@RequestMapping("/discount")
public class DiscountController extends AbstractController<Discount> {

	@Autowired
	protected void setDiscountService(DiscountService service) {
		super.setService(service);
	}

}