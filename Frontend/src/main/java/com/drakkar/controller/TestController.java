package com.drakkar.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.drakkar.service.DiscountService;

@Controller
public class TestController {

	@Autowired
	private DiscountService service;

	@RequestMapping("/test")
	public String welcome(Map<String, Object> model) {
		model.put("discounts", service.findAll());
		return "discount";
	}

}
