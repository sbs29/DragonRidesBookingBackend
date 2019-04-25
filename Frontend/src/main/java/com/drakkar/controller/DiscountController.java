package com.drakkar.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.drakkar.service.DiscountService;

@Controller
public class DiscountController {

	@Autowired
	private DiscountService service;

	@RequestMapping("/")
	public String Discount(Map<String, Object> model) {
		return "discount";
	}

}
